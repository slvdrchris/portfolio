import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ImageViewer {
	
	String imageFilePath; //to store the path of the image file
		
	//opens the image file specified by imageFilePath
	void imageOpen () {
		URL imageURL = getClass().getResource(imageFilePath); //retrieve the URL of the image file
        try {
            String filePath = imageURL.toURI().getPath(); //convert the URL to a URI and extract the path
            Desktop.getDesktop().open(new File(filePath)); //open the image file using the default application
        } catch (URISyntaxException | IOException ex) { //handle any exceptions that may occur
            ex.printStackTrace();  //print the stack trace if an exception occurs
        }
	}
	
}


public class WorkImages extends ImageViewer{ //WorkImages extends the ImageViewer class, inheriting its methods and variables.

	
	public void openPoster1 () {

		imageFilePath = "/originalImages/poster1.jpg"; //set the imageFilePath to the specified image file path
		imageOpen(); //call the inherited imageOpen() method to open the image
	}
	
	public void openPoster2 () {
		
		imageFilePath = "/originalImages/poster2.jpg";
		imageOpen();
	}
	
	public void openPoster3 () {
		imageFilePath = "/originalImages/poster3.jpg";
		imageOpen();
	}
	
	public void openIllustration1 () {
		imageFilePath = "/originalImages/illustration1.png";
		imageOpen();
	}
	
	public void openIllustration2 () {
		imageFilePath = "/originalImages/illustration2.png";
		imageOpen();
	}
	
	public void openIllustration3 () {
		imageFilePath = "/originalImages/illustration3.jpg";
		imageOpen();
	}
	
}


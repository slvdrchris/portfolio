import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class myPortfolioDark {

	private JFrame frame;
	private JSeparator separatorAbout;
	private JSeparator separatorPoster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myPortfolioDark window = new myPortfolioDark();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myPortfolioDark() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 815, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setBackground(new Color (0,0,0,100));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(-15, -24, 841, 547);
		frame.getContentPane().add(tabbedPane);
		
		JPanel home_0 = new JPanel();
		home_0.setBackground(new Color(0, 0, 0));
		tabbedPane.addTab("New tab", null, home_0, null);
		home_0.setLayout(null);
		
		JLabel txtName = new JLabel("<html>Christopher Robin Salvador");
		txtName.setForeground(new Color(255, 255, 255));
		txtName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		txtName.setBounds(37, 146, 475, 130);
		home_0.add(txtName);
		
		JLabel piggy = new JLabel("New label");
		piggy.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/piggyS.png")));
		piggy.setBounds(183, 366, 783, 431);
		home_0.add(piggy);
		
		JLabel btnProject = new JLabel("WORKS");
		btnProject.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnProject.setForeground(new Color(255, 255, 255));
				btnProject.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProject.setForeground(new Color(0, 255, 255));
				btnProject.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnProject.setForeground(new Color(255, 255, 255));
		btnProject.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnProject.setBounds(243, 22, 87, 34);
		home_0.add(btnProject);
		
		JLabel btnHome = new JLabel("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setForeground(new Color(0, 255, 255));
				btnHome.setBounds(37, 22, 71, 34);
				btnHome.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHome.setForeground(new Color(0, 255, 255));
		btnHome.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnHome.setBounds(37, 22, 71, 34);
		home_0.add(btnHome);
		
		JLabel btnAbout = new JLabel("ABOUT");
		btnAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnAbout.setForeground(Color.WHITE);
				btnAbout.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAbout.setForeground(new Color(0, 255, 255));
				btnAbout.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAbout.setForeground(Color.WHITE);
		btnAbout.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnAbout.setBounds(136, 22, 87, 34);
		home_0.add(btnAbout);
		
		JLabel angriPig = new JLabel("");
		angriPig.setBounds(802, 485, 3, 52);
		home_0.add(angriPig);
		
		JLabel shortDesc = new JLabel("<html> I'm a first-year college student at National University Manila, studying BSIT-MAA. My portfolio showcases my skills and progress in both IT and multimedia arts.");
		shortDesc.setForeground(Color.WHITE);
		shortDesc.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		shortDesc.setBounds(37, 246, 396, 109);
		home_0.add(shortDesc);
		
		JLabel headMove = new JLabel("");
		headMove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //will move up
				piggy.setBounds(167, 202, 783, 431);
				headMove.setBounds(480, 255, 203, 67);
				txtName.setText("Piggy!");
				shortDesc.setText("");
				
				angriPig.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						piggy.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/angri pig.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						piggy.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/piggyS.png")));
					}
				});
				angriPig.setBounds(498, 387, 152, 94);
			}
			@Override
			public void mouseReleased(MouseEvent e) { //will move down
				piggy.setBounds(183, 366, 783, 431);
				headMove.setBounds(486, 432, 203, 67);
				txtName.setText("<html>Christopher Robin Salvador");
				shortDesc.setText("<html> I'm a first-year college student at National University Manila, studying BSIT-MAA. My portfolio showcases my skills and progress in both IT and multimedia arts.");
				
				angriPig.setBounds(780, 485, 25, 14);
			}
		});
		headMove.setBounds(486, 432, 203, 67);
		home_0.add(headMove);
		
		JLabel btnExit = new JLabel("X");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnExit.setForeground(Color.WHITE);
				btnExit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExit.setForeground(new Color(0, 255, 255));
				btnExit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnExit.setBounds(783, 22, 22, 34);
		home_0.add(btnExit);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Hello, my name is");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel_1.setBounds(37, 135, 160, 19);
		home_0.add(lblNewLabel_1);
		
		JLabel nightMode = new JLabel("New label");
		nightMode.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/nightmode.png")));
		nightMode.setBounds(10, 355, 816, 153);
		home_0.add(nightMode);
		
		JLabel btnNightMode = new JLabel("New label");
		btnNightMode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nightMode.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueNightMode.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nightMode.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/nightMode.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				myPortfolioLight lightMode = new myPortfolioLight();
				lightMode.main(null);
				frame.dispose();
			}
		});
		btnNightMode.setBounds(183, 355, 111, 119);
		home_0.add(btnNightMode);
		
		JSeparator separator;
		
		JPanel about_1 = new JPanel();
		about_1.setLayout(null);
		about_1.setBackground(Color.BLACK);
		tabbedPane.addTab("New tab", null, about_1, null);
		
				JLabel fbIcon = new JLabel("");
				fbIcon.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/fbWhite.png")));
				fbIcon.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						 try {
	                    Desktop.getDesktop().browse(new URI("https://www.facebook.com/ThenameisRobin/"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
						 }
					@Override
					public void mouseEntered(MouseEvent e) {
						fbIcon.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/fbBluee.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						fbIcon.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/fbWhite.png")));
					}
				});
				fbIcon.setFont(new Font("Tahoma", Font.PLAIN, 14));
				fbIcon.setForeground(new Color(255, 255, 255));
				fbIcon.setBounds(39, 282, 36, 40);
				about_1.add(fbIcon);
				
				JLabel instaIcon = new JLabel("");
				instaIcon.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						 try {
	                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/piggyart.ig/"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
						 }
					@Override
					public void mouseEntered(MouseEvent e) {
						instaIcon.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/instagramBlue.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						instaIcon.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/instagram.png")));
					}
				});
				instaIcon.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/instagram.png")));
				instaIcon.setForeground(Color.WHITE);
				instaIcon.setFont(new Font("Tahoma", Font.PLAIN, 14));
				instaIcon.setBounds(39, 252, 37, 40);
				about_1.add(instaIcon);
				separatorAbout = new JSeparator();
				separatorAbout.setBounds(406, 114, 368, 23);
				about_1.add(separatorAbout);
				
				JLabel btnProject_1 = new JLabel("WORKS");
				btnProject_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseExited(MouseEvent e) {
						btnProject_1.setForeground(new Color(255, 255, 255));
						btnProject_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						btnProject_1.setForeground(new Color(0, 255, 255));
						btnProject_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						tabbedPane.setSelectedIndex(4);
					}
				});
				btnProject_1.setForeground(Color.WHITE);
				btnProject_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
				btnProject_1.setBounds(243, 22, 87, 34);
				about_1.add(btnProject_1);
				
				JLabel btnHome_1 = new JLabel("HOME");
				btnHome_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseExited(MouseEvent e) {
						btnHome_1.setForeground(Color.WHITE);
						btnHome_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						btnHome_1.setForeground(new Color(0, 255, 255));
						btnHome_1.setBounds(37, 22, 71, 34);
						btnHome_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						tabbedPane.setSelectedIndex(0);
					}
				});
				btnHome_1.setForeground(Color.WHITE);
				btnHome_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
				btnHome_1.setBounds(37, 22, 71, 34);
				about_1.add(btnHome_1);
				
				JLabel btnAbout_1 = new JLabel("ABOUT");
				btnAbout_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseExited(MouseEvent e) {
						btnAbout_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						btnAbout_1.setForeground(new Color(0, 255, 255));
						btnAbout_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						tabbedPane.setSelectedIndex(1);
					}
				});
				btnAbout_1.setForeground(new Color(0, 255, 255));
				btnAbout_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
				btnAbout_1.setBounds(136, 22, 87, 34);
				about_1.add(btnAbout_1);
				
				JLabel btnExit_1 = new JLabel("X");
				btnExit_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseExited(MouseEvent e) {
						btnExit_1.setForeground(Color.WHITE);
						btnExit_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						btnExit_1.setForeground(new Color(0, 255, 255));
						btnExit_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
					}
				});
				btnExit_1.setForeground(Color.WHITE);
				btnExit_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
				btnExit_1.setBounds(783, 22, 22, 34);
				about_1.add(btnExit_1);
				
				JLabel lblNewLabel = new JLabel("About me");
				lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
				lblNewLabel.setForeground(new Color(255, 255, 255));
				lblNewLabel.setBounds(302, 87, 124, 50);
				about_1.add(lblNewLabel);
				
				JLabel lblNewLabel_4 = new JLabel("<html> My name is Christopher Robin Salvador, and I am currently pursuing Bachelor of Science in Information Technology with a specialization in Multimedia Arts and Animation (BSIT-MAA). I chose this course because I believe it will give me a solid understanding of programming and its applications in various industries. I'm excited to gain the necessary skills and knowledge to succeed in this field.");
				lblNewLabel_4.setForeground(new Color(255, 255, 255));
				lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
				lblNewLabel_4.setBounds(302, 132, 467, 143);
				about_1.add(lblNewLabel_4);
				
				JLabel imageSalvador = new JLabel("");
				imageSalvador.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/white-salvador.png")));
				imageSalvador.setBounds(58, 114, 207, 234);
				about_1.add(imageSalvador);
				
				JLabel lblNewLabel_5 = new JLabel("<html>Phone: ");
				lblNewLabel_5.setForeground(new Color(0, 255, 255));
				lblNewLabel_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
				lblNewLabel_5.setBounds(39, 333, 63, 23);
				about_1.add(lblNewLabel_5);
				
				JLabel lblNewLabel_5_2_1 = new JLabel("<html> Email:");
				lblNewLabel_5_2_1.setForeground(new Color(0, 255, 255));
				lblNewLabel_5_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
				lblNewLabel_5_2_1.setBounds(39, 382, 57, 17);
				about_1.add(lblNewLabel_5_2_1);
				
				JLabel aboutDot1 = new JLabel("");
				aboutDot1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
				aboutDot1.setBounds(358, 460, 22, 24);
				about_1.add(aboutDot1);
				
				JLabel aboutDot2 = new JLabel("");
				aboutDot2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						aboutDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						aboutDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						tabbedPane.setSelectedIndex(2);
					}
				});
				aboutDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
				aboutDot2.setBounds(391, 460, 22, 24);
				about_1.add(aboutDot2);
				
				JLabel aboutDot3 = new JLabel("");
				aboutDot3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						aboutDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						aboutDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						tabbedPane.setSelectedIndex(3);
					}
				});
				aboutDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
				aboutDot3.setBounds(423, 460, 22, 24);
				about_1.add(aboutDot3);
				
				JLabel nextSkills = new JLabel("");
				nextSkills.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						tabbedPane.setSelectedIndex(2);
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						nextSkills.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNextblue.png")));
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextSkills.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNext.png")));
					}
				});
				nextSkills.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNext.png")));
				nextSkills.setBounds(455, 460, 22, 24);
				about_1.add(nextSkills);
				
				JTextPane textPane = new JTextPane();
				textPane.setEditable(false);
				textPane.setOpaque(false);
				textPane.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
				textPane.setForeground(new Color(255, 255, 255));
				textPane.setText("09496318779");
				textPane.setBounds(49, 359, 124, 23);
				about_1.add(textPane);
				
				JTextPane txtpnSalvadorchristophergmailcom = new JTextPane();
				txtpnSalvadorchristophergmailcom.setText("salvadorchristopher607@gmail.com");
				txtpnSalvadorchristophergmailcom.setOpaque(false);
				txtpnSalvadorchristophergmailcom.setForeground(Color.WHITE);
				txtpnSalvadorchristophergmailcom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
				txtpnSalvadorchristophergmailcom.setEditable(false);
				txtpnSalvadorchristophergmailcom.setBounds(49, 402, 251, 23);
				about_1.add(txtpnSalvadorchristophergmailcom);
				
				JLabel lblEducation = new JLabel("Education");
				lblEducation.setForeground(Color.WHITE);
				lblEducation.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
				lblEducation.setBounds(302, 272, 124, 50);
				about_1.add(lblEducation);
				
				JSeparator separatorAbout_2 = new JSeparator();
				separatorAbout_2.setBounds(416, 298, 358, 23);
				about_1.add(separatorAbout_2);
				
				JLabel lblNewLabel_6 = new JLabel("New label");
				lblNewLabel_6.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/au-logo.png")));
				lblNewLabel_6.setBounds(312, 333, 68, 66);
				about_1.add(lblNewLabel_6);
				
				JLabel lblNewLabel_6_1 = new JLabel("New label");
				lblNewLabel_6_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/nu-logo.png")));
				lblNewLabel_6_1.setBounds(573, 334, 68, 75);
				about_1.add(lblNewLabel_6_1);
				
				JLabel lblNewLabel_9_4 = new JLabel("<html>Arellano University Apolinario Mabini Campus ");
				lblNewLabel_9_4.setForeground(Color.CYAN);
				lblNewLabel_9_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
				lblNewLabel_9_4.setBounds(386, 338, 175, 23);
				about_1.add(lblNewLabel_9_4);
				
				JLabel lblNewLabel_9_1_2_1 = new JLabel("<html>Elementary - Senior Highschool");
				lblNewLabel_9_1_2_1.setForeground(Color.WHITE);
				lblNewLabel_9_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
				lblNewLabel_9_1_2_1.setBounds(386, 379, 187, 23);
				about_1.add(lblNewLabel_9_1_2_1);
				
				JLabel lblNewLabel_9_1_2_1_1 = new JLabel("(2010-2022)");
				lblNewLabel_9_1_2_1_1.setForeground(Color.WHITE);
				lblNewLabel_9_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
				lblNewLabel_9_1_2_1_1.setBounds(386, 360, 76, 23);
				about_1.add(lblNewLabel_9_1_2_1_1);
				
				JLabel lblNewLabel_9_4_1 = new JLabel("<html>National University Manila ");
				lblNewLabel_9_4_1.setForeground(Color.CYAN);
				lblNewLabel_9_4_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
				lblNewLabel_9_4_1.setBounds(651, 338, 123, 23);
				about_1.add(lblNewLabel_9_4_1);
				
				JLabel lblNewLabel_9_1_2_1_1_1 = new JLabel("(2022-Present)");
				lblNewLabel_9_1_2_1_1_1.setForeground(Color.WHITE);
				lblNewLabel_9_1_2_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
				lblNewLabel_9_1_2_1_1_1.setBounds(651, 360, 102, 23);
				about_1.add(lblNewLabel_9_1_2_1_1_1);
				
				JLabel lblNewLabel_9_1_2_1_1_1_1 = new JLabel("College");
				lblNewLabel_9_1_2_1_1_1_1.setForeground(Color.WHITE);
				lblNewLabel_9_1_2_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
				lblNewLabel_9_1_2_1_1_1_1.setBounds(651, 379, 102, 23);
				about_1.add(lblNewLabel_9_1_2_1_1_1_1);
		
		JPanel skills_2 = new JPanel();
		skills_2.setLayout(null);
		skills_2.setBackground(Color.BLACK);
		tabbedPane.addTab("New tab", null, skills_2, null);
		
		JSeparator separatorAbout_1 = new JSeparator();
		separatorAbout_1.setBounds(370, 114, 404, 23);
		skills_2.add(separatorAbout_1);
		
		JLabel btnProject_1_1 = new JLabel("WORKS");
		btnProject_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnProject_1_1.setForeground(new Color(255, 255, 255));
				btnProject_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProject_1_1.setForeground(new Color(0, 255, 255));
				btnProject_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnProject_1_1.setForeground(Color.WHITE);
		btnProject_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnProject_1_1.setBounds(243, 22, 87, 34);
		skills_2.add(btnProject_1_1);
		
		JLabel btnHome_1_1 = new JLabel("HOME");
		btnHome_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome_1_1.setForeground(new Color(0, 255, 255));
				btnHome_1_1.setBounds(37, 22, 71, 34);
				btnHome_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHome_1_1.setForeground(Color.WHITE);
		btnHome_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnHome_1_1.setBounds(37, 22, 71, 34);
		skills_2.add(btnHome_1_1);
		
		JLabel btnAbout_1_1 = new JLabel("ABOUT");
		btnAbout_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnAbout_1_1.setForeground(Color.WHITE);
				btnAbout_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAbout_1_1.setForeground(new Color(0, 255, 255));
				btnAbout_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAbout_1_1.setForeground(Color.CYAN);
		btnAbout_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnAbout_1_1.setBounds(136, 22, 87, 34);
		skills_2.add(btnAbout_1_1);
		
		JLabel btnExit_1_1 = new JLabel("X");
		btnExit_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnExit_1_1.setForeground(Color.WHITE);
				btnExit_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExit_1_1.setForeground(new Color(0, 255, 255));
				btnExit_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnExit_1_1.setForeground(Color.WHITE);
		btnExit_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnExit_1_1.setBounds(783, 22, 22, 34);
		skills_2.add(btnExit_1_1);
		
		JLabel lblSkills = new JLabel("Skills");
		lblSkills.setForeground(Color.WHITE);
		lblSkills.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblSkills.setBounds(302, 87, 124, 50);
		skills_2.add(lblSkills);
		
		JLabel imageSalvador_1 = new JLabel("");
		imageSalvador_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/white-salvador.png")));
		imageSalvador_1.setBounds(58, 114, 207, 234);
		skills_2.add(imageSalvador_1);
		
		JLabel lblProgramming = new JLabel("Programming");
		lblProgramming.setForeground(Color.WHITE);
		lblProgramming.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblProgramming.setBounds(324, 140, 130, 35);
		skills_2.add(lblProgramming);
		
		JLabel javaIcon = new JLabel("");
		javaIcon.setBounds(344, 169, 71, 80);
		skills_2.add(javaIcon);
		javaIcon.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/java (1).png")));
		
		JLabel lblNewLabel_9 = new JLabel("<html>Java");
		lblNewLabel_9.setBounds(418, 186, 36, 23);
		skills_2.add(lblNewLabel_9);
		lblNewLabel_9.setForeground(new Color(0, 255, 255));
		lblNewLabel_9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		
		JLabel lblNewLabel_7_1 = new JLabel("Digital Art and Design Tools");
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_7_1.setBounds(324, 260, 207, 35);
		skills_2.add(lblNewLabel_7_1);
		
		JLabel pythonIcon = new JLabel("\r\n");
		pythonIcon.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/python.png")));
		pythonIcon.setBounds(578, 186, 71, 64);
		skills_2.add(pythonIcon);
		
		JLabel lblNewLabel_9_1 = new JLabel("<html>10 months of experience");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_9_1.setBounds(417, 202, 151, 23);
		skills_2.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("<html>Python");
		lblNewLabel_9_2.setForeground(Color.CYAN);
		lblNewLabel_9_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_9_2.setBounds(655, 186, 50, 23);
		skills_2.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("2 months of experience");
		lblNewLabel_9_1_1.setForeground(Color.WHITE);
		lblNewLabel_9_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_9_1_1.setBounds(655, 207, 132, 23);
		skills_2.add(lblNewLabel_9_1_1);
		
		JLabel autodeskIcon = new JLabel("");
		autodeskIcon.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/autodesk_sketchbook.png")));
		autodeskIcon.setBounds(344, 302, 71, 71);
		skills_2.add(autodeskIcon);
		
		JLabel lblNewLabel_9_3 = new JLabel("<html>Autodesk Sketchbook");
		lblNewLabel_9_3.setForeground(Color.CYAN);
		lblNewLabel_9_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_9_3.setBounds(418, 306, 132, 23);
		skills_2.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_9_1_2 = new JLabel("<html>5 years of experience");
		lblNewLabel_9_1_2.setForeground(Color.WHITE);
		lblNewLabel_9_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_9_1_2.setBounds(418, 325, 133, 23);
		skills_2.add(lblNewLabel_9_1_2);
		
		JLabel autodeskIcon_1 = new JLabel("");
		autodeskIcon_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/gimpIcon.png")));
		autodeskIcon_1.setBounds(578, 302, 71, 64);
		skills_2.add(autodeskIcon_1);
		
		JLabel lblNewLabel_9_3_2 = new JLabel("<html>GIMP");
		lblNewLabel_9_3_2.setForeground(Color.CYAN);
		lblNewLabel_9_3_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_9_3_2.setBounds(655, 306, 132, 23);
		skills_2.add(lblNewLabel_9_3_2);
		
		JLabel lblNewLabel_9_1_2_2 = new JLabel("<html>2 years of experience");
		lblNewLabel_9_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_9_1_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_9_1_2_2.setBounds(655, 325, 133, 23);
		skills_2.add(lblNewLabel_9_1_2_2);
		
		JLabel dotSkills2 = new JLabel("");
		dotSkills2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
		dotSkills2.setBounds(391, 460, 22, 24);
		skills_2.add(dotSkills2);
		
		JLabel dotSkills1 = new JLabel("");
		dotSkills1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dotSkills1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				dotSkills1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		dotSkills1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		dotSkills1.setBounds(358, 460, 22, 24);
		skills_2.add(dotSkills1);
		
		JLabel dotSkill3 = new JLabel("");
		dotSkill3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dotSkill3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				dotSkill3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		
		dotSkill3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		dotSkill3.setBounds(423, 460, 22, 24);
		skills_2.add(dotSkill3);
		
		JLabel backAbout = new JLabel("");
		backAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				backAbout.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftNextblue.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backAbout.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftnext.png")));
			}
		});
		backAbout.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftnext.png")));
		backAbout.setBounds(324, 460, 22, 24);
		skills_2.add(backAbout);
		
		JLabel nextInterests = new JLabel("");
		nextInterests.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				nextInterests.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNextblue.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextInterests.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNext.png")));
			}
		});
		
		nextInterests.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNext.png")));
		nextInterests.setBounds(455, 460, 22, 24);
		skills_2.add(nextInterests);
		
		JPanel interests_3 = new JPanel();
		interests_3.setLayout(null);
		interests_3.setBackground(Color.BLACK);
		tabbedPane.addTab("New tab", null, interests_3, null);
		
		JSeparator separatorAbout_1_1 = new JSeparator();
		separatorAbout_1_1.setBounds(402, 114, 372, 23);
		interests_3.add(separatorAbout_1_1);
		
		JLabel btnProject_1_1_1 = new JLabel("WORKS");
		btnProject_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnProject_1_1_1.setForeground(new Color(255, 255, 255));
				btnProject_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProject_1_1_1.setForeground(new Color(0, 255, 255));
				btnProject_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		
		btnProject_1_1_1.setForeground(Color.WHITE);
		btnProject_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnProject_1_1_1.setBounds(243, 22, 87, 34);
		interests_3.add(btnProject_1_1_1);
		
		JLabel btnHome_1_1_1 = new JLabel("HOME");
		btnHome_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome_1_1_1.setForeground(new Color(0, 255, 255));
				btnHome_1_1_1.setBounds(37, 22, 71, 34);
				btnHome_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHome_1_1_1.setForeground(Color.WHITE);
		btnHome_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnHome_1_1_1.setBounds(37, 22, 71, 34);
		interests_3.add(btnHome_1_1_1);
		
		JLabel btnAbout_1_1_1 = new JLabel("ABOUT");
		btnAbout_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnAbout_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAbout_1_1_1.setForeground(new Color(0, 255, 255));
				btnAbout_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		
		btnAbout_1_1_1.setForeground(Color.CYAN);
		btnAbout_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnAbout_1_1_1.setBounds(136, 22, 87, 34);
		interests_3.add(btnAbout_1_1_1);
		
		JLabel btnExit_1_1_1 = new JLabel("X");
		btnExit_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnExit_1_1_1.setForeground(Color.WHITE);
				btnExit_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExit_1_1_1.setForeground(new Color(0, 255, 255));
				btnExit_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		
		btnExit_1_1_1.setForeground(Color.WHITE);
		btnExit_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnExit_1_1_1.setBounds(783, 22, 22, 34);
		interests_3.add(btnExit_1_1_1);
		
		JLabel lblInterests = new JLabel("Interests");
		lblInterests.setForeground(Color.WHITE);
		lblInterests.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblInterests.setBounds(302, 87, 124, 50);
		interests_3.add(lblInterests);
		
		JLabel imageSalvador_1_1 = new JLabel("");
		imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/white-salvador.png")));
		imageSalvador_1_1.setBounds(58, 114, 207, 234);
		interests_3.add(imageSalvador_1_1);
		
		JLabel interestsDot2 = new JLabel("");
		interestsDot2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				interestsDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				interestsDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		
		interestsDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		interestsDot2.setBounds(391, 460, 22, 24);
		interests_3.add(interestsDot2);
		
		JLabel interestsDot1 = new JLabel("");
		interestsDot1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				interestsDot1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				interestsDot1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		
		interestsDot1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		interestsDot1.setBounds(358, 460, 22, 24);
		interests_3.add(interestsDot1);
		
		JLabel interestsDot3 = new JLabel("");
		interestsDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
		interestsDot3.setBounds(423, 460, 22, 24);
		interests_3.add(interestsDot3);
		
		JPanel interests1 = new JPanel();
		interests1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				interests1.setBackground(new Color(80, 160, 160));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/interestsImages/light-movie.png")));
				imageSalvador_1_1.setBounds(37, 114, 234, 234);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				interests1.setBackground(new Color(0, 100, 100));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/white-salvador.png")));
				imageSalvador_1_1.setBounds(58, 114, 207, 234);
			}
		});
		interests1.setBackground(new Color(0, 100, 100));
		interests1.setBounds(327, 157, 200, 50);
		interests_3.add(interests1);
		interests1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/video-player.png")));
		lblNewLabel_7.setBounds(10, 0, 40, 50);
		interests1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("<html>Watching movies/series");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(59, 0, 141, 50);
		interests1.add(lblNewLabel_8);
		
		JPanel interests3 = new JPanel();
		interests3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				interests3.setBackground(new Color(80, 160, 160));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/interestsImages/light-drawing.png")));
				imageSalvador_1_1.setBounds(37, 114, 255, 234);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				interests3.setBackground(new Color(0, 100, 100));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/white-salvador.png")));
				imageSalvador_1_1.setBounds(58, 114, 207, 234);
			}
		});
		interests3.setBackground(new Color(0, 255, 255,100));
		interests3.setBounds(327, 231, 200, 50);
		interests_3.add(interests3);
		interests3.setLayout(null);
		
		JLabel lblNewLabel_7_2 = new JLabel("");
		lblNewLabel_7_2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/writing-tool.png")));
		lblNewLabel_7_2.setBounds(10, 0, 40, 50);
		interests3.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_8_1 = new JLabel("<html>Drawing");
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_8_1.setBounds(59, 0, 141, 50);
		interests3.add(lblNewLabel_8_1);
		
		JPanel interests2 = new JPanel();
		interests2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				interests2.setBackground(new Color(80, 160, 160));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/interestsImages/light-music.png")));
				imageSalvador_1_1.setBounds(37, 114, 255, 234);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				interests2.setBackground(new Color(0, 100, 100));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/white-salvador.png")));
				imageSalvador_1_1.setBounds(58, 114, 207, 234);
			}
		});
		interests2.setBackground(new Color(0, 255, 255,100));
		interests2.setBounds(558, 157, 200, 50);
		interests_3.add(interests2);
		interests2.setLayout(null);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("<html>Listening to music");
		lblNewLabel_8_1_2.setForeground(Color.WHITE);
		lblNewLabel_8_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_8_1_2.setBounds(59, 0, 141, 50);
		interests2.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_7_2_3 = new JLabel("");
		lblNewLabel_7_2_3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/music.png")));
		lblNewLabel_7_2_3.setBounds(13, 0, 40, 50);
		interests2.add(lblNewLabel_7_2_3);
		
		JPanel interests4 = new JPanel();
		interests4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				interests4.setBackground(new Color(80, 160, 160));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/interestsImages/light-games.png")));
				imageSalvador_1_1.setBounds(37, 102, 234, 270);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				interests4.setBackground(new Color(0, 100, 100));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/white-salvador.png")));
				imageSalvador_1_1.setBounds(58, 114, 207, 234);
			}
		});
		interests4.setBackground(new Color(0, 255, 255,100));
		interests4.setBounds(558, 231, 200, 50);
		interests_3.add(interests4);
		interests4.setLayout(null);
		
		JLabel lblNewLabel_8_1_3 = new JLabel("<html>Playing games");
		lblNewLabel_8_1_3.setForeground(Color.WHITE);
		lblNewLabel_8_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_8_1_3.setBounds(59, 0, 141, 50);
		interests4.add(lblNewLabel_8_1_3);
		
		JLabel lblNewLabel_7_2_2 = new JLabel("");
		lblNewLabel_7_2_2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/games.png")));
		lblNewLabel_7_2_2.setBounds(13, 0, 40, 50);
		interests4.add(lblNewLabel_7_2_2);
		
		JPanel interests5 = new JPanel();
		interests5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				interests5.setBackground(new Color(80, 160, 160));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/interestsImages/light-pets.png")));
				imageSalvador_1_1.setBounds(37, 114, 234, 242);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				interests5.setBackground(new Color(0, 100, 100));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/white-salvador.png")));
				imageSalvador_1_1.setBounds(58, 114, 207, 234);
			}
		});
		interests5.setBackground(new Color(0, 255, 255,100));
		interests5.setBounds(327, 306, 200, 50);
		interests_3.add(interests5);
		interests5.setLayout(null);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("<html>Dogs and cats");
		lblNewLabel_8_1_1.setForeground(Color.WHITE);
		lblNewLabel_8_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_8_1_1.setBounds(59, 0, 141, 50);
		interests5.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("");
		lblNewLabel_7_2_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/animal-care.png")));
		lblNewLabel_7_2_1.setBounds(13, 0, 40, 50);
		interests5.add(lblNewLabel_7_2_1);
		
		JPanel interests6 = new JPanel();
		interests6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				interests6.setBackground(new Color(80, 160, 160));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/interestsImages/light-craft.png")));
				imageSalvador_1_1.setBounds(37, 98, 234, 279);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				interests6.setBackground(new Color(0, 100, 100));
				imageSalvador_1_1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/white-salvador.png")));
				imageSalvador_1_1.setBounds(58, 114, 207, 234);
			}
		});
		interests6.setBackground(new Color(0, 255, 255,100));
		interests6.setBounds(558, 306, 200, 50);
		interests_3.add(interests6);
		interests6.setLayout(null);
		
		JLabel lblNewLabel_8_1_4 = new JLabel("Crafting");
		lblNewLabel_8_1_4.setForeground(Color.WHITE);
		lblNewLabel_8_1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_8_1_4.setBounds(59, 0, 141, 50);
		interests6.add(lblNewLabel_8_1_4);
		
		JLabel lblNewLabel_7_2_4 = new JLabel("");
		lblNewLabel_7_2_4.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/origami.png")));
		lblNewLabel_7_2_4.setBounds(13, 0, 40, 50);
		interests6.add(lblNewLabel_7_2_4);
		
		JLabel backSkills = new JLabel("");
		backSkills.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				backSkills.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftNextblue.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backSkills.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftnext.png")));
			}
		});
		
		backSkills.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftnext.png")));
		backSkills.setBounds(324, 460, 22, 24);
		interests_3.add(backSkills);
		
		JPanel poster_4 = new JPanel();
		poster_4.setLayout(null);
		poster_4.setBackground(Color.BLACK);
		tabbedPane.addTab("New tab", null, poster_4, null);
		
		JLabel btnProject_2 = new JLabel("WORKS");
		btnProject_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnProject_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProject_2.setForeground(new Color(0, 255, 255));
				btnProject_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnProject_2.setForeground(new Color(0, 255, 255));
		btnProject_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnProject_2.setBounds(243, 22, 92, 34);
		poster_4.add(btnProject_2);
		
		JLabel btnHome_2 = new JLabel("HOME");
		btnHome_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome_2.setForeground(Color.WHITE);
				btnHome_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome_2.setForeground(new Color(0, 255, 255));
				btnHome_2.setBounds(37, 22, 71, 34);
				btnHome_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHome_2.setForeground(Color.WHITE);
		btnHome_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnHome_2.setBounds(37, 22, 71, 34);
		poster_4.add(btnHome_2);
		
		JLabel btnAbout_2 = new JLabel("ABOUT");
		btnAbout_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnAbout_2.setForeground(Color.WHITE);
				btnAbout_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAbout_2.setForeground(new Color(0, 255, 255));
				btnAbout_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAbout_2.setForeground(Color.WHITE);
		btnAbout_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnAbout_2.setBounds(136, 22, 87, 34);
		poster_4.add(btnAbout_2);
		
		JLabel btnNextIllus = new JLabel("");
		btnNextIllus.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNext.png")));
		btnNextIllus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(5);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNextIllus.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNextblue.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNextIllus.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNext.png")));
			}
		});
		
		btnNextIllus.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNext.png")));
		btnNextIllus.setBounds(455, 460, 22, 24);
		poster_4.add(btnNextIllus);
		
		JLabel btnExit_2 = new JLabel("X");
		btnExit_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnExit_2.setForeground(Color.WHITE);
				btnExit_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExit_2.setForeground(new Color(0, 255, 255));
				btnExit_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnExit_2.setForeground(Color.WHITE);
		btnExit_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnExit_2.setBounds(783, 22, 22, 34);
		poster_4.add(btnExit_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setVisible(false);
		panel_4.setBackground(new Color(0, 100, 100,150));
		panel_4.setBounds(47, 139, 236, 296);
		poster_4.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setVisible(false);
		panel_5.setBackground(new Color(0, 100, 100,150));
		panel_5.setBounds(288, 139, 236, 296);
		poster_4.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setVisible(false);
		panel_6.setBackground(new Color(0, 100, 100,150));
		panel_6.setBounds(530, 139, 244, 296);
		poster_4.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel viewP1_1_1 = new JLabel("View Image");
		viewP1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		viewP1_1_1.setForeground(new Color(255, 255, 255));
		viewP1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		viewP1_1_1.setBounds(72, 128, 119, 27);
		panel_6.add(viewP1_1_1);

		JLabel viewP1_1 = new JLabel("View Image");
		viewP1_1.setHorizontalAlignment(SwingConstants.CENTER);
		viewP1_1.setForeground(new Color(255, 255, 255));
		viewP1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		viewP1_1.setBounds(55, 127, 119, 27);
		panel_5.add(viewP1_1);
		
		JLabel viewP1 = new JLabel("View Image");
		viewP1.setForeground(new Color(255, 255, 255));
		viewP1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		viewP1.setHorizontalAlignment(SwingConstants.CENTER);
		viewP1.setBounds(53, 129, 119, 27);
		panel_4.add(viewP1);
		
		JLabel zoomP1 = new JLabel("");
		zoomP1.setBounds(20, 67, 294, 385);
		poster_4.add(zoomP1);
		
		JLabel zoomP2 = new JLabel("");
		zoomP2.setBounds(277, 128, 257, 324);
		poster_4.add(zoomP2);
		
		JLabel zoomP3 = new JLabel("");
		zoomP3.setBounds(519, 128, 257, 324);
		poster_4.add(zoomP3);
		
		
		JLabel works1 = new JLabel("");
		works1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/work1.png")));
		works1.setBounds(10, 114, 816, 280);
		poster_4.add(works1);
		
		JSeparator separatorPoster;
		separatorPoster = new JSeparator();
		separatorPoster.setBounds(141, 114, 633, 50);
		poster_4.add(separatorPoster);
		
		JLabel lblNewLabel_3 = new JLabel("Posters");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(54, 88, 92, 50);
		poster_4.add(lblNewLabel_3);
		
		JLabel posterDot3 = new JLabel("");
		posterDot3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				posterDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				posterDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		posterDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		posterDot3.setForeground(Color.WHITE);
		posterDot3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 78));
		posterDot3.setBounds(391, 460, 22, 24);
		poster_4.add(posterDot3);
		
		JLabel poster1 = new JLabel("");
		poster1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				zoomP1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/p1.png")));
				panel_4.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				zoomP1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/blank.png")));
				panel_4.setVisible(false);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				WorkImages viewImage = new WorkImages(); //create an instance of WorkImages class
				viewImage.openPoster1(); //call the openPoster1() method to open a specific image
			}
			
		});
		poster1.setBounds(81, 162, 159, 200);
		poster_4.add(poster1);
		
		JLabel poster2 = new JLabel("");
		poster2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				zoomP2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/p2.png")));
				panel_5.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				zoomP2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/blank.png")));
				panel_5.setVisible(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				WorkImages viewImage = new WorkImages();
				viewImage.openPoster2();
			}
		});
		poster2.setBounds(324, 162, 164, 200);
		poster_4.add(poster2);
		
		JLabel poster3 = new JLabel("");
		poster3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				zoomP3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/p3.png")));
				panel_6.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				zoomP3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/blank.png")));
				panel_6.setVisible(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				WorkImages viewImage = new WorkImages();
				viewImage.openPoster3();
			}
		});
		poster3.setBounds(573, 162, 164, 206);
		poster_4.add(poster3);
		
		JLabel posterDot2 = new JLabel("");
		posterDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
		posterDot2.setForeground(Color.WHITE);
		posterDot2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 78));
		posterDot2.setBounds(358, 460, 22, 24);
		poster_4.add(posterDot2);
		
		JLabel posterDot4 = new JLabel("");
		posterDot4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				posterDot4.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				posterDot4.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(6);
			}
		});
		posterDot4.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		posterDot4.setForeground(Color.WHITE);
		posterDot4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 78));
		posterDot4.setBounds(423, 460, 22, 24);
		poster_4.add(posterDot4);
		
		JPanel illustration_5 = new JPanel();
		illustration_5.setLayout(null);
		illustration_5.setBackground(Color.BLACK);
		tabbedPane.addTab("New tab", null, illustration_5, null);
		
		JLabel btnProjectIllus = new JLabel("WORKS");
		btnProjectIllus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnProjectIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProjectIllus.setForeground(new Color(0, 255, 255));
				btnProjectIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnProjectIllus.setForeground(Color.CYAN);
		btnProjectIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnProjectIllus.setBounds(243, 22, 87, 34);
		illustration_5.add(btnProjectIllus);
		
		JLabel btnHomeIllus = new JLabel("HOME");
		btnHomeIllus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnHomeIllus.setForeground(Color.WHITE);
				btnHomeIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHomeIllus.setForeground(new Color(0, 255, 255));
				btnHomeIllus.setBounds(37, 22, 71, 34);
				btnHomeIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHomeIllus.setForeground(Color.WHITE);
		btnHomeIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnHomeIllus.setBounds(37, 22, 71, 34);
		illustration_5.add(btnHomeIllus);
		
		JLabel btnAboutIllus = new JLabel("ABOUT");
		btnAboutIllus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnAboutIllus.setForeground(Color.WHITE);
				btnAboutIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAboutIllus.setForeground(new Color(0, 255, 255));
				btnAboutIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAboutIllus.setForeground(Color.WHITE);
		btnAboutIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnAboutIllus.setBounds(136, 22, 87, 34);
		illustration_5.add(btnAboutIllus);
		
		JLabel btnExitillus = new JLabel("X");
		btnExitillus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnExitillus.setForeground(Color.WHITE);
				btnExitillus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExitillus.setForeground(new Color(0, 255, 255));
				btnExitillus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnExitillus.setForeground(Color.WHITE);
		btnExitillus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnExitillus.setBounds(783, 22, 22, 34);
		illustration_5.add(btnExitillus);
		
		JPanel panel_7 = new JPanel();
		panel_7.setVisible(false);
		panel_7.setBackground(new Color(0, 100, 100,150));
		panel_7.setBounds(46, 142, 247, 252);
		illustration_5.add(panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setVisible(false);
		panel_8.setBackground(new Color(0, 100, 100,150));
		panel_8.setBounds(299, 137, 235, 301);
		illustration_5.add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setVisible(false);
		panel_9.setBackground(new Color(0, 100, 100,150));
		panel_9.setBounds(544, 137, 235, 301);
		illustration_5.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel viewP1_2_1_1 = new JLabel("View Image");
		viewP1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		viewP1_2_1_1.setForeground(Color.WHITE);
		viewP1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		viewP1_2_1_1.setBounds(59, 130, 119, 27);
		panel_9.add(viewP1_2_1_1);
		
		JLabel viewP1_2_1 = new JLabel("View Image");
		viewP1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		viewP1_2_1.setForeground(Color.WHITE);
		viewP1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		viewP1_2_1.setBounds(63, 125, 119, 27);
		panel_8.add(viewP1_2_1);
		
		JLabel viewP1_2 = new JLabel("View Image");
		viewP1_2.setHorizontalAlignment(SwingConstants.CENTER);
		viewP1_2.setForeground(Color.WHITE);
		viewP1_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		viewP1_2.setBounds(62, 114, 119, 27);
		panel_7.add(viewP1_2);
		
		JLabel illusZoom1 = new JLabel("");;
		illusZoom1.setBounds(37, 114, 268, 304);
		illustration_5.add(illusZoom1);
		
		JLabel illusZoom2 = new JLabel("");
		illusZoom2.setBounds(294, 126, 247, 323);
		illustration_5.add(illusZoom2);
		
		JLabel illusZoom3 = new JLabel("");
		illusZoom3.setBounds(538, 134, 248, 304);
		illustration_5.add(illusZoom3);
		
		
		JLabel works2 = new JLabel("");
		works2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/work2.png")));
		works2.setBounds(10, 114, 816, 280);
		illustration_5.add(works2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(183, 114, 591, 50);
		illustration_5.add(separator_1);
		
		JLabel labelPoster = new JLabel("Illustrations");
		labelPoster.setForeground(Color.WHITE);
		labelPoster.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelPoster.setBounds(54, 88, 117, 50);
		illustration_5.add(labelPoster);
		
		JLabel illusDot3 = new JLabel("");
		illusDot3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				illusDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			
		});
		illusDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
		illusDot3.setForeground(Color.WHITE);
		illusDot3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 78));
		illusDot3.setBounds(391, 460, 22, 24);
		illustration_5.add(illusDot3);
		
		JLabel illusDot2 = new JLabel("");
		illusDot2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				illusDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				illusDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		illusDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		illusDot2.setForeground(Color.WHITE);
		illusDot2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 78));
		illusDot2.setBounds(358, 460, 22, 24);
		illustration_5.add(illusDot2);
		
		JLabel illusDot4 = new JLabel("");
		illusDot4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				illusDot4.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				illusDot4.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(6);
			}
		});
		illusDot4.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		illusDot4.setForeground(Color.WHITE);
		illusDot4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 78));
		illusDot4.setBounds(423, 460, 22, 24);
		illustration_5.add(illusDot4);
		
		JLabel btnNextGUI = new JLabel("");
		btnNextGUI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(6);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNextGUI.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNextblue.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNextGUI.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNext.png")));
			}
		});
		
		btnNextGUI.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/rightNext.png")));
		btnNextGUI.setBounds(455, 460, 22, 24);
		illustration_5.add(btnNextGUI);
		
		JLabel btnBackPoster = new JLabel("");
		btnBackPoster.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBackPoster.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftNextblue.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBackPoster.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftnext.png")));
			}
		});
		
		btnBackPoster.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftnext.png")));
		btnBackPoster.setBounds(324, 460, 22, 24);
		illustration_5.add(btnBackPoster);
		
		JLabel illus1 = new JLabel("");
		illus1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				illusZoom1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/illus1.png")));
				panel_7.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				illusZoom1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/blank.png")));
				panel_7.setVisible(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				WorkImages viewImage = new WorkImages();
				viewImage.openIllustration1();
			}
		});
		illus1.setBounds(64, 163, 197, 201);
		illustration_5.add(illus1);
		
		JLabel illus2 = new JLabel("");
		illus2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				illusZoom2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/illus2.png")));
				panel_8.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				illusZoom2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/blank.png")));
				panel_8.setVisible(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				WorkImages viewImage = new WorkImages();
				viewImage.openIllustration2();
			}
		});
		illus2.setBounds(321, 160, 166, 204);
		illustration_5.add(illus2);
		
		JLabel illus3 = new JLabel("");
		illus3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				illusZoom3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/illus3.png")));
				panel_9.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				illusZoom3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/blank.png")));
				panel_9.setVisible(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				WorkImages viewImage = new WorkImages();
				viewImage.openIllustration3();
			}
		});
		illus3.setBounds(571, 160, 166, 204);
		illustration_5.add(illus3);

		JPanel javaGUI_6 = new JPanel();
		javaGUI_6.setLayout(null);
		javaGUI_6.setBackground(Color.BLACK);
		tabbedPane.addTab("New tab", null, javaGUI_6, null);
		
		JLabel btnProjectGUI = new JLabel("WORKS");
		btnProjectGUI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnProjectGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProjectGUI.setForeground(new Color(0, 255, 255));
				btnProjectGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnProjectGUI.setForeground(Color.CYAN);
		btnProjectGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnProjectGUI.setBounds(243, 22, 140, 34);
		javaGUI_6.add(btnProjectGUI);
		
		JLabel btnHomeGUI = new JLabel("HOME");
		btnHomeGUI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnHomeGUI.setForeground(Color.WHITE);
				btnHomeGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHomeGUI.setForeground(new Color(0, 255, 255));
				btnHomeGUI.setBounds(37, 22, 71, 34);
				btnHomeGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHomeGUI.setForeground(Color.WHITE);
		btnHomeGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnHomeGUI.setBounds(37, 22, 71, 34);
		javaGUI_6.add(btnHomeGUI);
		
		JLabel btnAboutGUI = new JLabel("ABOUT");
		btnAboutGUI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnAboutGUI.setForeground(Color.WHITE);
				btnAboutGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAboutGUI.setForeground(new Color(0, 255, 255));
				btnAboutGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAboutGUI.setForeground(Color.WHITE);
		btnAboutGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnAboutGUI.setBounds(136, 22, 87, 34);
		javaGUI_6.add(btnAboutGUI);
		
		JLabel btnExitGUI = new JLabel("X");
		btnExitGUI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnExitGUI.setForeground(Color.WHITE);
				btnExitGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExitGUI.setForeground(new Color(0, 255, 255));
				btnExitGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnExitGUI.setForeground(Color.WHITE);
		btnExitGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnExitGUI.setBounds(783, 22, 22, 34);
		javaGUI_6.add(btnExitGUI);
		
		JPanel panel_10 = new JPanel();
		panel_10.setVisible(false);
		panel_10.setBackground(new Color(0, 100, 100,150));
		panel_10.setBounds(485, 149, 300, 242);
		javaGUI_6.add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBackground(new Color(0, 100, 100,150));
		panel.setBounds(485, 149, 300, 242);
		panel.setBounds(54, 154, 426, 237);
		javaGUI_6.add(panel);
		panel.setLayout(null);
		
		JLabel viewP1_2_2_1 = new JLabel("View Link");
		viewP1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		viewP1_2_2_1.setForeground(Color.WHITE);
		viewP1_2_2_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		viewP1_2_2_1.setBounds(152, 104, 119, 27);
		panel.add(viewP1_2_2_1);
		
		JLabel viewP1_2_2 = new JLabel("View Link");
		viewP1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		viewP1_2_2.setForeground(Color.WHITE);
		viewP1_2_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		viewP1_2_2.setBounds(96, 114, 119, 27);
		panel_10.add(viewP1_2_2);
		
		JLabel guiZoom1 = new JLabel("");
		guiZoom1.setBounds(54, 133, 435, 280);
		javaGUI_6.add(guiZoom1);
		
		JLabel guiZoom2 = new JLabel("");
		guiZoom2.setBounds(478, 133, 307, 269);
		javaGUI_6.add(guiZoom2);
		
		
		JLabel works3 = new JLabel("");
		works3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/work3.png")));
		works3.setBounds(10, 114, 816, 280);
		javaGUI_6.add(works3);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(245, 114, 529, 50);
		javaGUI_6.add(separator_1_1);
		
		JLabel labelJavaGUI = new JLabel("Java GUI Systems");
		labelJavaGUI.setForeground(Color.WHITE);
		labelJavaGUI.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		labelJavaGUI.setBounds(54, 88, 193, 50);
		javaGUI_6.add(labelJavaGUI);
		
		JLabel guiDot3 = new JLabel("");
		guiDot3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				guiDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				guiDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		guiDot3.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		guiDot3.setForeground(Color.WHITE);
		guiDot3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 78));
		guiDot3.setBounds(391, 460, 22, 24);
		javaGUI_6.add(guiDot3);
		
		JLabel guiDot2 = new JLabel("");
		guiDot2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				guiDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				guiDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		guiDot2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/circle (1).png")));
		guiDot2.setForeground(Color.WHITE);
		guiDot2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 78));
		guiDot2.setBounds(358, 460, 22, 24);
		javaGUI_6.add(guiDot2);
		
		JLabel guiDot4 = new JLabel("");
		guiDot4.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/images/blueCircle.png")));
		guiDot4.setForeground(Color.WHITE);
		guiDot4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 78));
		guiDot4.setBounds(423, 460, 22, 24);
		javaGUI_6.add(guiDot4);
		
		JLabel btnBackIllus = new JLabel("");
		btnBackIllus.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftnext.png")));
		btnBackIllus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(5);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBackIllus.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftNextblue.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBackIllus.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/icons/leftnext.png")));
			}
		});
		btnBackIllus.setForeground(Color.WHITE);
		btnBackIllus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnBackIllus.setBounds(324, 460, 22, 24);
		javaGUI_6.add(btnBackIllus);
		
		JLabel gui1 = new JLabel("");
		gui1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				guiZoom1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/gui1.png")));
				panel.setVisible(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				guiZoom1.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/blank.png")));
				panel.setVisible(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
	                    Desktop.getDesktop().browse(new URI("https://github.com/slvdrchris/facebookLogin.git"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
			}
			
		});
		gui1.setBounds(83, 165, 352, 196);
		javaGUI_6.add(gui1);
		
		JLabel gui2 = new JLabel("");
		gui2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				guiZoom2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/gui2.png")));
				panel_10.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				guiZoom2.setIcon(new ImageIcon(myPortfolioDark.class.getResource("/projectImages/blank.png")));
				panel_10.setVisible(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
	                    Desktop.getDesktop().browse(new URI("https://github.com/slvdrchris/librarySystem.git"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
			}
		});
		gui2.setBounds(493, 160, 257, 207);
		javaGUI_6.add(gui2);
		
		
		
		
		
		
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}

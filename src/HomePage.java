import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;

import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setUndecorated(true);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		
	
		
		
		
		
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setUndecorated(true);
		setBounds(100, 100, 903, 637);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	

		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		 JLabel lblPassword = new JLabel("Password :");
		 lblPassword.setForeground(new Color(165, 42, 42));
		 lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		 lblPassword.setBackground(new Color(176, 224, 230));
		 lblPassword.setBounds(488, 236, 177, 32);
		 contentPane.add(lblPassword);
		 
		 JLabel lblNewLabel = new JLabel("User Name :");
		 lblNewLabel.setForeground(new Color(128, 0, 0));
		 lblNewLabel.setBackground(new Color(224, 255, 255));
		 lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 20));
		 lblNewLabel.setBounds(488, 160, 193, 32);
		 contentPane.add(lblNewLabel);
		 
		 JLabel lblNewLabel_1 = new JLabel("New User Click Here for Sign Up!!");
		 lblNewLabel_1.setBackground(new Color(245, 222, 179));
		 lblNewLabel_1.setForeground(new Color(47, 79, 79));
		 lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		 lblNewLabel_1.setBounds(510, 427, 316, 32);
		 contentPane.add(lblNewLabel_1);
		
		 JLabel loginMessageLabel = new JLabel("");
			loginMessageLabel.setForeground(new Color(25, 25, 112));
			loginMessageLabel.setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 20));
			loginMessageLabel.setBounds(388, 94, 411, 42);
			contentPane.add(loginMessageLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(255, 218, 185));
		panel.setBounds(32, 51, 304, 484);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ramz8\\Pictures\\Saved Pictures\\ERJ.png"));
		lblNewLabel_2.setBounds(10, 8, 284, 107);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\shopcart.png"));
		lblNewLabel_2_1.setBounds(10, 140, 294, 334);
		panel.add(lblNewLabel_2_1);
		
		JButton exitbtnHome = new JButton("EXIT");
		exitbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitbtnHome.setBounds(714, 10, 85, 32);
		contentPane.add(exitbtnHome);
		
		usernameTextField = new JTextField();
		usernameTextField.setForeground(new Color(0, 0, 0));
		usernameTextField.setBounds(440, 198, 304, 28);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(440, 278, 301, 32);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//final JLabel loginMessageLabel;
				try {
					String name=usernameTextField.getText();
					if(usernameTextField.getText().isBlank() == false && passwordField.getText().isBlank()== false ) {
						DatabaseConnection connectnow=new DatabaseConnection();
						Connection connectDB=connectnow.getConnection();
						String verifyLogin= "select count(1) from login1 where login_name='"+usernameTextField.getText()+"' and login_pwd='"+passwordField.getText()+"'";
						
						try {
							Statement statement=connectDB.createStatement();
							ResultSet rs=statement.executeQuery(verifyLogin);
							while(rs.next()) {
								if(rs.getInt(1)==1) {
									loginMessageLabel.setText("Welcome!");
									System.out.println("Name"+name);
									WelcomePage wc= new WelcomePage(name);
									wc.setVisible(true);
									wc.setUser(name);
								 
									wc.setUndecorated(true);
								dispose();
									
								
									
								}else {
									loginMessageLabel.setText("Invalid Login.. Please try again!!");
								}
								
							}
							
						}catch(Exception e1) {
							System.out.println(e1);
						}
					
						
					}else {
						loginMessageLabel.setText("Please enter username and password");
						
					}
									
					
					
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
				
			}
		});
		
		
		
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setBounds(532, 343, 85, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usernameTextField.setText("");
				passwordField.setText("");
				
			}
		});
		btnNewButton_1.setBounds(693, 343, 85, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegistrationPage().setVisible(true);
				System.out.println("Registration Page");
				dispose();
				
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnSignUp.setBackground(new Color(224, 255, 255));
		btnSignUp.setBounds(689, 459, 128, 42);
		contentPane.add(btnSignUp);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ramz8\\Pictures\\Saved Pictures\\ERJ.png"));
		lblNewLabel_3.setBounds(346, 477, 114, 59);
		contentPane.add(lblNewLabel_3);
		

		
		JLabel userLabel = new JLabel("New label");
		userLabel.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\background_image.png"));
		userLabel.setBounds(334, 25, 500, 536);
		contentPane.add(userLabel);
	}
}

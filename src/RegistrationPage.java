import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField nametextField;
	private JTextField lusernametextField;
	private JTextField mobiletextField;
	private JTextField emailtextField;
	private JTextField addresstextField;
	private JTextField cardtextField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(250, 240, 230));
		panel.setBackground(new Color(106, 90, 205));
		panel.setBounds(10, 10, 857, 86);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New User Registration Form ");
		lblNewLabel.setForeground(new Color(240, 248, 255));
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(0, 5, 451, 71);
		panel.add(lblNewLabel);
		
		JLabel lblname = new JLabel("NAME  ");
		lblname.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblname.setBounds(10, 129, 242, 44);
		contentPane.add(lblname);
		
		JLabel lblusername = new JLabel("LOGIN USER NAME");
		lblusername.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblusername.setBounds(10, 182, 242, 44);
		contentPane.add(lblusername);
		
		JLabel lblLoginPassword = new JLabel("LOGIN PASSWORD");
		lblLoginPassword.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblLoginPassword.setBounds(10, 232, 242, 44);
		contentPane.add(lblLoginPassword);
		
		JLabel lblReenterPassword = new JLabel("RE-ENTER PASSWORD");
		lblReenterPassword.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblReenterPassword.setBounds(10, 290, 242, 44);
		contentPane.add(lblReenterPassword);
		
		JLabel lblMobileNumber = new JLabel("MOBILE NUMBER");
		lblMobileNumber.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblMobileNumber.setBounds(10, 350, 242, 44);
		contentPane.add(lblMobileNumber);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblEmail.setBounds(10, 404, 242, 44);
		contentPane.add(lblEmail);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblAddress.setBounds(10, 468, 242, 44);
		contentPane.add(lblAddress);
		
		JLabel lblMembershipCardNumber = new JLabel("MEMBERSHIP CARD NUMBER\r\n(if any)");
		lblMembershipCardNumber.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblMembershipCardNumber.setBounds(10, 522, 325, 64);
		contentPane.add(lblMembershipCardNumber);
		
		nametextField = new JTextField();
		nametextField.setBounds(339, 129, 304, 44);
		contentPane.add(nametextField);
		nametextField.setColumns(10);
		
		lusernametextField = new JTextField();
		lusernametextField.setColumns(10);
		lusernametextField.setBounds(339, 182, 304, 44);
		contentPane.add(lusernametextField);
		
		mobiletextField = new JTextField();
		mobiletextField.setColumns(10);
		mobiletextField.setBounds(339, 339, 304, 44);
		contentPane.add(mobiletextField);
		
		emailtextField = new JTextField();
		emailtextField.setColumns(10);
		emailtextField.setBounds(339, 393, 304, 44);
		contentPane.add(emailtextField);
		
		addresstextField = new JTextField();
		addresstextField.setColumns(10);
		addresstextField.setBounds(339, 468, 304, 44);
		contentPane.add(addresstextField);
		
		cardtextField = new JTextField();
		cardtextField.setColumns(10);
		cardtextField.setBounds(339, 527, 304, 44);
		contentPane.add(cardtextField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(339, 232, 304, 43);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(339, 290, 304, 43);
		contentPane.add(passwordField_1);
		
		JButton btnregister = new JButton("REGISTER");
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DatabaseConnection connectnow=new DatabaseConnection();
					Connection connectDB=connectnow.getConnection();
					 String Name = nametextField.getText();
		                String userName = lusernametextField.getText();
		                String emailId = emailtextField.getText();
		               String address = addresstextField.getText();
		                String mobileNumber = mobiletextField.getText();
		                int len = mobileNumber.length();
		                String password = passwordField.getText();
		                String password1=passwordField_1.getText();
		               String cardno=	cardtextField.getText();
		               String msg = "" + Name;
					
		               msg += " \n";
		                if(Name.isBlank()|| password.isBlank()) {
		                	JOptionPane.showMessageDialog(null, "Please enter proper input");
		                	System.out.println("Enter all the values correctly!!");
		                }
		                else if (len != 10) {
		                    JOptionPane.showMessageDialog(null, "Enter a valid mobile number");
		                  
		                }
		                	
		                
		                else if(!password.equals(password1)) {
		            	   System.out.println(password);
		            	   System.out.println(password1);
		            	   JOptionPane.showMessageDialog(null, "Please enter Matching password");
		               }else {
                       String query = "INSERT INTO newaccount(name,user_name,password1,mobile_number,email_id,address,cardno) values('" + Name + "','" + userName + "','" + password + "','" +
	                           mobileNumber + "','" + emailId + "','" + address + "','"+cardno+ "')";

	                       PreparedStatement sta = connectDB.prepareStatement(query);
	                       int x = sta.executeUpdate(query);
	                       if (x == 0) {
	                           JOptionPane.showMessageDialog(null, "The record already exist");
	                       } else {
	                    	   DatabaseConnection connectnow1=new DatabaseConnection();
	       					Connection connectDB1=connectnow1.getConnection();
	       					try {
	                           JOptionPane.showMessageDialog(null, "Welcome, " + msg + "Your account is sucessfully created");
	                         //  String query1="insert into login1 l(1.login_name,1.login_pwd,1.id_account) values ('"+ userName +"','"+password+"',(select n.id_account from newaccount n where n.user_name='"+ Name +"'))";
	                          
	                           String query2="select id_account from newaccount where user_name='"+ userName +"'";
	                           Statement statement=connectDB.createStatement();
								ResultSet rs=statement.executeQuery(query2);
								while(rs.next()) {
									int a=rs.getInt(1);
	                       //   String query1="insert into login1 (login_name,login_pwd,id_account) values('"+ userName +"', '"+ password +"' , id_account=(select id_account from newaccount where user_name='"+ userName +"'))";	                     
		                          String query1="insert into login1 (login_name,login_pwd,id_account) values('"+ userName +"', '"+ password +"' ,'"+a+"')";	                     

	                           System.out.println("Record updated!!");
	                           
	                    

	                           
	                     
	                       PreparedStatement st2 = connectDB1.prepareStatement(query1);
	                       int x1 = st2.executeUpdate(query1);
	                       if (x1 == 0) {
	                           JOptionPane.showMessageDialog(null, "The record already exist");
	                       } else 
	                       
	                       JOptionPane.showMessageDialog(null,"Thank you !! Login again by clicking Login ");
	                       }
	       					}
	                       catch(SQLException es) {
	                    	   JOptionPane.showMessageDialog(null,es);
	                       }
	                       }
	                       
		               }        connectDB.close();
				}catch(Exception e1) {
					System.out.println(e1);
					 JOptionPane.showMessageDialog(null, "WRONG DATA"+e1);
				}
		
				
				
			}
		});
		btnregister.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnregister.setBounds(391, 606, 168, 44);
		contentPane.add(btnregister);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 nametextField.setText("");
				 lusernametextField.setText("");
				 mobiletextField.setText("");
				 emailtextField.setText("");
			 addresstextField.setText("");
				 cardtextField.setText("");
			 passwordField.setText("");
				passwordField_1.setText("");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnClear.setBounds(594, 606, 168, 44);
		contentPane.add(btnClear);
		
		JButton btnNewButton = new JButton("Login AGAIN!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new HomePage().setVisible(true);
				System.out.println("Hello");
			dispose();
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(144, 606, 191, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBounds(731, 98, 126, 31);
		contentPane.add(btnNewButton_2);
	}
}

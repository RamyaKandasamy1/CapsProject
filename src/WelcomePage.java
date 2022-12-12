import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class WelcomePage extends JFrame {

	private JPanel contentPane;
	protected static String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					WelcomePage frame = new WelcomePage(name);
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
	int second=0;
	int minute=1;
	
	int lbluser1;
	
	
	ResultSetMetaData rsmd;
	CardLayout cardlayout;
	private JTextField cardnotextField;
	private DefaultTableModel model;
	private JSplitPane splitPane;
	private JPanel panel_1,pane,productpane,MEN,panel;
	private JPanel panel_2;
	private JLabel lblNewLabel,lblpname1, lblNewLabel_3_1,lblprice1,lblamount1,lblNewLabel_3,lblNewLabel_5;
	private JLabel lblimg1;
	private JComboBox comboBox ;
	private JTabbedPane tabbedPane;
	private JButton btnacart1, btnNewButton_3,btnApply;
	private JTextArea textArea1;
	private JLabel lblpname2, lblNewLabel_3_1_1, lblprice2, lblamount2, lblNewLabel_3_2;
	private JLabel lblNewLabel_5_1, lblfinalamt, lbldiscount, lblpayamout;
	private JLabel lblNewLabel_2_1_2_1_1;
	private JRadioButton rdbtnyes,rdbtnNo;

	private JLabel lblcarddisplay,lblNewLabel_2_2,lblNewLabel_2_1_1,lbltimer,lblNewLabel_2_1_1_2,lblsdiscount;


	private JLabel lblNewLabel_2_1_1_2_1,lblNewLabel_2_1_1_2_1_1;
	private  JButton btnPay;
	private JLabel lblNewLabel_2_1_2;
	private JLabel lblNewLabel_2_1_2_1;
	private JTextArea textArea3;
	private JLabel lblimg1_2;
	private JComboBox comboBox_2;
	private JButton btnacart3;
	private JLabel lblNewLabel_5_2;
	private JLabel lblNewLabel_3_3;
	private JLabel lblamount3;
	private JLabel lblprice3;
	private JLabel lblNewLabel_3_1_2;
	private JLabel lblpname3;
	private JButton btnacart2;
	private JComboBox comboBox_1;
	private JLabel lblimg1_1;
	private JTextArea textArea2;
	private JPanel panel_3;
	private JLabel qtylabel1_hidden_1_2;
	private JLabel qtylabel1_hidden_3;
	private JPanel WOMEN;
	private JPanel panel_4;
	private JLabel lblpname4;
	private JLabel lblNewLabel_3_1_3;
	private JLabel lblprice4;
	private JLabel lblamount4;
	private JLabel lblNewLabel_3_4;
	private JLabel lblNewLabel_5_3;
	private JButton btnacart4;
	private JComboBox comboBox_3;
	private JLabel lblimg1_3;
	private JTextArea textArea4;
	private JPanel panel_5;
	private JLabel lblpname5;
	private JLabel lblNewLabel_3_1_4;
	private JLabel lblprice5;
	private JLabel lblNewLabel_3_5;
	private JLabel lblNewLabel_5_4;
	private JButton btnacart5;
	private JComboBox comboBox_4;
	private JLabel lblimg1_4;
	private JTextArea textArea5;
	private JPanel panel_6;
	private JLabel lblpname6;
	private JLabel lblNewLabel_3_1_5;
	private JLabel lblprice6;
	private JLabel lblamount6;
	private JLabel lblNewLabel_3_6;
	private JLabel lblNewLabel_5_5;
	JLabel qtylabel1_hidden;
	JLabel qtylabel1_hidden_1;
	private JButton btnacart6;
	private JComboBox comboBox_5;
	private JLabel lblimg1_5;
	private JTextArea textArea6;
	private JPanel KID;
	private JPanel panel_7;
	private JLabel lblpname7;
	private JLabel lblNewLabel_3_1_6;
	private JLabel lblprice7;
	private JLabel lblamount7;
	private JLabel lblNewLabel_3_7;
	private JLabel lblNewLabel_5_6;
	private JButton btnacart7;
	private JComboBox comboBox_6;
	private JLabel lblNewLabel_1;
	private JTextArea textArea7;
	private JPanel panel_8;
	private JLabel lblpname8;
	private JLabel lblNewLabel_3_1_7;
	private JLabel lblprice8;
	private JLabel lblamount8;
	private JLabel lblNewLabel_3_8;
	private JLabel lblNewLabel_5_7;
	private JButton btnacart8;
	private JComboBox comboBox_7;
	private JLabel lblimg1_7;
	private JTextArea textArea8;
	private JPanel cartpane;
	private JPanel panel_10;
	private JButton btnNewButton_1;
	private JLabel lblTotalAmount;
	private JLabel lblTotalAmount_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_2;
	private JPanel paypane;
	private JPanel panel_12;
	private JPanel panel_13;
	private JLabel lblNewLabel_2;
	private JButton btnpaynow;
	private JPanel updatepane;
	private JButton btnNewButton;
	private JButton btnShopProducts;
	private JLabel pid1;
	private JLabel lbluser;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField textField_total;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Timer timer;
	private String ddSecond;
	//private Container btnCheckout;
	private String ddMinute;
	private JLabel qtylabel1_hidden_2;
	private JLabel qtylabel1_hidden_1_1;
	
	
	public WelcomePage(String name) {
		//int lbluser1=Integer.parseInt(lbluser.getText());
		System.out.println("Name inside welcome :"+name);
		String Welname=name;
	System.out.println("welname :" +Welname);
	//	textField.setText(Welname);
		//lblwelname.setText(name);
	//	String lblWelcome=lblwelname.getText();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.32);
		splitPane.setBounds(23, 10, 913, 628);
		contentPane.add(splitPane);
		
		 panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		splitPane.setLeftComponent(panel_1);
		panel_1.setLayout(null);
		 
		 lblwelname = new JLabel("");
		 lblwelname.setBounds(58, 95, 121, 31);
		 panel_1.add(lblwelname);
		
		 lblNewLabel = new JLabel("WELCOME !!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 63, 207, 37);
		panel_1.add(lblNewLabel);
		
		 pane = new JPanel();
		pane.setBackground(new Color(250, 240, 230));
		splitPane.setRightComponent(pane);
		pane.setLayout(new CardLayout(0, 0));
		
		productpane = new JPanel();
		productpane.setBackground(new Color(255, 240, 245));
		pane.add(productpane, "productpane");
		productpane.setLayout(new CardLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		productpane.add(tabbedPane, "productTab");
		productpane.setBackground(getForeground().white);
		
		 MEN = new JPanel();
		tabbedPane.addTab("            MEN        ", null, MEN, null);
		MEN.setBackground(getForeground().white);
		MEN.setLayout(null);
		
		 panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(10, 22, 629, 172);
		MEN.add(panel);
		panel.setLayout(null);
		 
		 qtylabel1_hidden = new JLabel("");
		 qtylabel1_hidden.setEnabled(false);
		 qtylabel1_hidden.setBounds(317, 84, 80, 13);
		 panel.add(qtylabel1_hidden);
		
		 lblpname1 = new JLabel("New label");
		lblpname1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblpname1.setBounds(0, 140, 173, 32);
		panel.add(lblpname1);
		
		 lblNewLabel_3_1 = new JLabel("Quantity :");
		lblNewLabel_3_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(251, 119, 81, 32);
		panel.add(lblNewLabel_3_1);
		
		lblprice1 = new JLabel("");
		lblprice1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblprice1.setBounds(342, 42, 60, 32);
		panel.add(lblprice1);
		
		lblamount1 = new JLabel("");
		lblamount1.setBounds(501, 59, 118, 18);
		panel.add(lblamount1);
		
		 lblNewLabel_3 = new JLabel("Price :");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(251, 45, 81, 32);
		panel.add(lblNewLabel_3);
		
		 lblNewLabel_5 = new JLabel("Amount");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5.setBounds(500, 10, 102, 21);
		panel.add(lblNewLabel_5);
	// BUTTON 1 ADD TO CART - MEN JACKET	
		btnacart1 = new JButton("Add To Cart");
		btnacart1.addActionListener(new ActionListener() {
			//private AbstractButton qtylabel1_hidden;

			public void actionPerformed(ActionEvent e) {
		int lbluser1=Integer.parseInt(lbluser.getText());
		System.out.println(lbluser1);
				String plabel1=lblpname1.getText();
				System.out.println("Product Name :"+plabel1);
				String product_id=pid1.getText();
				System.out.println("Product ID"+product_id);
				 int Qty1 =comboBox.getSelectedIndex()+1;
				 System.out.println("Quantity"+Qty1);
				int updated_quantity=Integer.parseInt(qtylabel1_hidden.getText())- Qty1;
				 System.out.println("updated_quantity"+updated_quantity);
				 int tot_amount=Integer.parseInt(lblamount1.getText());
				 System.out.println(tot_amount);
				 try {
					 Connection con = DriverManager.getConnection("jdbc:mysql:///capsdb", "root", "root@123");
					 System.out.println("Connection ");
					  String query="INSERT INTO NewOrder (pid,product_name,Qty,price,login_id) values('" + product_id + "',' " + plabel1 + "',' " + Qty1 + "','" + tot_amount + "','" +lbluser1+" ')";
				   //  ResultSet rs= st.executeQuery();
					  System.out.println(query);
					  PreparedStatement sta = con.prepareStatement(query);
				     int x = sta.executeUpdate(query);
				     System.out.println("Inside Statement");
                     if (x == 0) {
                         JOptionPane.showMessageDialog(null, "The record already exist");
                     } else {
                         JOptionPane.showMessageDialog(null,"OrderUpdated");
                         System.out.println(Qty1);
                         String query1="Update NewProduct SET QTY='" +updated_quantity +"' where pid='"+product_id+"'";
                         PreparedStatement sta1 = con.prepareStatement(query1);
                         sta1.executeUpdate(query1);
                         System.out.println(query1);
                         System.out.println("Inside query1");
            //             sta1.close();
                     //    sta.close();
                       //  PaymentPageFrame ppf=new PaymentPageFrame();
                       //  PaymentPageFrame ppf=new PaymentPageFrame(product_id,plabel1,Qty,tot_amount);
                       //  ppf.setVisible(true);
                     }
                   
				 }catch(Exception e1) {
					 System.out.println(e1);
				 }
				
				 
				cardlayout.show(pane,"cartpane");
				
				DatabaseConnection connectnow=new DatabaseConnection();
				Connection connectDB=connectnow.getConnection();
				try {
					String query="Select product_name,Qty,price from NewOrder where login_id='"+lbluser1+"' order by order_id desc limit 1 ";
					PreparedStatement st= connectDB.prepareStatement(query);
					ResultSet rs=st.executeQuery();
					System.out.println(query);
					 rsmd=rs.getMetaData();
					 model=(DefaultTableModel)table.getModel();
					int cols=rsmd.getColumnCount();
					double total=0;
					System.out.println("Tot"+total);
					String[] colName=new String[cols];
					for(int i=0;i<cols;i++) {
						//colName[i]=rsmd.getColumnName(i+1);
						//model.setColumnIdentifiers(colName);
						String pname,pqty,pprice;
						while(rs.next()) {
							pname=rs.getString(1);
							System.out.println(pname);
							pqty=rs.getString(2);
							System.out.println(pqty);
							pprice=rs.getString(3);
							System.out.println(pprice);
							String[] row= {pname,pqty,pprice};
							model.addRow(row);
							
						}
						System.out.println("End of  while");
						sum();
						
						//PreparedStatement st1= connectDB.prepareStatement("Select SUM(price) from NewOrder ");
					//	int x=st1.executeUpdate();
					
						
							
					}	
						
					}	
					
					
					
					
					
				catch(Exception e1) {
					System.out.println(e1);
					
				}
			
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnacart1.setBounds(500, 102, 119, 46);
		panel.add(btnacart1);
		
		 comboBox = new JComboBox();
		 comboBox.addActionListener(new ActionListener() {
		 	
			 public void actionPerformed(ActionEvent e) {
		 		DatabaseConnection connectnow=new DatabaseConnection();
				Connection connectDB=connectnow.getConnection();
		 		
		 		
		 		try {
					
					String verifyLogin= "Select price from NewProduct where p_item='MEN' and product_name='MEN JACKET' ";
					PreparedStatement st= connectDB.prepareStatement(verifyLogin);
					ResultSet rs=st.executeQuery();
					while(rs.next()) {
					int item_price1=rs.getInt("price");
				        
				         int tot=comboBox.getSelectedIndex()+1;
				         lblamount1.setText(" ");
				         System.out.println(tot);
				         int  f_price=tot*item_price1;
				         System.out.println(f_price);
				        
				         lblamount1.setText(Integer.toString(f_price));
				          System.out.println("mouseEvent"+f_price);
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}
		 		
		 		
		 		
		 		
		 	}
		 });
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(351, 127, 51, 21);
		panel.add(comboBox);
		
		lblimg1 = new JLabel("");
		lblimg1.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\CapsImage\\men jaket.jpg"));
		lblimg1.setBounds(0, 0, 112, 143);
		panel.add(lblimg1);
		
		textArea1 = new JTextArea();
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		textArea1.setEditable(false);
		textArea1.setBackground(new Color(211, 211, 211));
		textArea1.setBounds(109, 23, 112, 112);
		panel.add(textArea1);
		
		 qtylabel1_hidden_1 = new JLabel("Total Quantity :");
		qtylabel1_hidden_1.setEnabled(false);
		qtylabel1_hidden_1.setBounds(232, 87, 75, 13);
		panel.add(qtylabel1_hidden_1);
		
		pid1 = new JLabel("");
		pid1.setBounds(213, 152, 60, 13);
		panel.add(pid1);
		
		 panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setLayout(null);
		panel_2.setBounds(20, 204, 629, 172);
		MEN.add(panel_2);
		
		 lblpname2 = new JLabel("New label");
		lblpname2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblpname2.setBounds(0, 140, 193, 32);
		panel_2.add(lblpname2);
		
		 lblNewLabel_3_1_1 = new JLabel("Quantity :");
		lblNewLabel_3_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_1_1.setBounds(251, 119, 81, 32);
		panel_2.add(lblNewLabel_3_1_1);
		
		 lblprice2 = new JLabel("");
		lblprice2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblprice2.setBounds(342, 42, 60, 32);
		panel_2.add(lblprice2);
		
		 lblamount2 = new JLabel("");
		 lblamount2.setVerticalAlignment(SwingConstants.TOP);
		lblamount2.setBounds(490, 59, 129, 18);
		panel_2.add(lblamount2);
		
		 lblNewLabel_3_2 = new JLabel("Price :");
		lblNewLabel_3_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_2.setBounds(251, 45, 81, 32);
		panel_2.add(lblNewLabel_3_2);
		
		 lblNewLabel_5_1 = new JLabel("Amount");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5_1.setBounds(500, 10, 102, 21);
		panel_2.add(lblNewLabel_5_1);
		
		btnacart2 = new JButton("Add To Cart");
		btnacart2.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				int lbluser1=Integer.parseInt(lbluser.getText());
				System.out.println(lbluser1);
						String plabel1=lblpname2.getText();
						System.out.println("Product Name :"+plabel1);
						String product_id=pid2.getText();
						System.out.println("Product ID"+product_id);
						 int Qty1 =comboBox_1.getSelectedIndex()+1;
						 System.out.println("Quantity"+Qty1);
						int updated_quantity=Integer.parseInt(qtylabel1_hidden_2.getText())- Qty1;
						 System.out.println("updated_quantity"+updated_quantity);
						 int tot_amount=Integer.parseInt(lblamount2.getText());
						 System.out.println(tot_amount);
						 try {
							 Connection con = DriverManager.getConnection("jdbc:mysql:///capsdb", "root", "root@123");
							 System.out.println("Connection ");
							  String query="INSERT INTO NewOrder (pid,product_name,Qty,price,login_id) values('" + product_id + "',' " + plabel1 + "',' " + Qty1 + "','" + tot_amount + "','" +lbluser1+" ')";
						   //  ResultSet rs= st.executeQuery();
							  System.out.println(query);
							  PreparedStatement sta = con.prepareStatement(query);
						     int x = sta.executeUpdate(query);
						     System.out.println("Inside Statement");
		                     if (x == 0) {
		                         JOptionPane.showMessageDialog(null, "The record already exist");
		                     } else {
		                         JOptionPane.showMessageDialog(null,"OrderUpdated");
		                         System.out.println(Qty1);
		                         String query1="Update NewProduct SET QTY='" +updated_quantity +"' where pid='"+product_id+"'";
		                         PreparedStatement sta1 = con.prepareStatement(query1);
		                         sta1.executeUpdate(query1);
		                         System.out.println(query1);
		                   //  ppf.setVisible(true);
		                     }
		                   
						 }catch(Exception e1) {
							 System.out.println(e1);
						 }
						
							cardlayout.show(pane,"cartpane");
							tablefunction();
				
				
				
				
			}
		});
		btnacart2.setBounds(500, 102, 119, 46);
		panel_2.add(btnacart2);
		
		   comboBox_1 = new JComboBox();
		  comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		  comboBox_1.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		
		  		DatabaseConnection connectnow=new DatabaseConnection();
				Connection connectDB=connectnow.getConnection();
try {
					
					String verifyLogin= "Select price from NewProduct where p_item='MEN' and product_name='MEN JEAN' ";
					PreparedStatement st= connectDB.prepareStatement(verifyLogin);
					ResultSet rs=st.executeQuery();
					while(rs.next()) {
					int item_price1=rs.getInt("price");
				        
				         int tot=comboBox_1.getSelectedIndex()+1;
				         //lblamount2.setText(" ");
				         System.out.println(tot);
				         int  f_price=tot*item_price1;
				         System.out.println(f_price);
				        
				         lblamount2.setText(Integer.toString(f_price));
				          System.out.println("mouseEvent"+f_price);
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
		 		
		 		
		 		
		 	}
		  		
		  	}
		  });
		/*comboBox_1.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
		 		
		 });*/
		
		comboBox_1.setBounds(351, 127, 51, 21);
		panel_2.add(comboBox_1);
		
		 lblimg1_1 = new JLabel("");
		lblimg1_1.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\CapsImage\\Men_Jean.jpg"));
		lblimg1_1.setBounds(0, 0, 102, 130);
		panel_2.add(lblimg1_1);
		
		 textArea2 = new JTextArea();
		 textArea2.setLineWrap(true);
		textArea2.setWrapStyleWord(true);
		textArea2.setEditable(false);
		textArea2.setBackground(new Color(211, 211, 211));
		textArea2.setBounds(112, 18, 129, 133);
		panel_2.add(textArea2);
		
	 qtylabel1_hidden_1_1 = new JLabel("Total Quantity :");
		qtylabel1_hidden_1_1.setEnabled(false);
		qtylabel1_hidden_1_1.setBounds(251, 96, 75, 13);
		panel_2.add(qtylabel1_hidden_1_1);
		
	 qtylabel1_hidden_2 = new JLabel("New label");
		qtylabel1_hidden_2.setEnabled(false);
		qtylabel1_hidden_2.setBounds(371, 93, 45, 13);
		panel_2.add(qtylabel1_hidden_2);
		
		pid2 = new JLabel("");
		pid2.setBounds(191, 152, 60, 13);
		panel_2.add(pid2);
		
		 panel_3 = new JPanel();
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setLayout(null);
		panel_3.setBounds(10, 402, 629, 172);
		MEN.add(panel_3);
		
		 lblpname3 = new JLabel("New label");
		lblpname3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblpname3.setBounds(0, 140, 193, 32);
		panel_3.add(lblpname3);
		
		 lblNewLabel_3_1_2 = new JLabel("Quantity :");
		lblNewLabel_3_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_1_2.setBounds(251, 119, 81, 32);
		panel_3.add(lblNewLabel_3_1_2);
		
		 lblprice3 = new JLabel("");
		lblprice3.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblprice3.setBounds(342, 42, 60, 32);
		panel_3.add(lblprice3);
		
		 lblamount3 = new JLabel("");
		lblamount3.setBounds(501, 59, 118, 18);
		panel_3.add(lblamount3);
		
		 lblNewLabel_3_3 = new JLabel("Price :");
		lblNewLabel_3_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_3.setBounds(251, 45, 81, 32);
		panel_3.add(lblNewLabel_3_3);
		
		 lblNewLabel_5_2 = new JLabel("Amount");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5_2.setBounds(500, 10, 102, 21);
		panel_3.add(lblNewLabel_5_2);
		
		 btnacart3 = new JButton("Add To Cart");
		 btnacart3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		
		 		int lbluser1=Integer.parseInt(lbluser.getText());
				System.out.println(lbluser1);
						String plabel1=lblpname3.getText();
						System.out.println("Product Name :"+plabel1);
						String product_id=pid3.getText();
						System.out.println("Product ID"+product_id);
						 int Qty1 =comboBox_2.getSelectedIndex()+1;
						 System.out.println("Quantity"+Qty1);
						int updated_quantity=Integer.parseInt(qtylabel1_hidden_3.getText())- Qty1;
						 System.out.println("updated_quantity"+updated_quantity);
						 int tot_amount=Integer.parseInt(lblamount3.getText());
						 System.out.println(tot_amount);
						 try {
							 Connection con = DriverManager.getConnection("jdbc:mysql:///capsdb", "root", "root@123");
							 System.out.println("Connection ");
							  String query="INSERT INTO NewOrder (pid,product_name,Qty,price,login_id) values('" + product_id + "',' " + plabel1 + "',' " + Qty1 + "','" + tot_amount + "','" +lbluser1+" ')";
						   //  ResultSet rs= st.executeQuery();
							  System.out.println(query);
							  PreparedStatement sta = con.prepareStatement(query);
						     int x = sta.executeUpdate(query);
						     System.out.println("Inside Statement");
		                     if (x == 0) {
		                         JOptionPane.showMessageDialog(null, "The record already exist");
		                     } else {
		                         JOptionPane.showMessageDialog(null,"OrderUpdated");
		                         System.out.println(Qty1);
		                         String query1="Update NewProduct SET QTY='" +updated_quantity +"' where pid='"+product_id+"'";
		                         PreparedStatement sta1 = con.prepareStatement(query1);
		                         sta1.executeUpdate(query1);
		                         System.out.println(query1);
		                   //  ppf.setVisible(true);
		                     }
		                   
						 }catch(Exception e1) {
							 System.out.println(e1);
						 }
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		
		 		cardlayout.show(pane,"cartpane");
		 		tablefunction();
		 	}
		 });
		btnacart3.setBounds(500, 102, 119, 46);
		panel_3.add(btnacart3);
		
		 comboBox_2 = new JComboBox();
		 comboBox_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		DatabaseConnection connectnow=new DatabaseConnection();
				Connection connectDB=connectnow.getConnection();
try {
					
					String verifyLogin= "Select price from NewProduct where p_item='MEN' and product_name='MEN T-SHIRT' ";
					PreparedStatement st= connectDB.prepareStatement(verifyLogin);
					ResultSet rs=st.executeQuery();
					while(rs.next()) {
					int item_price1=rs.getInt("price");
				        
				         int tot=comboBox_2.getSelectedIndex()+1;
				         //lblamount2.setText(" ");
				         System.out.println(tot);
				         int  f_price=tot*item_price1;
				         System.out.println(f_price);
				        
				         lblamount3.setText(Integer.toString(f_price));
				          System.out.println("mouseEvent"+f_price);
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
		 		
		 		
		 		
		 	}
		  		
		  	}
		 });
		 comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBox_2.setBounds(351, 127, 51, 21);
		panel_3.add(comboBox_2);
		
		 lblimg1_2 = new JLabel("");
		lblimg1_2.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\CapsImage\\men t shit.jpeg"));
		lblimg1_2.setBounds(0, 0, 107, 130);
		panel_3.add(lblimg1_2);
		
		 textArea3 = new JTextArea();
		 textArea3.setLineWrap(true);
		textArea3.setWrapStyleWord(true);
		textArea3.setEditable(false);
		textArea3.setBackground(new Color(211, 211, 211));
		textArea3.setBounds(103, 26, 112, 112);
		panel_3.add(textArea3);
		
		 qtylabel1_hidden_1_2 = new JLabel("Total Quantity :");
		qtylabel1_hidden_1_2.setEnabled(false);
		qtylabel1_hidden_1_2.setBounds(251, 96, 75, 13);
		panel_3.add(qtylabel1_hidden_1_2);
		
		 qtylabel1_hidden_3 = new JLabel("New label");
		qtylabel1_hidden_3.setEnabled(false);
		qtylabel1_hidden_3.setBounds(371, 93, 45, 13);
		panel_3.add(qtylabel1_hidden_3);
		
		pid3 = new JLabel("");
		pid3.setBounds(203, 152, 60, 13);
		panel_3.add(pid3);
		
		 WOMEN = new JPanel();
		 WOMEN.setBackground(new Color(135, 206, 235));
		tabbedPane.addTab("            WOMEN         ", null, WOMEN, null);
		WOMEN.setLayout(null);
		
		 panel_4 = new JPanel();
		 panel_4.setBackground(new Color(211, 211, 211));
		panel_4.setLayout(null);
		panel_4.setBounds(10, 33, 629, 172);
		WOMEN.add(panel_4);
		
		lblpname4 = new JLabel("New label");
		lblpname4.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 15));
		lblpname4.setBounds(0, 140, 193, 32);
		panel_4.add(lblpname4);
		
		 lblNewLabel_3_1_3 = new JLabel("Quantity :");
		lblNewLabel_3_1_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_1_3.setBounds(251, 119, 81, 32);
		panel_4.add(lblNewLabel_3_1_3);
		
		 lblprice4 = new JLabel("");
		lblprice4.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblprice4.setBounds(342, 42, 60, 32);
		panel_4.add(lblprice4);
		
		 lblamount4 = new JLabel("");
		lblamount4.setBounds(501, 59, 118, 18);
		panel_4.add(lblamount4);
		
		 lblNewLabel_3_4 = new JLabel("Price :");
		lblNewLabel_3_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_4.setBounds(251, 45, 81, 32);
		panel_4.add(lblNewLabel_3_4);
		
	 lblNewLabel_5_3 = new JLabel("Amount");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_3.setBounds(500, 10, 102, 21);
		panel_4.add(lblNewLabel_5_3);
		
	 btnacart4 = new JButton("Add To Cart");
	 btnacart4.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
	 		int lbluser1=Integer.parseInt(lbluser.getText());
			System.out.println(lbluser1);
					String plabel1=lblpname4.getText();
					System.out.println("Product Name :"+plabel1);
					String product_id=pid4.getText();
					System.out.println("Product ID"+product_id);
					 int Qty1 =comboBox_3.getSelectedIndex()+1;
					 System.out.println("Quantity"+Qty1);
					int updated_quantity=Integer.parseInt(qtylabel1_hidden_5.getText())- Qty1;
					 System.out.println("updated_quantity"+updated_quantity);
					 int tot_amount=Integer.parseInt(lblamount4.getText());
					 System.out.println(tot_amount);
					
	                   
					addtocart(product_id,plabel1,Qty1,tot_amount,lbluser1,updated_quantity);
	 		
	 		
					 cardlayout.show(pane,"cartpane");
						tablefunction();
	 		
	 		
	 		
	 		
	 		
	 		
	 	}
	 });
	 btnacart4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnacart4.setBounds(500, 102, 119, 46);
		panel_4.add(btnacart4);
		
		 comboBox_3 = new JComboBox();
		 comboBox_3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		int selection=3;
		 		combofun(3);
		 		
		 		
		 		
		 		
		 	}
		 });
		 comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_3.setBounds(351, 127, 51, 21);
		panel_4.add(comboBox_3);
		
		 lblimg1_3 = new JLabel("");
		lblimg1_3.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\CapsImage\\women_jaket.jpg"));
		lblimg1_3.setBounds(0, 0, 118, 130);
		panel_4.add(lblimg1_3);
		
		 textArea4 = new JTextArea();
		 textArea4.setLineWrap(true);
		textArea4.setWrapStyleWord(true);
		textArea4.setEditable(false);
		textArea4.setBackground(new Color(211, 211, 211));
		textArea4.setBounds(117, 18, 112, 112);
		panel_4.add(textArea4);
		
		pid4 = new JLabel("");
		pid4.setBounds(133, 159, 60, 13);
		panel_4.add(pid4);
		
		qtylabel1_hidden_4 = new JLabel("Total Quantity :");
		qtylabel1_hidden_4.setEnabled(false);
		qtylabel1_hidden_4.setBounds(261, 87, 75, 13);
		panel_4.add(qtylabel1_hidden_4);
		
		qtylabel1_hidden_5 = new JLabel("");
		qtylabel1_hidden_5.setEnabled(false);
		qtylabel1_hidden_5.setBounds(352, 87, 45, 13);
		panel_4.add(qtylabel1_hidden_5);
		
		 panel_5 = new JPanel();
		 panel_5.setBackground(new Color(211, 211, 211));
		panel_5.setLayout(null);
		panel_5.setBounds(10, 228, 629, 172);
		WOMEN.add(panel_5);
		
		 lblpname5 = new JLabel("New label");
		 lblpname5.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 15));
		lblpname5.setBounds(0, 140, 193, 32);
		panel_5.add(lblpname5);
		
		 lblNewLabel_3_1_4 = new JLabel("Quantity :");
		lblNewLabel_3_1_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_1_4.setBounds(251, 119, 81, 32);
		panel_5.add(lblNewLabel_3_1_4);
		
		 lblprice5 = new JLabel("");
		lblprice5.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblprice5.setBounds(342, 42, 60, 32);
		panel_5.add(lblprice5);
		
		 lblNewLabel_3_5 = new JLabel("Price :");
		lblNewLabel_3_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_5.setBounds(251, 45, 81, 32);
		panel_5.add(lblNewLabel_3_5);
		
		 lblNewLabel_5_4 = new JLabel("Amount");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_4.setBounds(500, 10, 102, 21);
		panel_5.add(lblNewLabel_5_4);
		
		 btnacart5 = new JButton("Add To Cart");
		 btnacart5.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		int lbluser1=Integer.parseInt(lbluser.getText());
				System.out.println(lbluser1);
						String plabel1=lblpname5.getText();
						System.out.println("Product Name :"+plabel1);
						String product_id=pid5.getText();
						System.out.println("Product ID"+product_id);
						 int Qty1 =comboBox_4.getSelectedIndex()+1;
						 System.out.println("Quantity"+Qty1);
						int updated_quantity=Integer.parseInt(qtylabel1_hidden_7.getText())- Qty1;
						 System.out.println("updated_quantity"+updated_quantity);
						 int tot_amount=Integer.parseInt(lblamount5.getText());
						 System.out.println(tot_amount);
						
		                   
						addtocart(product_id,plabel1,Qty1,tot_amount,lbluser1,updated_quantity);
		 		
		 		
						 cardlayout.show(pane,"cartpane");
							tablefunction();
		 		
		 		
		 	}
		 });
		 btnacart5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnacart5.setBounds(500, 102, 119, 46);
		panel_5.add(btnacart5);
		
		 comboBox_4 = new JComboBox();
		 comboBox_4.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		int selection=4;
		 		combofun(4);
		 	}
		 });
		 comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_4.setBounds(351, 127, 51, 21);
		panel_5.add(comboBox_4);
		
		 lblimg1_4 = new JLabel("");
		 lblimg1_4.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\CapsImage\\Men_Jean.jpg"));
		lblimg1_4.setBounds(0, 0, 118, 130);
		panel_5.add(lblimg1_4);
		
		 textArea5 = new JTextArea();
		 textArea5.setLineWrap(true);
		textArea5.setWrapStyleWord(true);
		textArea5.setEditable(false);
		textArea5.setBackground(new Color(211, 211, 211));
		textArea5.setBounds(128, 28, 112, 112);
		panel_5.add(textArea5);
		
		pid5 = new JLabel("");
		pid5.setBounds(187, 159, 60, 13);
		panel_5.add(pid5);
		
		qtylabel1_hidden_6 = new JLabel("Total Quantity :");
		qtylabel1_hidden_6.setEnabled(false);
		qtylabel1_hidden_6.setBounds(261, 84, 75, 13);
		panel_5.add(qtylabel1_hidden_6);
		
		qtylabel1_hidden_7 = new JLabel("");
		qtylabel1_hidden_7.setEnabled(false);
		qtylabel1_hidden_7.setBounds(352, 84, 45, 13);
		panel_5.add(qtylabel1_hidden_7);
		
		lblamount5 = new JLabel("");
		lblamount5.setBounds(500, 57, 67, 20);
		panel_5.add(lblamount5);
		
		 panel_6 = new JPanel();
		 panel_6.setBackground(new Color(211, 211, 211));
		panel_6.setLayout(null);
		panel_6.setBounds(10, 422, 629, 172);
		WOMEN.add(panel_6);
		
		 lblpname6 = new JLabel("New label");
		 lblpname6.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 15));
		lblpname6.setBounds(0, 140, 193, 32);
		panel_6.add(lblpname6);
		
		 lblNewLabel_3_1_5 = new JLabel("Quantity :");
		lblNewLabel_3_1_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_1_5.setBounds(251, 119, 81, 32);
		panel_6.add(lblNewLabel_3_1_5);
		
		 lblprice6 = new JLabel("");
		lblprice6.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblprice6.setBounds(342, 42, 60, 32);
		panel_6.add(lblprice6);
		
		 lblamount6 = new JLabel("");
		lblamount6.setBounds(501, 59, 118, 18);
		panel_6.add(lblamount6);
	
		lblNewLabel_3_6 = new JLabel("Price :");
		lblNewLabel_3_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel_3_6.setBounds(251, 45, 81, 32);
		panel_6.add(lblNewLabel_3_6);
		
		 lblNewLabel_5_5 = new JLabel("Amount");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_5.setBounds(500, 10, 102, 21);
		panel_6.add(lblNewLabel_5_5);
		
		 btnacart6 = new JButton("Add To Cart");
		 btnacart6.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		int lbluser1=Integer.parseInt(lbluser.getText());
				System.out.println(lbluser1);
						String plabel1=lblpname6.getText();
						System.out.println("Product Name :"+plabel1);
						String product_id=pid6.getText();
						System.out.println("Product ID"+product_id);
						 int Qty1 =comboBox_5.getSelectedIndex()+1;
						 System.out.println("Quantity"+Qty1);
						int updated_quantity=Integer.parseInt(qtylabel1_hidden_9.getText())- Qty1;
						 System.out.println("updated_quantity"+updated_quantity);
						 int tot_amount=Integer.parseInt(lblamount6.getText());
						 System.out.println(tot_amount);
						
		                   
						addtocart(product_id,plabel1,Qty1,tot_amount,lbluser1,updated_quantity);
		 		
		 		
						 cardlayout.show(pane,"cartpane");
							tablefunction();
		 		
		 		
		 	}
		 });
		 btnacart6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnacart6.setBounds(500, 102, 119, 46);
		panel_6.add(btnacart6);
		
		 comboBox_5 = new JComboBox();
		 comboBox_5.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		int selection=5;
		 		combofun(5);
		 	}
		 });
		 comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_5.setBounds(351, 127, 51, 21);
		panel_6.add(comboBox_5);
		
		 lblimg1_5 = new JLabel("");
		lblimg1_5.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\CapsImage\\men t shit.jpeg"));
		lblimg1_5.setBounds(0, 0, 130, 130);
		panel_6.add(lblimg1_5);
		
		 textArea6 = new JTextArea();
		 textArea6.setLineWrap(true);
		textArea6.setWrapStyleWord(true);
		textArea6.setEditable(false);
		textArea6.setBackground(new Color(211, 211, 211));
		textArea6.setBounds(129, 21, 112, 112);
		panel_6.add(textArea6);
		
		pid6 = new JLabel("");
		pid6.setBounds(170, 150, 60, 13);
		panel_6.add(pid6);
		
		qtylabel1_hidden_8 = new JLabel("Total Quantity :");
		qtylabel1_hidden_8.setEnabled(false);
		qtylabel1_hidden_8.setBounds(261, 87, 75, 13);
		panel_6.add(qtylabel1_hidden_8);
		
		qtylabel1_hidden_9 = new JLabel("");
		qtylabel1_hidden_9.setEnabled(false);
		qtylabel1_hidden_9.setBounds(352, 84, 45, 13);
		panel_6.add(qtylabel1_hidden_9);
		 
		  KID = new JPanel();
		  KID.setBackground(new Color(230, 230, 250));
		  tabbedPane.addTab("            KID             ", null, KID, null);
		  KID.setLayout(null);
		  
		   panel_7 = new JPanel();
		   panel_7.setBackground(new Color(211, 211, 211));
		   panel_7.setLayout(null);
		   panel_7.setBounds(10, 25, 629, 172);
		   KID.add(panel_7);
		   
		    lblpname7 = new JLabel("New label");
		    lblpname7.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 15));
		    lblpname7.setBounds(0, 140, 193, 32);
		    panel_7.add(lblpname7);
		    
		     lblNewLabel_3_1_6 = new JLabel("Quantity :");
		     lblNewLabel_3_1_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		     lblNewLabel_3_1_6.setBounds(251, 119, 81, 32);
		     panel_7.add(lblNewLabel_3_1_6);
		     
		      lblprice7 = new JLabel("");
		      lblprice7.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		      lblprice7.setBounds(342, 42, 60, 32);
		      panel_7.add(lblprice7);
		      
		       lblamount7 = new JLabel("");
		       lblamount7.setBounds(501, 59, 118, 18);
		       panel_7.add(lblamount7);
		       
		       lblNewLabel_3_7 = new JLabel("Price :");
		       lblNewLabel_3_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		       lblNewLabel_3_7.setBounds(251, 45, 81, 32);
		       panel_7.add(lblNewLabel_3_7);
		       
		        lblNewLabel_5_6 = new JLabel("Amount");
		        lblNewLabel_5_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		        lblNewLabel_5_6.setBounds(500, 10, 102, 21);
		        panel_7.add(lblNewLabel_5_6);
		        
		         btnacart7 = new JButton("Add To Cart");
		         btnacart7.addActionListener(new ActionListener() {
		         	public void actionPerformed(ActionEvent e) {
		         		int lbluser1=Integer.parseInt(lbluser.getText());
		    			System.out.println(lbluser1);
		    					String plabel1=lblpname7.getText();
		    					System.out.println("Product Name :"+plabel1);
		    					String product_id=pid7.getText();
		    					System.out.println("Product ID"+product_id);
		    					 int Qty1 =comboBox_6.getSelectedIndex()+1;
		    					 System.out.println("Quantity"+Qty1);
		    					int updated_quantity=Integer.parseInt(qtylabel1_hidden_11.getText())- Qty1;
		    					 System.out.println("updated_quantity"+updated_quantity);
		    					 int tot_amount=Integer.parseInt(lblamount7.getText());
		    					 System.out.println(tot_amount);
		    					
		    	                   
		    					addtocart(product_id,plabel1,Qty1,tot_amount,lbluser1,updated_quantity);
		    	 		
		    	 		
		    					 cardlayout.show(pane,"cartpane");
		    						tablefunction();
		    	 		
		    	 		
		         	}
		         });
		         btnacart7.setBounds(500, 102, 119, 46);
		         panel_7.add(btnacart7);
		         
		          comboBox_6 = new JComboBox();
		          comboBox_6.addActionListener(new ActionListener() {
		          	public void actionPerformed(ActionEvent e) {
		    	 		int selection=6;
				 		combofun(6);
		          		
		          	}
		          });
		          comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		          comboBox_6.setBounds(351, 127, 51, 21);
		          panel_7.add(comboBox_6);
		          
		           lblNewLabel_1 = new JLabel("");
		           lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\CapsImage\\men jaket.jpg"));
		           lblNewLabel_1.setBounds(0, 0, 118, 130);
		           panel_7.add(lblNewLabel_1);
		           
		            textArea7 = new JTextArea();
		            textArea7.setLineWrap(true);
		            textArea7.setWrapStyleWord(true);
		            textArea7.setEditable(false);
		            textArea7.setBackground(new Color(211, 211, 211));
		            textArea7.setBounds(128, 18, 112, 133);
		            panel_7.add(textArea7);
		            
		            pid7 = new JLabel("");
		            pid7.setBounds(234, 159, 60, 13);
		            panel_7.add(pid7);
		            
		            qtylabel1_hidden_10 = new JLabel("Total Quantity :");
		            qtylabel1_hidden_10.setEnabled(false);
		            qtylabel1_hidden_10.setBounds(253, 94, 75, 13);
		            panel_7.add(qtylabel1_hidden_10);
		            
		            qtylabel1_hidden_11 = new JLabel("");
		            qtylabel1_hidden_11.setEnabled(false);
		            qtylabel1_hidden_11.setBounds(342, 94, 45, 13);
		            panel_7.add(qtylabel1_hidden_11);
		            
		            pid4_2 = new JLabel("");
		            pid4_2.setBounds(128, 159, 60, 13);
		            panel_7.add(pid4_2);
		            
		            qtylabel1_hidden_15 = new JLabel("");
		            qtylabel1_hidden_15.setEnabled(false);
		            qtylabel1_hidden_15.setBounds(347, 87, 45, 13);
		            panel_7.add(qtylabel1_hidden_15);
		            
		             panel_8 = new JPanel();
		             panel_8.setBackground(new Color(211, 211, 211));
		             panel_8.setLayout(null);
		             panel_8.setBounds(10, 223, 629, 172);
		             KID.add(panel_8);
		             
		              lblpname8 = new JLabel("New label");
		              lblpname8.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 15));
		              lblpname8.setBounds(0, 140, 193, 32);
		              panel_8.add(lblpname8);
		              
		               lblNewLabel_3_1_7 = new JLabel("Quantity :");
		               lblNewLabel_3_1_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		               lblNewLabel_3_1_7.setBounds(251, 119, 81, 32);
		               panel_8.add(lblNewLabel_3_1_7);
		               
		                lblprice8 = new JLabel("");
		                lblprice8.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		                lblprice8.setBounds(342, 42, 60, 32);
		                panel_8.add(lblprice8);
		                
		                 lblamount8 = new JLabel("");
		                 lblamount8.setBounds(501, 59, 118, 18);
		                 panel_8.add(lblamount8);
		                 
		                  lblNewLabel_3_8 = new JLabel("Price :");
		                  lblNewLabel_3_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		                  lblNewLabel_3_8.setBounds(251, 45, 81, 32);
		                  panel_8.add(lblNewLabel_3_8);
		                  
		                   lblNewLabel_5_7 = new JLabel("Amount");
		                   lblNewLabel_5_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		                   lblNewLabel_5_7.setBounds(500, 10, 102, 21);
		                   panel_8.add(lblNewLabel_5_7);
		                   
		                    btnacart8 = new JButton("Add To Cart");
		                    btnacart8.addActionListener(new ActionListener() {
		                    	public void actionPerformed(ActionEvent e) {
		                    		
		                    		int lbluser1=Integer.parseInt(lbluser.getText());
		                			System.out.println(lbluser1);
		                					String plabel1=lblpname8.getText();
		                					System.out.println("Product Name :"+plabel1);
		                					String product_id=pid8.getText();
		                					System.out.println("Product ID"+product_id);
		                					 int Qty1 =comboBox_7.getSelectedIndex()+1;
		                					 System.out.println("Quantity"+Qty1);
		                					int updated_quantity=Integer.parseInt(qtylabel1_hidden_13.getText())- Qty1;
		                					 System.out.println("updated_quantity"+updated_quantity);
		                					 int tot_amount=Integer.parseInt(lblamount4.getText());
		                					 System.out.println(tot_amount);
		                					
		                	                   
		                					addtocart(product_id,plabel1,Qty1,tot_amount,lbluser1,updated_quantity);
		                	 		
		                	 		
		                					 cardlayout.show(pane,"cartpane");
		                						tablefunction();
		                	 		
		                	 		
		                    	}
		                    });
		                    btnacart8.setBounds(500, 102, 119, 46);
		                    panel_8.add(btnacart8);
		                    
		                     comboBox_7 = new JComboBox();
		                     comboBox_7.addActionListener(new ActionListener() {
		                     	public void actionPerformed(ActionEvent e) {
		                	 		int selection=7;
		            		 		combofun(7);
		                     	}
		                     });
		                     comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		                     comboBox_7.setBounds(351, 127, 51, 21);
		                     panel_8.add(comboBox_7);
		                     
		                      lblimg1_7 = new JLabel("");
		                      lblimg1_7.setIcon(new ImageIcon("C:\\Users\\ramz8\\Downloads\\CapsImage\\Men_Jean.jpg"));
		                      lblimg1_7.setBounds(0, 0, 119, 130);
		                      panel_8.add(lblimg1_7);
		                      
		                       textArea8 = new JTextArea();
		                       textArea8.setLineWrap(true);
		                       textArea8.setWrapStyleWord(true);
		                       textArea8.setEditable(false);
		                       textArea8.setBackground(new Color(211, 211, 211));
		                       textArea8.setBounds(129, 26, 112, 112);
		                       panel_8.add(textArea8);
		                       
		                       pid8 = new JLabel("");
		                       pid8.setBounds(227, 152, 60, 13);
		                       panel_8.add(pid8);
		                       
		                       qtylabel1_hidden_12 = new JLabel("Total Quantity :");
		                       qtylabel1_hidden_12.setEnabled(false);
		                       qtylabel1_hidden_12.setBounds(246, 87, 75, 13);
		                       panel_8.add(qtylabel1_hidden_12);
		                       
		                       qtylabel1_hidden_13 = new JLabel("");
		                       qtylabel1_hidden_13.setEnabled(false);
		                       qtylabel1_hidden_13.setBounds(331, 84, 45, 13);
		                       panel_8.add(qtylabel1_hidden_13);
		                       
		                       pid4_3 = new JLabel("");
		                       pid4_3.setBounds(168, 156, 60, 13);
		                       panel_8.add(pid4_3);
		                       
		                       qtylabel1_hidden_16 = new JLabel("");
		                       qtylabel1_hidden_16.setEnabled(false);
		                       qtylabel1_hidden_16.setBounds(387, 84, 45, 13);
		                       panel_8.add(qtylabel1_hidden_16);
		
		 cartpane = new JPanel();
		cartpane.setBackground(new Color(240, 248, 255));
		pane.add(cartpane, "cartpane");
		cartpane.setLayout(new CardLayout(0, 0));
		
		 panel_10 = new JPanel();
		 panel_10.setBackground(new Color(106, 90, 205));
		cartpane.add(panel_10, "name_2065298794657200");
		panel_10.setLayout(null);
		
		 btnNewButton_1_2 = new JButton("Go Back To Shopping");
		 btnNewButton_1_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		
		 		cardlayout.show(pane,"productpane");
		 	}
		 });
		 btnNewButton_1_2.setFont(new Font("Bell MT", Font.BOLD, 20));
		 btnNewButton_1_2.setBounds(34, 425, 282, 61);
		 panel_10.add(btnNewButton_1_2);
		
		
		
		
		
		 btnNewButton_1 = new JButton("Select a record to delete");
		 btnNewButton_1.setFont(new Font("Bell MT", Font.BOLD, 20));
		 btnNewButton_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		model=(DefaultTableModel)table.getModel();
		 		try {
		 			int selectedRowIndex=table.getSelectedRow();
		 			model.removeRow(selectedRowIndex);
		 			sum();
		 			
		 			
		 		}catch(Exception ed) {
		 			JOptionPane.showMessageDialog(null,"Please select a record to delete.\n");
		 			System.out.println(ed);
		 		}
		 		
		 		
		 	}
		 });
		 btnNewButton_1.setBounds(34, 354, 282, 61);
		 panel_10.add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 654, 300);
		panel_10.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PRODUCT NAME", "QUANTITY", "PRICE"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(136);
		table.getColumnModel().getColumn(1).setPreferredWidth(110);
		scrollPane.setViewportView(table);
		
		 lblTotalAmount = new JLabel("Total");
		 lblTotalAmount.setForeground(new Color(255, 255, 255));
		lblTotalAmount.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalAmount.setBounds(367, 354, 98, 34);
		panel_10.add(lblTotalAmount);
		
		 lblTotalAmount_1 = new JLabel("");
		lblTotalAmount_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalAmount_1.setBounds(507, 430, 98, 34);
		panel_10.add(lblTotalAmount_1);
		
		 btnNewButton_1_1 = new JButton("Proceed To Checkout");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			private String lbluser1;

			public void actionPerformed(ActionEvent e) {
				cardlayout.show(pane,"paypane");
				int lbluser1=Integer.parseInt(lbluser.getText());
				String w=lblwelname.getText();
				System.out.println(lbluser1);
				System.out.println("login ID"+lbluser1);
				System.out.println("login user name"+w);
				lblpayamout.setText(textField_total.getText());
				 lblfinalamt.setText(textField_total.getText());
				
				double a=Integer.parseInt(textField_total.getText());
				btnpaynow.setVisible(false);
				
				
				
				//checking card member
			//	8888888888888
			//	checkcardno();
				
				
			
			}
		
		});
		btnNewButton_1_1.setFont(new Font("Bell MT", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(348, 513, 296, 50);
		panel_10.add(btnNewButton_1_1);
		
		textField_total = new JTextField();
		textField_total.setEditable(false);
		textField_total.setBounds(466, 354, 164, 42);
		panel_10.add(textField_total);
		textField_total.setColumns(10);
		
		panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 165, 0));
		panel_14.setBounds(20, 326, 313, 237);
		panel_10.add(panel_14);
		
		 paypane = new JPanel();
		paypane.setBackground(new Color(238, 232, 170));
		pane.add(paypane, "paypane");
		paypane.setLayout(new CardLayout(0, 0));
		
		 panel_12 = new JPanel();
		paypane.add(panel_12, "name_2065973847338400");
		panel_12.setLayout(null);
		 
		 panel_9 = new JPanel();
		 panel_9.setBackground(new Color(0, 250, 154));
		 panel_9.setBounds(10, 456, 399, 160);
		 panel_12.add(panel_9);
		 panel_9.setLayout(null);
		 
		  lbldiscount = new JLabel("");
		  lbldiscount.setBounds(147, 71, 150, 33);
		  panel_9.add(lbldiscount);
		  lbldiscount.setFont(new Font("Bell MT", Font.PLAIN, 17));
		  
		   lblNewLabel_2_1_2_1_1 = new JLabel("Final Amount");
		   lblNewLabel_2_1_2_1_1.setBounds(0, 111, 127, 46);
		   panel_9.add(lblNewLabel_2_1_2_1_1);
		   lblNewLabel_2_1_2_1_1.setFont(new Font("Bell MT", Font.PLAIN, 17));
		   
		    lblfinalamt = new JLabel("");
		    lblfinalamt.setBounds(163, 118, 188, 33);
		    panel_9.add(lblfinalamt);
		    lblfinalamt.setFont(new Font("Bell MT", Font.PLAIN, 17));
		     
		      lblpayamout = new JLabel("");
		      lblpayamout.setBounds(137, 3, 188, 33);
		      panel_9.add(lblpayamout);
		      lblpayamout.setFont(new Font("Bell MT", Font.PLAIN, 17));
		     
		      lblNewLabel_2_1_2_1 = new JLabel("Discount in % if any :");
		      lblNewLabel_2_1_2_1.setBounds(0, 62, 145, 46);
		      panel_9.add(lblNewLabel_2_1_2_1);
		      lblNewLabel_2_1_2_1.setFont(new Font("Bell MT", Font.PLAIN, 17));
		     
		     lblmemdis = new JLabel("");
		     lblmemdis.setFont(new Font("Bell MT", Font.PLAIN, 17));
		     lblmemdis.setBounds(137, 41, 188, 33);
		     panel_9.add(lblmemdis);
		     
		     lblNewLabel_2_1 = new JLabel("Member Discount");
		     lblNewLabel_2_1.setFont(new Font("Bell MT", Font.PLAIN, 17));
		     lblNewLabel_2_1.setBounds(0, 38, 127, 39);
		     panel_9.add(lblNewLabel_2_1);
		    
		     lblNewLabel_2_1_2 = new JLabel("Amount :");
		     lblNewLabel_2_1_2.setBounds(0, 0, 127, 39);
		     panel_9.add(lblNewLabel_2_1_2);
		     lblNewLabel_2_1_2.setFont(new Font("Bell MT", Font.PLAIN, 17));
		
		 panel_13 = new JPanel();
		 panel_13.setBackground(new Color(255, 228, 196));
		panel_13.setBounds(10, 45, 634, 365);
		panel_12.add(panel_13);
		panel_13.setLayout(null);
		
		 lblNewLabel_2 = new JLabel("Do you have Memebership Number");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(0, 10, 279, 46);
		panel_13.add(lblNewLabel_2);
		
		 rdbtnyes = new JRadioButton("YES");
		 rdbtnyes.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String w=lblwelname.getText();
		 		DatabaseConnection connectnow=new DatabaseConnection();
				Connection connectDB=connectnow.getConnection();
				String verifyLogin="select cardno from newaccount where user_name='"+w+"' ";
				System.out.println(verifyLogin);
				System.out.println("selected card no"+w);
				try {
					PreparedStatement statement=connectDB.prepareStatement(verifyLogin);
					ResultSet rs=statement.executeQuery();
					while(rs.next()) {
						if(rs.getInt(1)==1) {
						JOptionPane.showMessageDialog(null, "No data");
						}
						int usercard=rs.getInt("cardno");
						cardnotextField.setText(Integer.toString(usercard));
						System.out.print("CARD NUMBER" +usercard);
						lblmemdis.setText("20%");
						
						
						///////////////
						double a=Integer.parseInt(textField_total.getText());
				 		System.out.println("a"+a);
				 	
				 		//lblpayamout.setText(textField_total.getText());
				 		//lbldiscount.setText(Integer.toString(x));
				 		double b=(a/20);
				 		System.out.println("b:"+b);
				 		float c=(float) (a-b); 
				 		System.out.println("Final Amount" +c);
				 		lblfinalamt.setText(Float.toString(c));
						
						
						
				}
				}catch(Exception e7) {
					System.out.println(e7);
				}
		 	}
		 });
		 buttonGroup.add(rdbtnyes);
		rdbtnyes.setBounds(302, 24, 103, 21);
		panel_13.add(rdbtnyes);
		
		 rdbtnNo = new JRadioButton("NO");
		 rdbtnNo.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		double a=Integer.parseInt(textField_total.getText());
		 		System.out.println("a"+a);
		 		lblmemdis.setText("NA");
		 		//lblpayamout.setText(textField_total.getText());
		 		//lbldiscount.setText(Integer.toString(x));
		 		double b=0;
		 		System.out.println("b:"+b);
		 		float c=(float) (a-b); 
		 		System.out.println("Final Amount" +c);
		 		lblfinalamt.setText(Double.toString(c));
				
		 		
		 	}
		 });
		 buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(419, 24, 103, 21);
		panel_13.add(rdbtnNo);
		
		 lblcarddisplay = new JLabel("Membership Card Number :");
		lblcarddisplay.setFont(new Font("Bell MT", Font.PLAIN, 17));
		lblcarddisplay.setBounds(0, 66, 279, 46);
		panel_13.add(lblcarddisplay);
		
		cardnotextField = new JTextField();
		cardnotextField.setEditable(false);
		cardnotextField.setBounds(419, 69, 176, 30);
		panel_13.add(cardnotextField);
		cardnotextField.setColumns(10);
			
		
		 btnNewButton_3 = new JButton("Surprise");
		 btnNewButton_3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	//	btnpay.setVisible()
		 		if(model.getRowCount()==0) {
		 			
		 			JOptionPane.showMessageDialog(null, "OOPS !!You don't have any item in the cart!!");
		 		}
		 		else  {
		 			countdownTimer();
		 		timer.start();
		 	
		 			int x=10+(int)(Math.random()*30);
		 				//int x = 1+(int)(Math.random()*10);
		 				System.out.println("Random Number \t" +x);
		 				lblsdiscount.setText(Integer.toString(x));
		 				JOptionPane.showMessageDialog(null, "You Suprice discount :"+x+"%");
		 				float a=Integer.parseInt(textField_total.getText());
				 		System.out.println("a"+a);
				 		if(rdbtnyes.isSelected()) {
				 		lblpayamout.setText(textField_total.getText());
				 		lbldiscount.setText(Integer.toString(x));
				 		float b=(a/x);
				 		System.out.println("b:"+b);
				 		float c=(a/20);
				 		float d= (float) (a-b-c);
				 		
				 		System.out.println("Final Amount" +d);
				 		lblfinalamt.setText(Float.toString(d));
				 		}
				 		else if(rdbtnNo.isSelected()) {
				 			
				 			lblpayamout.setText(textField_total.getText());
					 		lbldiscount.setText(Integer.toString(x));
					 		float b=(a/x);
					 		System.out.println("b:"+b);
					 		//double c=(a/20);
					 		float d= (float) (a-b);
					 		
					 		System.out.println("Final Amount" +d);
					 		lblfinalamt.setText(Float.toString(d));
				 		}
				 		
		 			}
		 	
		 		
		 	}
		 });
		btnNewButton_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_3.setBounds(417, 109, 178, 46);
		panel_13.add(btnNewButton_3);
		
		 lblNewLabel_2_2 = new JLabel("Click on Surprise Button to Reveal your discount !!");
		lblNewLabel_2_2.setFont(new Font("Bell MT", Font.PLAIN, 17));
		lblNewLabel_2_2.setBounds(0, 122, 372, 46);
		panel_13.add(lblNewLabel_2_2);
		
		 lblNewLabel_2_1_1 = new JLabel("Timer:");
		lblNewLabel_2_1_1.setFont(new Font("Bell MT", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(322, 165, 83, 46);
		panel_13.add(lblNewLabel_2_1_1);
		
		 lbltimer = new JLabel("01:00");
		lbltimer.setFont(new Font("Bell MT", Font.PLAIN, 17));
		lbltimer.setBounds(419, 165, 83, 46);
		panel_13.add(lbltimer);
		
		 lblNewLabel_2_1_1_2 = new JLabel("You are getting surprise discount of ");
		lblNewLabel_2_1_1_2.setFont(new Font("Bell MT", Font.PLAIN, 17));
		lblNewLabel_2_1_1_2.setBounds(118, 208, 273, 46);
		panel_13.add(lblNewLabel_2_1_1_2);
		
		 lblsdiscount = new JLabel("");
		 		lblsdiscount.setFont(new Font("Bell MT", Font.PLAIN, 17));
		lblsdiscount.setBounds(383, 208, 83, 46);
		panel_13.add(lblsdiscount);
		
		 btnApply = new JButton("Apply");
		
		btnApply.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		btnpaynow.setVisible(true);
		 		btnPay.setVisible(false);
		 		// timer.start(); 
		 		//countdownTimer();
		 	System.out.println("Timer" );
			timer=new Timer(1000,new ActionListener(){
		 	//@Override
		 	public void actionPerformed(ActionEvent e) {
		 		// TODO Auto-generated method stub 
		 		second--;
		 		ddSecond=dFormat.format(second);
		 		ddMinute=dFormat.format(minute);
		 		lbltimer.setText(ddMinute+":"+ddSecond);
		 		timer.stop();
		 		//System.out.println("Set Time" );
		 		if(second==-1) {
		 			//timer.stop();
		 			second=59;
			 		minute--;
			 		ddSecond=dFormat.format(second);
			 			ddMinute=dFormat.format(minute);
			 			lbltimer.setText(ddMinute+":"+ddSecond);
			 			timer.stop();
		 			if(second==-1 && minute==0) {
		 				timer.stop();
		 				//second=0;
		 				//minute=0;
		 				//ddSecond=dFormat.format(second);
				 		//ddMinute=dFormat.format(minute);
				 		lbltimer.setText(ddMinute+":"+ddSecond);
			 				 			
			 		}
		 			
		  		
		 	}
		 		
		 		}
		

		 	});
			
		 	}
		 	
		 
		 });
		btnApply.setBounds(437, 279, 85, 36);
		panel_13.add(btnApply);
		
		 lblNewLabel_2_1_1_2_1 = new JLabel("Buy the items with your surprise discount before it Timesout by clicking PAY NOW!!!");
		lblNewLabel_2_1_1_2_1.setFont(new Font("Bell MT", Font.PLAIN, 17));
		lblNewLabel_2_1_1_2_1.setBounds(10, 310, 593, 46);
		panel_13.add(lblNewLabel_2_1_1_2_1);
		
		 lblNewLabel_2_1_1_2_1_1 = new JLabel("Cart Summary :");
		lblNewLabel_2_1_1_2_1_1.setFont(new Font("Bell MT", Font.PLAIN, 17));
		lblNewLabel_2_1_1_2_1_1.setBounds(10, 420, 416, 33);
		panel_12.add(lblNewLabel_2_1_1_2_1_1);
		
		
		 btnpaynow = new JButton("PAY NOW");
		btnpaynow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThankyouPage t=new ThankyouPage(name);
				t.ThankyouPage(name);
				t.setUndecorated(true);
				t.setVisible(true);
				dispose();
			}
		});
		btnpaynow.setBounds(448, 473, 127, 40);
		panel_12.add(btnpaynow);
		
		btnPay = new JButton("PAY");
		btnPay.addActionListener(new ActionListener() {
			
			//////////
			
			
			
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNo.isSelected()) {
					double a=Integer.parseInt(textField_total.getText());
			 		System.out.println("a"+a);
			 		lblmemdis.setText("NA");
			 		//lblpayamout.setText(textField_total.getText());
			 		//lbldiscount.setText(Integer.toString(x));
			 		double b=0;
			 		System.out.println("b:"+b);
			 		float c=(float) (a-b); 
			 		System.out.println("Final Amount" +c);
			 		lblfinalamt.setText(Float.toString(c));
				}
				else if (rdbtnyes.isSelected()) {
					double a=Integer.parseInt(textField_total.getText());
			 		System.out.println("a"+a);
			 	
			 		//lblpayamout.setText(textField_total.getText());
			 		//lbldiscount.setText(Integer.toString(x));
			 		double b=(a/20);
			 		System.out.println("b:"+b);
			 		float c=(float) (a-b); 
			 		System.out.println("Final Amount" +c);
			 		lblfinalamt.setText(Float.toString(c));
					
				}
				
				ThankyouPage t=new ThankyouPage(name);
				t.ThankyouPage(name);
				t.setUndecorated(true);
				t.setVisible(true);
				dispose();
				
				
			}
		});
		btnPay.setBounds(448, 541, 127, 40);
		panel_12.add(btnPay);
		
		 updatepane = new JPanel();
		updatepane.setBackground(new Color(255, 239, 213));
		pane.add(updatepane, "updatepane");
		updatepane.setLayout(new CardLayout(0, 0));
		
		contentPane_1 = new JPanel();
		contentPane_1.setBackground(new Color(250, 250, 210));
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		updatepane.add(contentPane_1, "name_2308639422149000");
		
		panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setForeground(new Color(250, 240, 230));
		panel_11.setBackground(new Color(106, 90, 205));
		panel_11.setBounds(10, 10, 857, 86);
		contentPane_1.add(panel_11);
		
		lblContactInformation = new JLabel("Contact Information ");
		lblContactInformation.setForeground(new Color(240, 248, 255));
		lblContactInformation.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 23));
		lblContactInformation.setBounds(0, 5, 451, 71);
		panel_11.add(lblContactInformation);
		
		lblname = new JLabel("NAME  ");
		lblname.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblname.setBounds(10, 110, 242, 44);
		contentPane_1.add(lblname);
		
		lblusername = new JLabel("LOGIN USER NAME");
		lblusername.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblusername.setBounds(10, 164, 242, 44);
		contentPane_1.add(lblusername);
		
		lblLoginPassword = new JLabel("LOGIN PASSWORD");
		lblLoginPassword.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblLoginPassword.setBounds(10, 207, 242, 44);
		contentPane_1.add(lblLoginPassword);
		
		lblReenterPassword = new JLabel("RE-ENTER PASSWORD");
		lblReenterPassword.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblReenterPassword.setBounds(10, 261, 242, 44);
		contentPane_1.add(lblReenterPassword);
		
		lblMobileNumber = new JLabel("MOBILE NUMBER");
		lblMobileNumber.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblMobileNumber.setBounds(10, 315, 242, 34);
		contentPane_1.add(lblMobileNumber);
		
		lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblEmail.setBounds(10, 359, 242, 34);
		contentPane_1.add(lblEmail);
		
		lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblAddress.setBounds(10, 403, 242, 34);
		contentPane_1.add(lblAddress);
		
		lblMembershipCardNumber = new JLabel("MEMBERSHIP CARD NUMBER\r\n(if any)");
		lblMembershipCardNumber.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblMembershipCardNumber.setBounds(10, 436, 325, 64);
		contentPane_1.add(lblMembershipCardNumber);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(339, 106, 304, 34);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(339, 167, 304, 27);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(339, 318, 304, 34);
		contentPane_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(339, 362, 304, 34);
		contentPane_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(339, 409, 304, 27);
		contentPane_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(339, 449, 304, 34);
		contentPane_1.add(textField_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(339, 210, 304, 27);
		contentPane_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(339, 264, 304, 34);
		contentPane_1.add(passwordField_1);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					DatabaseConnection connectnow=new DatabaseConnection();
					Connection connectDB=connectnow.getConnection();
					String Name = textField.getText();
		                String userName = textField_1.getText();
		                String emailId = textField_3.getText();
		               String address = textField_4.getText();
		                String mobileNumber = textField_2.getText();
		                int len = mobileNumber.length();
		                String password = passwordField.getText();
		                String password1=passwordField_1.getText();
		               String cardno=	textField_5.getText();
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
                     //  String query = "INSERT INTO newaccount(password1,email_id,address,cardno) values( '"+ password + "','" + emailId + "','" + address + "','"+cardno+ "') where ";
		            	   String query="Update newaccount set password1='"+password+"',email_id='"+emailId+"',address='"+address+"', cardno='"+cardno+"' where user_name='"+userName+"' ";
	                       PreparedStatement sta = connectDB.prepareStatement(query);
	                       int x = sta.executeUpdate(query);
	                       if (x == 0) {
	                           JOptionPane.showMessageDialog(null, "The record already exist");
	                       } else {
	                    	   DatabaseConnection connectnow1=new DatabaseConnection();
	       					Connection connectDB1=connectnow1.getConnection();
	       					try {
	                           JOptionPane.showMessageDialog(null, "Welcome, " + msg + "Your account is sucessfully Updated\n Login again !!");
	                           ///////////////////////////////////////
	                        //   String query1="insert into login1 (login_name,login_pwd,id_account) values ('"+ userName +"','"+password+"',(select id_account from newaccount where user_name='"+ userName +"'))";
	                          // String query1="insert into login() login_name='"+ userName +"', login_pwd='"+ password +"' , id_account=(select id_account from newaccount where user_name='"+ Name +"')";	                     
	                      //     System.out.println("Record updated!!");
	                           
	                    //////////////////////
	                           String query2="select id_account from newaccount where user_name='"+ userName +"'";
	                           Statement statement=connectDB1.createStatement();
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
	                       btnlg.setVisible(true);
	                       new HomePage().setVisible(true);
	       				System.out.println("Hello");
	       			dispose();
	                       
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
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnUpdate.setBounds(120, 510, 168, 44);
		contentPane_1.add(btnUpdate);
		
		btnlg = new JButton("Login Again");
		btnlg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlg.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnlg.setBounds(298, 510, 168, 44);
		contentPane_1.add(btnlg);
		
		cardlayout =(CardLayout)(pane.getLayout());
		
		
		
		
		 btnNewButton = new JButton("Update Contact ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseConnection connectnow=new DatabaseConnection();
				Connection connectDB=connectnow.getConnection();
			//	String lblwelname1=
				System.out.println(Welname);
				try {
					
					String query="select name,user_name,password1,mobile_number,email_id,address,cardno from newaccount where user_name='"+Welname+"'";
	   					PreparedStatement st=connectDB.prepareStatement(query);
	   					ResultSet rs=st.executeQuery();
	   					while(rs.next()) {
	   						
	   						 textField.setText(rs.getString(1));
			                 textField_1.setText(rs.getString(2));
			                 passwordField.getText();
			                 textField_2.setText(rs.getString(4));
			               textField_3.setText(rs.getString(5));
			               textField_4.setText(rs.getString(6));
			               textField_5.setText(rs.getString(7));
			              
	   						
	   					}
						
					}catch(Exception eu) {
						System.out.println(eu);
					}
					
				cardlayout.show(pane,"updatepane");
				
		
				
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 162, 244, 59);
		panel_1.add(btnNewButton);
		
		 btnShopProducts = new JButton("Shop Products");
		btnShopProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(pane,"productpane");
				try {
					
					
					
					
					
				}catch(Exception ep) {
					System.out.println("Exception ep"+ep);
				}
				
				
			}
		});
		btnShopProducts.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnShopProducts.setBounds(10, 259, 244, 59);
		panel_1.add(btnShopProducts);
		
		JButton btnShoppingCart = new JButton("Shopping Cart");
		btnShoppingCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(pane,"cartpane");
				
				
				
				
				//////////////////////////////////
				
			}
		});
		btnShoppingCart.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnShoppingCart.setBounds(10, 365, 244, 59);
		panel_1.add(btnShoppingCart);
		
		JButton btnCheckout = new JButton("PAY");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(pane,"paypane");
				

			//	private void checkcardno() {
					// TODO Auto-generated method stub
					
					if(rdbtnyes.isSelected()==true) {
						
						lblcarddisplay.setVisible(true);
						cardnotextField.setVisible(true);
					
						
						
					}else {
						DatabaseConnection connectnow=new DatabaseConnection();
						Connection connectDB=connectnow.getConnection();
						try {
							
							String query="select cardno from newaccount where id_account=(select id_account from login where login_id =' "+ lbluser+"') ";
							PreparedStatement st=connectDB.prepareStatement(query);
							ResultSet rs=st.executeQuery();
							while(rs.next()) {
								JOptionPane.showMessageDialog(null,"15% member discount will be applied");
							}
							
						}catch(Exception ec) {
							System.out.println(ec);
						}
					}
					
					
				
				
			}
		});
		btnCheckout.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnCheckout.setBounds(10, 458, 244, 59);
		panel_1.add(btnCheckout);
		
		lbluser = new JLabel("");
		lbluser.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 18));
		lbluser.setBounds(203, 95, 49, 31);
		panel_1.add(lbluser);
		
		btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(53, 570, 126, 31);
		panel_1.add(btnNewButton_2);
		
		DatabaseConnection connectnow=new DatabaseConnection();
		Connection connectDB=connectnow.getConnection();
		//DISPLAY NAME
		
		
		
	//8888888888888888888888888888888888888888 MENS88888888888888888888888888888888888888888888888888888888888888888888888888888888888888
			try {
				 PreparedStatement st= connectDB.prepareStatement("Select * from NewProduct where p_item='MEN' and product_name='MEN JACKET' ");
			      ResultSet rs= st.executeQuery();
			      while(rs.next()) {
			    	  lbluser.setText(rs.getString("login_id"));
			    	pid1.setText(rs.getString("pid"));
			    	
			    	  lblpname1.setText(rs.getString("product_name"));
			    	  textArea1.setText(rs.getString("product_description"));
			    	  lblprice1.setText(rs.getString("price"));
			         qtylabel1_hidden.setText(rs.getString("Qty"));
			         String j_qty=qtylabel1_hidden.getText();
			          System.out.println(" PRoduct Table Quantity"+j_qty);
			        	   int item_price1=rs.getInt("price");
			        // if(comboBox_3.getSelectedItem() != null) {
			         int tot=comboBox_3.getSelectedIndex()+1;
			         lblamount4.setText(rs.getString("price"));
			         System.out.println(tot);
			         int  f_price=tot*item_price1;
			         System.out.println(f_price);
			        // S val1=Integer.valueOf(f_price);
			         lblamount4.setText(Integer.toString(f_price));
			      }
			       //  qtySelected();
			         rs.close();
			         st.close();
			     
			          PreparedStatement st2= connectDB.prepareStatement("Select * from NewProduct where p_item='MEN' and product_name='MEN JEAN' ");
				      ResultSet rs2= st2.executeQuery();
				      while(rs2.next()) {
				    	  lbluser.setText(rs2.getString("login_id"));  			    	
				    	  pid2.setText(rs2.getString("pid"));
				    	  lblpname2.setText(rs2.getString("product_name"));
				    	  textArea2.setText(rs2.getString("product_description"));
				    	  lblprice2.setText(rs2.getString("price"));
				    	  qtylabel1_hidden_2.setText(rs2.getString("Qty"));
				    	  lblamount2.setText(rs2.getString("price")); 
				    	 
				         String j_qty2=qtylabel1_hidden_2.getText();
				          System.out.println(" PRoduct Table Quantity"+j_qty2);
				        	   int item_price2=rs2.getInt("price");
				        	   
				        // if(comboBox.getSelectedItem() != null) {
				         int tot2=comboBox_1.getSelectedIndex()+1;
				         lblamount2.setText(rs2.getString("price"));  
				         System.out.println(tot2);
				         int  f_price2=tot2*item_price2;
				         System.out.println(f_price2);
				        // S val1=Integer.valueOf(f_price);
				         lblamount2.setText(Integer.toString(f_price2));
				       
				         		          
				          }
				         
				         // st2.close();
				         // rs2.close();
				          PreparedStatement st3= connectDB.prepareStatement("Select * from NewProduct where p_item='MEN' and product_name='MEN T-SHIRT' ");
					      ResultSet rs3= st3.executeQuery();
					      while(rs3.next()) {
					    	  
					    		pid3.setText(rs3.getString("pid"));
					    	
					    	  lblpname3.setText(rs3.getString("product_name"));
					    	  textArea3.setText(rs3.getString("product_description"));
					    	  lblprice3.setText(rs3.getString("price"));
					    	  qtylabel1_hidden_3.setText(rs3.getString("Qty"));
					         String j_qty3=qtylabel1_hidden_3.getText();
					          System.out.println(" PRoduct Table Quantity"+j_qty3);
					        	   int item_price3=rs3.getInt("price");
					        	   lblamount3.setText(rs3.getString("price"));
					        // if(comboBox.getSelectedItem() != null) {
					         int tot3=comboBox_2.getSelectedIndex()+1;
					        // lblamount3.setText(" ");
					         System.out.println(tot3);
					         int  f_price3=tot3*item_price3;
					         System.out.println(f_price3);
					        // S val1=Integer.valueOf(f_price);
					         lblamount2.setText(Integer.toString(f_price3));
					       
					         		          
					          }
					         
					      
			          
			          
			}catch(Exception e3) {
				System.out.println(e3);
			}
			
	//	88888888888888888888888888888888888888888888888 WOMENS88888888888888888888888888888888888888888888888888888888888
		try {
			 PreparedStatement st= connectDB.prepareStatement("Select * from NewProduct where p_item='WOMEN' and product_name='WOMEN JACKET' ");
		      ResultSet rs= st.executeQuery();
		      while(rs.next()) {
		    	  lbluser.setText(rs.getString("login_id"));
		    	pid4.setText(rs.getString("pid"));
		    	
		    	  lblpname4.setText(rs.getString("product_name"));
		    	  textArea4.setText(rs.getString("product_description"));
		    	  lblprice4.setText(rs.getString("price"));
		         qtylabel1_hidden_5.setText(rs.getString("Qty"));
		         String j_qty=qtylabel1_hidden_5.getText();
		          System.out.println(" PRoduct Table Quantity"+j_qty);
		        	   int item_price1=rs.getInt("price");
		        // if(comboBox.getSelectedItem() != null) {
		         int tot=comboBox_3.getSelectedIndex()+1;
		         lblamount5.setText(rs.getString("price"));
		         System.out.println(tot);
		         int  f_price=tot*item_price1;
		         System.out.println(f_price);
		        // S val1=Integer.valueOf(f_price);
		         lblamount1.setText(Integer.toString(f_price));
		      }
		       //  qtySelected();
		         rs.close();
		         st.close();
		     
		          PreparedStatement st2= connectDB.prepareStatement("Select * from NewProduct where p_item='WOMEN' and product_name='WOMEN JEAN' ");
			      ResultSet rs2= st2.executeQuery();
			      while(rs2.next()) {
			    	  lbluser.setText(rs2.getString("login_id"));  			    	
			    	  pid5.setText(rs2.getString("pid"));
			    	  lblpname5.setText(rs2.getString("product_name"));
			    	  textArea5.setText(rs2.getString("product_description"));
			    	  lblprice5.setText(rs2.getString("price"));
			    	  qtylabel1_hidden_7.setText(rs2.getString("Qty"));
			    	  lblamount5.setText(rs2.getString("price")); 
			    	 
			         String j_qty2=qtylabel1_hidden_7.getText();
			          System.out.println(" PRoduct Table Quantity"+j_qty2);
			        	   int item_price2=rs2.getInt("price");
			        	   
			        // if(comboBox.getSelectedItem() != null) {
			         int tot2=comboBox_4.getSelectedIndex()+1;
			         lblamount5.setText(rs2.getString("price"));  
			         System.out.println(tot2);
			         int  f_price2=tot2*item_price2;
			         System.out.println(f_price2);
			        // S val1=Integer.valueOf(f_price);
			         lblamount2.setText(Integer.toString(f_price2));
			       
			         		          
			          }
			         
			         // st2.close();
			         // rs2.close();
			          PreparedStatement st3= connectDB.prepareStatement("Select * from NewProduct where p_item='WOMEN' and product_name='WOMEN T-SHIRT' ");
				      ResultSet rs3= st3.executeQuery();
				      while(rs3.next()) {
				    	  
				    		pid6.setText(rs3.getString("pid"));
				    	
				    	  lblpname6.setText(rs3.getString("product_name"));
				    	  textArea6.setText(rs3.getString("product_description"));
				    	  lblprice6.setText(rs3.getString("price"));
				    	  qtylabel1_hidden_9.setText(rs3.getString("Qty"));
				         String j_qty3=qtylabel1_hidden_9.getText();
				          System.out.println(" PRoduct Table Quantity"+j_qty3);
				        	   int item_price3=rs3.getInt("price");
				        	   lblamount6.setText(rs3.getString("price"));
				        // if(comboBox.getSelectedItem() != null) {
				         int tot3=comboBox_5.getSelectedIndex()+1;
				        // lblamount3.setText(" ");
				         System.out.println(tot3);
				         int  f_price3=tot3*item_price3;
				         System.out.println(f_price3);
				        // S val1=Integer.valueOf(f_price);
				         lblamount6.setText(Integer.toString(f_price3));
				       
				         		          
				          }
				         
				      
		          
		          
		}catch(Exception e3) {
			System.out.println(e3);
		}
		
	
//		88888888888888888888888888888888888888888888888 KID 88888888888888888888888888888888888888888888888888888888888
			try {
				 PreparedStatement st= connectDB.prepareStatement("Select * from NewProduct where p_item='KID' and product_name='KID JEAN' ");
			      ResultSet rs= st.executeQuery();
			      while(rs.next()) {
			    	  lbluser.setText(rs.getString("login_id"));
			    	pid7.setText(rs.getString("pid"));
			    	
			    	  lblpname7.setText(rs.getString("product_name"));
			    	  textArea7.setText(rs.getString("product_description"));
			    	  lblprice7.setText(rs.getString("price"));
			         qtylabel1_hidden_11.setText(rs.getString("Qty"));
			         String j_qty=qtylabel1_hidden_11.getText();
			          System.out.println(" PRoduct Table Quantity"+j_qty);
			        	   int item_price1=rs.getInt("price");
			        // if(comboBox.getSelectedItem() != null) {
			         int tot=comboBox_6.getSelectedIndex()+1;
			         lblamount7.setText(rs.getString("price"));
			         System.out.println(tot);
			         int  f_price=tot*item_price1;
			         System.out.println(f_price);
			        // S val1=Integer.valueOf(f_price);
			         lblamount7.setText(Integer.toString(f_price));
			      }
			       //  qtySelected();
			         rs.close();
			         st.close();
			     
			          PreparedStatement st2= connectDB.prepareStatement("Select * from NewProduct where p_item='KID' and product_name='KID T-SHIRT' ");
				      ResultSet rs2= st2.executeQuery();
				      while(rs2.next()) {
				    	  lbluser.setText(rs2.getString("login_id"));  			    	
				    	  pid8.setText(rs2.getString("pid"));
				    	  lblpname8.setText(rs2.getString("product_name"));
				    	  textArea8.setText(rs2.getString("product_description"));
				    	  lblprice8.setText(rs2.getString("price"));
				    	  qtylabel1_hidden_13.setText(rs2.getString("Qty"));
				    	  lblamount8.setText(rs2.getString("price")); 
				    	 
				         String j_qty2=qtylabel1_hidden_13.getText();
				          System.out.println(" PRoduct Table Quantity"+j_qty2);
				        	   int item_price2=rs2.getInt("price");
				        	   
				        // if(comboBox.getSelectedItem() != null) {
				         int tot2=comboBox_7.getSelectedIndex()+1;
				         lblamount8.setText(rs2.getString("price"));  
				         System.out.println(tot2);
				         int  f_price2=tot2*item_price2;
				         System.out.println(f_price2);
				        // S val1=Integer.valueOf(f_price);
				         lblamount8.setText(Integer.toString(f_price2));
				       
				         		          
				          }
				         
				         // st2.close();
				         // rs2.close();
		
			}catch(Exception e4){
				System.out.println(e4);
			}
		 
	
	}
public void sum()
{
	 model=(DefaultTableModel)table.getModel();
     int sum = 0;
     System.out.println("sum for loop..");
     for(int i1 = 0; i1 < table.getRowCount(); i1++)
     {
         sum = sum + Integer.parseInt(table.getValueAt(i1, 2).toString());
     }
     System.out.println(sum);
     textField_total.setText(Integer.toString(sum));
 }	

	
DecimalFormat dFormat=new DecimalFormat("00");
private JLabel pid2;
private JLabel pid3;
private JLabel pid4;
private JLabel pid5;
private JLabel pid6;
private JLabel qtylabel1_hidden_4;
private JLabel qtylabel1_hidden_5;
private JLabel qtylabel1_hidden_6;
private JLabel qtylabel1_hidden_7;
private JLabel qtylabel1_hidden_8;
private JLabel qtylabel1_hidden_9;
private JLabel pid7;
private JLabel qtylabel1_hidden_10;
private JLabel qtylabel1_hidden_11;
private JLabel pid8;
private JLabel qtylabel1_hidden_12;
private JLabel qtylabel1_hidden_13;
private JLabel lblamount5;
private JLabel pid4_2;
private JLabel qtylabel1_hidden_15;
private JLabel pid4_3;
private JLabel qtylabel1_hidden_16;
private JPanel panel_9;
private JLabel lblNewLabel_2_1;
private JLabel lblmemdis;
private JLabel lblwelname;
private JPanel contentPane_1;
private JPanel panel_11;
private JLabel lblContactInformation;
private JLabel lblname;
private JLabel lblusername;
private JLabel lblLoginPassword;
private JLabel lblReenterPassword;
private JLabel lblMobileNumber;
private JLabel lblEmail;
private JLabel lblAddress;
private JLabel lblMembershipCardNumber;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JPasswordField passwordField;
private JPasswordField passwordField_1;
private JButton btnUpdate;
private JButton btnlg;
private JPanel panel_14;
private JButton btnNewButton_2;

public void countdownTimer() {
	System.out.println("Timer" );
	 timer=new Timer(1000,new ActionListener()
			 {
//@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub 
	second--;
	ddSecond=dFormat.format(second);
	ddMinute=dFormat.format(minute);
	lbltimer.setText(ddMinute+":"+ddSecond);
	System.out.println("Set Time" );
	if(second==-1) {
		second=59;
		minute--;
		ddSecond=dFormat.format(second);
		ddMinute=dFormat.format(minute);
		lbltimer.setText(ddMinute+":"+ddSecond);
		
	}
	else if(minute==0 && second==0) {
		timer.stop();
		btnApply.setVisible(false);
		btnpaynow.setVisible(false);
		btnPay.setVisible(true);
		
	}
	//timer.stop();
}
	 

});
}

public void tablefunction() {
	int lbluser1=Integer.parseInt(lbluser.getText());
	DatabaseConnection connectnow=new DatabaseConnection();
	Connection connectDB=connectnow.getConnection();
	try {
		String query="Select product_name,Qty,price from NewOrder where login_id='"+lbluser1+"' order by order_id desc limit 1 ";
		PreparedStatement st= connectDB.prepareStatement(query);
		ResultSet rs=st.executeQuery();
		System.out.println(query);
		 rsmd=rs.getMetaData();
		 model=(DefaultTableModel)table.getModel();
	int cols=rsmd.getColumnCount();
		double total=0;
		System.out.println("Tot"+total);
		String[] colName=new String[cols];
		for(int i=0;i<cols;i++) {
			//colName[i]=rsmd.getColumnName(i+1);
			//model.setColumnIdentifiers(colName);
			String pname,pqty,pprice;
			while(rs.next()) {
				pname=rs.getString(1);
				System.out.println(pname);
				pqty=rs.getString(2);
				System.out.println(pqty);
				pprice=rs.getString(3);
				System.out.println(pprice);
				String[] row= {pname,pqty,pprice};
				model.addRow(row);
				
			}
		//	System.out.println("End of  while");
			sum();
			
			//PreparedStatement st1= connectDB.prepareStatement("Select SUM(price) from NewOrder ");
		//	int x=st1.executeUpdate();
		//	System.out.println(x);
			
		//	
			
				
		}	
			//int y=table.setText(total);
		}	
		
		
		
		
		
	catch(Exception e1) {
		System.out.println(e1);
	}

	
}

public void combofun(int selection) {

DatabaseConnection connectnow=new DatabaseConnection();
Connection connectDB=connectnow.getConnection();
	
	
	try {
		switch(selection) {
		case 3:
		{
	String verifyLogin= "Select price from NewProduct where p_item='WOMEN' and product_name='WOMEN JACKET' ";
	PreparedStatement st= connectDB.prepareStatement(verifyLogin);
	ResultSet rs=st.executeQuery();

	while(rs.next()) {
	int item_price1=rs.getInt("price");
        
         int tot=comboBox_3.getSelectedIndex()+1;
        // lblamount1.setText(" ");
         System.out.println(tot);
         int  f_price=tot*item_price1;
         System.out.println(f_price);
        
         lblamount4.setText(Integer.toString(f_price));
          System.out.println("mouseEvent"+f_price);
	}
		}
	
	
		case 4:
		{
			String verifyLogin= "Select price from NewProduct where p_item='WOMEN' and product_name='WOMEN JEAN' ";
			PreparedStatement st= connectDB.prepareStatement(verifyLogin);
			ResultSet rs=st.executeQuery();

			while(rs.next()) {
			int item_price1=rs.getInt("price");
		        
		         int tot=comboBox_4.getSelectedIndex()+1;
		        // lblamount1.setText(" ");
		         System.out.println(tot);
		         int  f_price=tot*item_price1;
		         System.out.println(f_price);
		        
		         lblamount5.setText(Integer.toString(f_price));
		          System.out.println("mouseEvent"+f_price);
		}
	}
		case 5:
		{
			String verifyLogin= "Select price from NewProduct where p_item='WOMEN' and product_name='WOMEN T-SHIRT' ";
			PreparedStatement st= connectDB.prepareStatement(verifyLogin);
			ResultSet rs=st.executeQuery();

			while(rs.next()) {
			int item_price1=rs.getInt("price");
		        
		         int tot=comboBox_5.getSelectedIndex()+1;
		        // lblamount1.setText(" ");
		         System.out.println(tot);
		         int  f_price=tot*item_price1;
		         System.out.println(f_price);
		        
		         lblamount6.setText(Integer.toString(f_price));
		          System.out.println("mouseEvent"+f_price);
		}
		}
		
		case 6:
		{
			String verifyLogin= "Select price from NewProduct where p_item='KID' and product_name='KID JEAN' ";
			PreparedStatement st= connectDB.prepareStatement(verifyLogin);
			ResultSet rs=st.executeQuery();

			while(rs.next()) {
			int item_price1=rs.getInt("price");
		        
		         int tot=comboBox_6.getSelectedIndex()+1;
		        // lblamount1.setText(" ");
		         System.out.println(tot);
		         int  f_price=tot*item_price1;
		         System.out.println(f_price);
		        
		         lblamount7.setText(Integer.toString(f_price));
		          System.out.println("mouseEvent"+f_price);
		}
		
		}
		case 7:
		{
			String verifyLogin= "Select price from NewProduct where p_item='KID' and product_name='KID T-SHIRT' ";
			PreparedStatement st= connectDB.prepareStatement(verifyLogin);
			ResultSet rs=st.executeQuery();

			while(rs.next()) {
			int item_price1=rs.getInt("price");
		        
		         int tot=comboBox_7.getSelectedIndex()+1;
		        // lblamount1.setText(" ");
		         System.out.println(tot);
		         int  f_price=tot*item_price1;
		         System.out.println(f_price);
		        
		         lblamount8.setText(Integer.toString(f_price));
		          System.out.println("mouseEvent"+f_price);
		}
		
		}
		
	
		}
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
	
	

	
}
public void addtocart(String product_id, String plabel1,int Qty1,int tot_amount,int lbluser1,int updated_quantity) {
	//int product_id,Qty1,tot_amount,lbluser1;
	
	

try {
	 Connection con = DriverManager.getConnection("jdbc:mysql:///capsdb", "root", "root@123");
	 System.out.println("Connection ");
	  String query="INSERT INTO NewOrder (pid,product_name,Qty,price,login_id) values('" + product_id + "',' " + plabel1 + "',' " + Qty1 + "','" + tot_amount + "','" +lbluser1+" ')";
  //  ResultSet rs= st.executeQuery();
	  System.out.println(query);
	  PreparedStatement sta = con.prepareStatement(query);
    int x = sta.executeUpdate(query);
    System.out.println("Inside Statement");
    if (x == 0) {
        JOptionPane.showMessageDialog(null, "The record already exist");
    } else {
        JOptionPane.showMessageDialog(null,"OrderUpdated");
        System.out.println(Qty1);
        String query1="Update NewProduct SET QTY='" +updated_quantity +"' where pid='"+product_id+"'";
        PreparedStatement sta1 = con.prepareStatement(query1);
        sta1.executeUpdate(query1);
        System.out.println(query1);
        System.out.println("Inside query1");

    }
}catch(Exception e) {
	System.out.println(e);
}

}

void setUser(String name) {
	String welname=name;
	lblwelname.setText(welname);
}
}
	

	


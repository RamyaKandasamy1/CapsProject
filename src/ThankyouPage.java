import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThankyouPage extends JFrame {

	private JPanel contentPane;
	protected static String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThankyouPage frame = new ThankyouPage(name);
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
	public ThankyouPage(String name) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 737, 342);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ramz8\\Pictures\\Saved Pictures\\Shop.png"));
		lblNewLabel.setBounds(0, 10, 749, 327);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ramz8\\Pictures\\Saved Pictures\\ERJ.png"));
		lblNewLabel_1.setBounds(606, 375, 123, 93);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Thank You for shopping @");
		lblNewLabel_2.setFont(new Font("SimSun", Font.ITALIC, 28));
		lblNewLabel_2.setBounds(217, 375, 367, 93);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Your item is on the way!!");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(10, 375, 207, 93);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(627, 469, 85, 21);
		contentPane.add(btnNewButton);
	}

	public void ThankyouPage(String name2) {
		// TODO Auto-generated method stub
		
	}

}

package mainmenu;
import java.awt.Dimension;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.peer.FramePeer;
import java.awt.event.ActionEvent;

public class ministryofhealth {

	private JFrame ministryofhealthlogin;
	private JPasswordField txtpassword;
	private JTextField txtuser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ministryofhealth window = new ministryofhealth();
					window.ministryofhealthlogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ministryofhealth() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ministryofhealthlogin = new JFrame();
		ministryofhealthlogin.setBounds(200, 200 , 500, 300);
		ministryofhealthlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ministryofhealthlogin.getContentPane().setLayout(null);
		
		JLabel lblMinistryOfHealth = new JLabel("Ministry Of Health");
		lblMinistryOfHealth.setBounds(195, 11, 127, 24);
		ministryofhealthlogin.getContentPane().add(lblMinistryOfHealth);
		
		JLabel lblLogIn = new JLabel("Log in");
		lblLogIn.setBounds(225, 40, 46, 14);
		ministryofhealthlogin.getContentPane().add(lblLogIn);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(71, 89, 71, 14);
		ministryofhealthlogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(71, 134, 46, 14);
		ministryofhealthlogin.getContentPane().add(lblPassword);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(188, 131, 198, 20);
		ministryofhealthlogin.getContentPane().add(txtpassword);
		
		txtuser = new JTextField();
		txtuser.setBounds(188, 86, 198, 20);
		ministryofhealthlogin.getContentPane().add(txtuser);
		txtuser.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(57, 177, 369, 2);
		ministryofhealthlogin.getContentPane().add(separator);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtpassword.getText();
				String username = txtuser.getText();
				
				if(password.contains("admin")&& username.contains("admin")) {
					txtpassword.setText(null);
					txtuser.setText(null);
					txtmainmenu info = new txtmainmenu();
					txtmainmenu.main(null);
					ministryofhealthlogin.setVisible(false);
		
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Log in Details","login Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogIn.setBounds(150, 202, 89, 23);
		ministryofhealthlogin.getContentPane().add(btnLogIn);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtuser.setText(null);
				txtpassword.setText(null);
			}
		});
		btnReset.setBounds(279, 202, 89, 23);
		ministryofhealthlogin.getContentPane().add(btnReset);
	}
}

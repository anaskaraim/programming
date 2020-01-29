package mainmenu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import clinics.ClinicMenu;
import paitientmenu.txtpaitientmenu1;
public class txtmainmenu {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					txtmainmenu window = new txtmainmenu();
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
	public txtmainmenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 txtpaitientmenu1.main(null);

			}
		});
		btnPatient.setBounds(148, 23, 138, 50);
		frame.getContentPane().add(btnPatient);
		
		JButton btnNewButton = new JButton("Clincs");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClinicMenu.main(null);
			}
		});
		btnNewButton.setBounds(148, 84, 138, 50);
		frame.getContentPane().add(btnNewButton);
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSignOut.setBounds(148, 143, 138, 50);
		frame.getContentPane().add(btnSignOut);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

package paitientmenu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import exsist.exsistpatient1;
import newpatient.newpatientinfo1;

public class txtpaitientmenu1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					txtpaitientmenu1 window = new txtpaitientmenu1();
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
	public txtpaitientmenu1() {
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
		
		JButton btnNewPatient = new JButton("Exist Patient");
		btnNewPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				exsistpatient1 info = new exsistpatient1();
				exsistpatient1.main(null);
				
				
			}
		});
		btnNewPatient.setBounds(154, 118, 135, 50);
		frame.getContentPane().add(btnNewPatient);
		
		JButton btnNewButton = new JButton("New Patient");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				newpatientinfo1 info = new newpatientinfo1();
				newpatientinfo1.main(null);
			}
		});
		btnNewButton.setBounds(154, 57, 135, 50);
		frame.getContentPane().add(btnNewButton);
	}
}

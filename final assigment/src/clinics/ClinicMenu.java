package clinics;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import exsist.exsistpatient1;
import newpatient.newpatientinfo1;

public class ClinicMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClinicMenu window = new ClinicMenu();
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
	public ClinicMenu() {
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
		
		JButton btnNewPatient = new JButton("Exist Clinic");
		btnNewPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clinics1.main(null);
				
				
			}
		});
		btnNewPatient.setBounds(154, 118, 135, 50);
		frame.getContentPane().add(btnNewPatient);
		JButton btnNewButton = new JButton("New Clinic");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateClinics.main(null);
			}
		});
		btnNewButton.setBounds(154, 57, 135, 50);
		frame.getContentPane().add(btnNewButton);
	}
}

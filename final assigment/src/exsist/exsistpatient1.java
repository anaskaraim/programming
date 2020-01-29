package exsist;

import java.awt.EventQueue;
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

import javax.swing.JFrame;

import mainmenu.txtmainmenu;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exsistpatient1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exsistpatient1 window = new exsistpatient1();
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
	public exsistpatient1() {
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
		
		JButton btnNewButton = new JButton("Medical Diagnosis");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MedicalDiagnosis info = new MedicalDiagnosis();
				MedicalDiagnosis.main(null);
				
				
	
	
			}
		});
		btnNewButton.setBounds(141, 63, 153, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRequestMedicalTests = new JButton("Request medical tests");
		btnRequestMedicalTests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				medicaltests info = new medicaltests();
				medicaltests.main(null);
				
			}
		});
		btnRequestMedicalTests.setBounds(141, 110, 153, 37);
		frame.getContentPane().add(btnRequestMedicalTests);
		
		JButton btnHealthSummry = new JButton("Health summry");
		btnHealthSummry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHealthSummry.setBounds(141, 158, 153, 37);
		frame.getContentPane().add(btnHealthSummry);
	}
}

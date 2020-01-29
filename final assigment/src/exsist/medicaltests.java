package exsist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class medicaltests {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					medicaltests window = new medicaltests();
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
	public medicaltests() {
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
		
		JLabel lblRequestMedicalTests = new JLabel("Request medical tests");
		lblRequestMedicalTests.setBounds(159, 25, 105, 14);
		frame.getContentPane().add(lblRequestMedicalTests);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(44, 82, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(197, 79, 166, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTypeOfMedical = new JLabel("Type of medical test");
		lblTypeOfMedical.setBounds(44, 143, 105, 14);
		frame.getContentPane().add(lblTypeOfMedical);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 140, 166, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 195, 361, 2);
		frame.getContentPane().add(separator);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(175, 216, 89, 23);
		frame.getContentPane().add(btnSave);
	}
}

package clinics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class CreateClinics {

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
					CreateClinics window = new CreateClinics();
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
	public CreateClinics() {
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
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(103, 185, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(228, 185, 89, 23);
		frame.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(149, 67, 226, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 108, 226, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("Govermorate");
		label.setBounds(56, 70, 88, 14);
		frame.getContentPane().add(label);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(56, 111, 88, 14);
		frame.getContentPane().add(lblArea);
		
		JLabel lblCreatClincs = new JLabel("Creat Clincs");
		lblCreatClincs.setBounds(180, 26, 88, 14);
		frame.getContentPane().add(lblCreatClincs);
	}
}

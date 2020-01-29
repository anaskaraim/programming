package exsist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class serch {

	private JFrame frame;
	private JTextField textField;
	private JLabel label;
	private JLabel lblHealthSummry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					serch window = new serch();
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
	public serch() {
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
		
		textField = new JTextField();
		textField.setBounds(168, 81, 187, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSerch = new JButton("serch");
		btnSerch.setBounds(159, 157, 89, 23);
		frame.getContentPane().add(btnSerch);
		
		label = new JLabel("Name");
		label.setBounds(62, 84, 46, 14);
		frame.getContentPane().add(label);
		
		lblHealthSummry = new JLabel("Health summry");
		lblHealthSummry.setBounds(166, 29, 189, 14);
		frame.getContentPane().add(lblHealthSummry);
	}
}

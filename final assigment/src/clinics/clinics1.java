package clinics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class clinics1 {

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
					clinics1 window = new clinics1();
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
	public clinics1() {
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
		
		JLabel lblClincs = new JLabel("Clincs");
		lblClincs.setHorizontalAlignment(SwingConstants.CENTER);
		lblClincs.setBounds(183, 11, 68, 25);
		frame.getContentPane().add(lblClincs);
		
		JLabel lblRe = new JLabel("Govermorate");
		lblRe.setBounds(73, 92, 88, 14);
		frame.getContentPane().add(lblRe);
		
		textField = new JTextField();
		textField.setBounds(167, 89, 157, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(118, 34, 198, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Area");
		lblNewLabel.setBounds(84, 137, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(167, 131, 157, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(172, 190, 89, 23);
		frame.getContentPane().add(btnSearch);
	}
}

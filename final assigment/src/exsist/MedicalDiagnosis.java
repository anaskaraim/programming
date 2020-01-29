package exsist;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField; 


public class MedicalDiagnosis {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicalDiagnosis window = new MedicalDiagnosis();
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
	public MedicalDiagnosis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 850, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMedicalDiagnosis = new JLabel("Medical Diagnosis");
		lblMedicalDiagnosis.setBounds(371, 27, 91, 14);
		frame.getContentPane().add(lblMedicalDiagnosis);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(61, 62, 61, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(145, 59, 207, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMedicalId = new JLabel("Medical ID");
		lblMedicalId.setBounds(445, 62, 70, 14);
		frame.getContentPane().add(lblMedicalId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(561, 59, 207, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Symptoms");
		lblNewLabel.setBounds(61, 121, 61, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(145, 118, 207, 92);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Diagnose");
		lblNewLabel_1.setBounds(445, 121, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(561, 121, 207, 92);
		frame.getContentPane().add(textField_3);
		
		JLabel lblTherapy = new JLabel("Therapy");
		lblTherapy.setBounds(61, 243, 46, 14);
		frame.getContentPane().add(lblTherapy);
		
		textField_4 = new JTextField();
		textField_4.setBounds(145, 242, 207, 61);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(77, 340, 710, 2);
		frame.getContentPane().add(separator);
		
		JButton btnSave_1 = new JButton("save");
		btnSave_1.setBounds(373, 379, 89, 23);
		frame.getContentPane().add(btnSave_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			private Scanner scan;

			public void actionPerformed(ActionEvent arg0) {
				
				File file = new File ("C:\\Users\\metaw\\OneDrive\\Desktop\\New folder\\medicaldiagnose.txt");
				try {
					scan = new Scanner(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			Scanner scan = null;
			while(scan.hasNextLine()) {
			
				System.out.println(scan.hasNextLine());
			}
			
		
		btnSave.setBounds(361, 372, 130, 42);
		frame.getContentPane().add(btnSave);
			}
		});
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
}


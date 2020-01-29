package newpatient;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import mainmenu.WriteToFile;

import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class newpatientinfo1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private String name;
	private String phone;
	private String idnum;
	private String mstaus;
	private String healthcondition;
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newpatientinfo1 window = new newpatientinfo1();
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
	public newpatientinfo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 400, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewPatient = new JLabel("New Patient");
		lblNewPatient.setBounds(569, 29, 74, 14);
		frame.getContentPane().add(lblNewPatient);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(76, 86, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblIdNumber = new JLabel("ID Number");
		lblIdNumber.setBounds(597, 86, 66, 14);
		frame.getContentPane().add(lblIdNumber);
		
		textField = new JTextField();
		textField.setBounds(202, 83, 249, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(693, 80, 249, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblHealthCondition = new JLabel("Health Condition");
		lblHealthCondition.setBounds(76, 189, 137, 14);
		frame.getContentPane().add(lblHealthCondition);
		
		JLabel lblMaritalStatus = new JLabel("Marital Status");
		lblMaritalStatus.setBounds(592, 142, 86, 14);
		frame.getContentPane().add(lblMaritalStatus);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(76, 142, 85, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(202, 139, 249, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(202, 214, 740, 295);
		frame.getContentPane().add(textField_3);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(693, 138, 74, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(781, 138, 109, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(102, 633, 1, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(121, 583, 916, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(509, 633, 166, 38);
		frame.getContentPane().add(btnSave);
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				newpatientinfo1 info = new newpatientinfo1();
				
				info.setName(textField.getText());
				info.setIdnum(textField_1.getText());
				info.setPhone(textField_2.getText());
				info.setMstaus(rdbtnMale.getText()==null?rdbtnFemale.getText():rdbtnMale.getText());
				info.setHealthcondition(textField_3.getText());
				try {
					System.out.println(info);
					WriteToFile.writeDataToFile(info);
				} catch (EncryptedDocumentException | InvalidFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdnum() {
		return idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public String getMstaus() {
		return mstaus;
	}

	public void setMstaus(String mstaus) {
		this.mstaus = mstaus;
	}

	public String getHealthcondition() {
		return healthcondition;
	}

	public void setHealthcondition(String healthcondition) {
		this.healthcondition = healthcondition;
	}

	@Override
	public String toString() {
		return "newpatientinfo1 [name=" + name + ", phone=" + phone + ", idnum=" + idnum + ", mstaus=" + mstaus
				+ ", healthcondition=" + healthcondition + "]";
	}
	
	
}

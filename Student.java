package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Student extends JFrame {

	private JPanel panel1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setBounds(79, 11, 86, 14);
		panel1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(168, 8, 86, 20);
		panel1.add(textField);
		textField.setColumns(10);
		
		JLabel lblStudentNumber = new JLabel("Student Number");
		lblStudentNumber.setBounds(72, 39, 86, 14);
		panel1.add(lblStudentNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 36, 86, 20);
		panel1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(95, 65, 46, 14);
		panel1.add(lblGender);
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		chckbxMale.setBounds(157, 61, 55, 23);
		panel1.add(chckbxMale);
		
		JCheckBox chckbxFemale = new JCheckBox("Female");
		chckbxFemale.setBounds(214, 61, 110, 23);
		panel1.add(chckbxFemale);
		
		JLabel lblMarksInJava = new JLabel("Marks in Java");
		lblMarksInJava.setBounds(79, 90, 86, 14);
		panel1.add(lblMarksInJava);
		
		JLabel lblMarksInDs = new JLabel("Marks in DS");
		lblMarksInDs.setBounds(79, 115, 79, 14);
		panel1.add(lblMarksInDs);
		
		JLabel lblMarksInMaths = new JLabel("Marks in Maths");
		lblMarksInMaths.setBounds(79, 140, 79, 14);
		panel1.add(lblMarksInMaths);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 87, 86, 20);
		panel1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(168, 112, 86, 20);
		panel1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(168, 137, 86, 20);
		panel1.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int m1=Integer.parseInt(textField_2.getText());
	            int m2=Integer.parseInt(textField_3.getText());
	            int m3=Integer.parseInt(textField_4.getText());
				int total = m1+m2+m3;
				String tot = String.valueOf(total);
				textField_5.setText(tot);
				double avg = total/3;
				
			}
		});
		btnTotal.setBounds(76, 218, 89, 23);
		panel1.add(btnTotal);
		
		JButton btnAverge = new JButton("Average");
		btnAverge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m1=Integer.parseInt(textField_2.getText());
	            int m2=Integer.parseInt(textField_3.getText());
	            int m3=Integer.parseInt(textField_4.getText());
				double avg = (m1+m2+m3)/3;
				String ave = String.valueOf(avg);
				textField_6.setText(ave);
			}
		});
		btnAverge.setBounds(179, 218, 89, 23);
		panel1.add(btnAverge);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		         	System.out.print("in");
		         	PreparedStatement pst1 = conn.prepareStatement("insert into result1 (name, rollno, java, ds, maths, total, average) values (?, ?, ?, ?, ?, ?, ?)");
		         	System.out.print("in");
		         	pst1.setInt(2, Integer.parseInt(textField_1.getText()));
		         	pst1.setString(1, textField.getText());
		         	pst1.setInt(3, Integer.parseInt(textField_2.getText()));
		         	pst1.setInt(4, Integer.parseInt(textField_3.getText()));
		         	pst1.setInt(5, Integer.parseInt(textField_4.getText()));
		         	pst1.setInt(6, Integer.parseInt(textField_5.getText()));
		         	pst1.setDouble(7, Double.parseDouble(textField_6.getText()));
		         	pst1.execute();
				}
				catch(Exception ee)
				{
					System.out.println("");
				}
				
			}
		});
		btnSubmit.setBounds(79, 252, 89, 23);
		panel1.add(btnSubmit);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setBounds(79, 190, 63, 14);
		panel1.add(lblAverage);
		
		textField_5 = new JTextField();
		textField_5.setBounds(168, 162, 86, 20);
		panel1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(79, 165, 79, 14);
		panel1.add(lblTotal);
		
		textField_6 = new JTextField();
		textField_6.setBounds(168, 187, 86, 20);
		panel1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnRetrieve = new JButton("Retrieve");
		btnRetrieve.setBounds(179, 252, 89, 23);
		panel1.add(btnRetrieve);
	}
}

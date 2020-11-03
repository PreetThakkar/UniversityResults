package Project;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class getmarks extends JFrame {

	private JPanel getmarksPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					getmarks frame = new getmarks(13201913,"Jayshree");
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
	public getmarks(int seatno, String Mname) {
		try
		{
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			PreparedStatement s = c.prepareStatement("select * from mu where seatno = ? and mname = ?");
			s.setInt(1, seatno);
			s.setString(2, Mname);
			ResultSet r = s.executeQuery();
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 728, 839);
			getmarksPane = new JPanel();
			getmarksPane.setBackground(SystemColor.text);
			getmarksPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(getmarksPane);
			getmarksPane.setLayout(null);
			
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setIcon(new ImageIcon(getmarks.class.getResource("/Project/xlogo_mar.png.pagespeed.ic.JQMhTt0Ai0.png")));
			label.setBounds(0, 13, 757, 76);
			getmarksPane.add(label);
			
			JButton btnBack = new JButton("back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getmarksPane.setBounds(100, 100, 600, 351);
					getmarksPane.setVisible(false);
					marks mark = new marks();
					mark.setVisible(true);
				}
			});
			btnBack.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			btnBack.setBounds(12, 13, 97, 25);
			getmarksPane.add(btnBack);
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField.setBounds(0, 102, 757, 22);
			getmarksPane.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_1.setBounds(0, 137, 757, 22);
			getmarksPane.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_2.setHorizontalAlignment(SwingConstants.CENTER);
			textField_2.setBounds(0, 172, 757, 22);
			getmarksPane.add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_3.setBounds(0, 207, 757, 22);
			getmarksPane.add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_4.setBounds(0, 242, 757, 22);
			getmarksPane.add(textField_4);
			textField_4.setColumns(10);
			
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_5.setHorizontalAlignment(SwingConstants.CENTER);
			textField_5.setBounds(0, 277, 757, 22);
			getmarksPane.add(textField_5);
			textField_5.setColumns(10);
			
			textField_6 = new JTextField();
			textField_6.setEditable(false);
			textField_6.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_6.setBounds(0, 312, 757, 22);
			getmarksPane.add(textField_6);
			textField_6.setColumns(10);
			
			textField_7 = new JTextField();
			textField_7.setEditable(false);
			textField_7.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_7.setBounds(0, 347, 757, 22);
			getmarksPane.add(textField_7);
			textField_7.setColumns(10);
			
			textField_8 = new JTextField();
			textField_8.setEditable(false);
			textField_8.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_8.setHorizontalAlignment(SwingConstants.CENTER);
			textField_8.setBounds(0, 382, 757, 22);
			getmarksPane.add(textField_8);
			textField_8.setColumns(10);
			
			textField_9 = new JTextField();
			textField_9.setEditable(false);
			textField_9.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_9.setBounds(0, 417, 757, 22);
			getmarksPane.add(textField_9);
			textField_9.setColumns(10);
			
			textField_10 = new JTextField();
			textField_10.setEditable(false);
			textField_10.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_10.setBounds(0, 452, 757, 22);
			getmarksPane.add(textField_10);
			textField_10.setColumns(10);
			
			textField_11 = new JTextField();
			textField_11.setEditable(false);
			textField_11.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_11.setHorizontalAlignment(SwingConstants.CENTER);
			textField_11.setBounds(0, 487, 757, 22);
			getmarksPane.add(textField_11);
			textField_11.setColumns(10);
			
			textField_12 = new JTextField();
			textField_12.setEditable(false);
			textField_12.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_12.setBounds(0, 522, 757, 22);
			getmarksPane.add(textField_12);
			textField_12.setColumns(10);
			
			textField_13 = new JTextField();
			textField_13.setEditable(false);
			textField_13.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_13.setBounds(0, 557, 757, 22);
			getmarksPane.add(textField_13);
			textField_13.setColumns(10);
			
			textField_14 = new JTextField();
			textField_14.setEditable(false);
			textField_14.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_14.setHorizontalAlignment(SwingConstants.CENTER);
			textField_14.setBounds(0, 592, 757, 22);
			getmarksPane.add(textField_14);
			textField_14.setColumns(10);
			
			textField_15 = new JTextField();
			textField_15.setEditable(false);
			textField_15.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_15.setBounds(0, 626, 757, 22);
			getmarksPane.add(textField_15);
			textField_15.setColumns(10);
			
			textField_16 = new JTextField();
			textField_16.setEditable(false);
			textField_16.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_16.setBounds(0, 662, 757, 22);
			getmarksPane.add(textField_16);
			textField_16.setColumns(10);
			
			textField_17 = new JTextField();
			textField_17.setEditable(false);
			textField_17.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_17.setHorizontalAlignment(SwingConstants.CENTER);
			textField_17.setBounds(0, 697, 757, 22);
			getmarksPane.add(textField_17);
			textField_17.setColumns(10);
			
			textField_18 = new JTextField();
			textField_18.setEditable(false);
			textField_18.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_18.setBounds(0, 732, 757, 22);
			getmarksPane.add(textField_18);
			textField_18.setColumns(10);
			
			textField_19 = new JTextField();
			textField_19.setEditable(false);
			textField_19.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
			textField_19.setBounds(0, 767, 757, 22);
			getmarksPane.add(textField_19);
			textField_19.setColumns(10);
			
			while(r.next())
			{
				textField.setText("First Name: "+r.getString("fname")+"\tLast Name: "+r.getString("lname"));
				
				textField_1.setText("Result: "+r.getString("Result")+"\tPointer: "+r.getDouble("pointer"));
				textField_2.setText("Applied Mathematics-2");
				textField_3.setText("Pointer: "+r.getString("mp"));
				textField_4.setText("Semester: "+r.getString("msem")+"("+r.getString("msemg")+")\t"+"Internals: "+r.getString("mtt")+"("+r.getString("mttg")+")\t"+"Termwork/Oral: "+r.getString("mtw")+"("+r.getString("mtwg")+")\t\t");
				textField_5.setText("Applied Physics-2");
				textField_6.setText("Pointer: "+r.getString("pp"));
				textField_7.setText("Semester: "+r.getString("psem")+"("+r.getString("psemg")+")"+"\tInternals: "+r.getString("ptt")+"("+r.getString("pttg")+")\t"+"Termwork/Oral: "+r.getString("ptw")+"("+r.getString("ptwg")+")\t\t");
				textField_8.setText("Applied Chemistry-2");
				textField_9.setText("Pointer: "+r.getString("cp"));
				textField_10.setText("Semester: "+r.getString("csem")+"("+r.getString("csemg")+")"+"\tInternals: "+r.getString("ctt")+"("+r.getString("cttg")+")\t"+"Termwork/Oral: "+r.getString("ctw")+"("+r.getString("ctwg")+")\t\t");
				textField_11.setText("Engineering Drawing");
				//textField_12.setText();
				textField_12.setText("Pointer: "+r.getString("edp"));
				textField_13.setText("Semester: "+r.getString("edsem")+"("+r.getString("edsemg")+")"+"\tPracticals: "+r.getString("edprac")+"("+r.getString("edpracg")+")"+"\tInternals: "+r.getString("edtt")+"("+r.getString("edttg")+")\t"+"Termwork/Oral: "+r.getString("edtw")+"("+r.getString("edtwg")+")");
				textField_14.setText("Structured Programming Approach");
				textField_15.setText("Pointer: "+r.getString("spap"));
				textField_16.setText("Semester: "+r.getString("spasem")+"("+r.getString("spasemg")+")"+"\tInternals: "+r.getString("spatt")+"("+r.getString("spattg")+")\t"+"Termwork/Oral: "+r.getString("spatw")+"("+r.getString("spatwg")+")\t\t");
				textField_17.setText("Communication Skills");
				textField_18.setText("Pointer: "+r.getString("csp"));
				textField_19.setText("Semester: "+r.getString("cssem")+"("+r.getString("cssemg")+")"+"\tInternals: "+r.getString("cstt")+"("+r.getString("csttg")+")\t"+"Termwork/Oral: "+r.getString("cstw")+"("+r.getString("cstwg")+")\t\t");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in Connection");
		}
	}
}

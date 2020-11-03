package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class result extends JFrame {

	private JPanel resultPane;
	private JTextField textField;
	private JTextField textField_1;
	private String str;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					result frame = new result();
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
	public result() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 839);
		resultPane = new JPanel();
		resultPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(resultPane);
		resultPane.setLayout(null);
		resultPane.setVisible(true);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(mainpage.class.getResource("/Project/index.png")));
		label_2.setBounds(12, 350, 686, 353);
		resultPane.add(label_2);
		
		
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(result.class.getResource("/Project/xlogo_mar.png.pagespeed.ic.JQMhTt0Ai0.png")));
		label.setBounds(0, 74, 711, 72);
		resultPane.add(label);
		
		JLabel lblSeatNo = new JLabel("Seat No");
		lblSeatNo.setForeground(Color.WHITE);
		lblSeatNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeatNo.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		lblSeatNo.setBounds(237, 210, 85, 16);
		resultPane.add(lblSeatNo);
		
		textField = new JTextField();
		textField.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(360, 207, 116, 22);
		resultPane.add(textField);
		textField.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
					PreparedStatement s = c.prepareStatement("select * from mu where seatno = ?");
					s.setInt(1, Integer.parseInt(textField.getText()));
					ResultSet r = s.executeQuery();
					while(r.next())
					{
					textField_1 = new JTextField("Result  for  "+textField.getText()+"  is  '"+r.getString("result")+"'");
					textField_1.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
					textField_1.setHorizontalAlignment(SwingConstants.CENTER);
					textField_1.setBounds(28, 323, 654, 22);
					resultPane.add(textField_1);
					textField_1.setColumns(50);	
					}
				}
				catch(Exception a)
				{
					System.out.println("Error in Connection");
				}
			}
		});
		btnEnter.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		btnEnter.setBounds(237, 255, 97, 25);
		resultPane.add(btnEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultPane.setVisible(false);
				mainpage mp = new mainpage();
				mp.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		btnBack.setBounds(360, 255, 97, 25);
		resultPane.add(btnBack);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setIcon(new ImageIcon(result.class.getResource("/Project/board_black_line_texture_background_wood_55220_720x1280.png")));
		label_1.setBounds(0, 0, 710, 792);
		resultPane.add(label_1);
		
		this.getRootPane().setDefaultButton(btnEnter);
	}
}

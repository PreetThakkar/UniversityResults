package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
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

public class marks extends JFrame {

	private JPanel marksPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					marks frame = new marks();
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
	public marks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 839);
		marksPane = new JPanel();
		marksPane.setVisible(true);
		marksPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(marksPane);
		marksPane.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(mainpage.class.getResource("/Project/index.png")));
		label_2.setBounds(12, 350, 686, 353);
		marksPane.add(label_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(marks.class.getResource("/Project/xlogo_mar.png.pagespeed.ic.JQMhTt0Ai0.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 74, 711, 72);
		marksPane.add(label);
		
		JLabel lblNewLabel = new JLabel("Seat No");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		lblNewLabel.setBounds(238, 209, 104, 16);
		marksPane.add(lblNewLabel);
		
		JLabel lblMothersName = new JLabel("Mother's Name");
		lblMothersName.setForeground(Color.WHITE);
		lblMothersName.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		lblMothersName.setHorizontalAlignment(SwingConstants.CENTER);
		lblMothersName.setBounds(214, 265, 128, 16);
		marksPane.add(lblMothersName);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		textField.setBounds(374, 206, 116, 22);
		marksPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		textField_1.setBounds(374, 262, 116, 22);
		marksPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marksPane.setVisible(false);
				getmarks g = new getmarks(Integer.parseInt(textField.getText())	, textField_1.getText());
				g.setVisible(true);
			}
		});
		btnEnter.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		btnEnter.setBounds(238, 322, 97, 25);
		marksPane.add(btnEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marksPane.setVisible(false);
				mainpage mp = new mainpage();
				mp.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		btnBack.setBounds(374, 322, 97, 25);
		marksPane.add(btnBack);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setIcon(new ImageIcon(marks.class.getResource("/Project/board_black_line_texture_background_wood_55220_720x1280.png")));
		label_1.setBounds(0, 0, 711, 792);
		marksPane.add(label_1);
		
		this.getRootPane().setDefaultButton(btnEnter);
	}

}

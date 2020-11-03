package Project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class proj extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setContentPane(new proj());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setBounds(100, 100, 500, 351);
		frame.setVisible(true);
		
		JPanel main = new JPanel();
		main.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(main);
		main.setLayout(null);
		main.setVisible(true);
		
		JLabel mainl1 = new JLabel("");
		mainl1.setIcon(new ImageIcon(mainpage.class.getResource("/Project/xlogo_mar.png.pagespeed.ic.JQMhTt0Ai0.png")));
		mainl1.setHorizontalAlignment(SwingConstants.CENTER);
		mainl1.setBounds(0, 13, 482, 72);
		main.add(mainl1);

		JLabel mainl2 = new JLabel("View Result");
		mainl2.setHorizontalAlignment(SwingConstants.CENTER);
		mainl2.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		mainl2.setBounds(125, 135, 95, 16);
		main.add(mainl2);
		
		JLabel mainl3 = new JLabel("View Marks");
		mainl3.setHorizontalAlignment(SwingConstants.CENTER);
		mainl3.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		mainl3.setBounds(125, 185, 95, 16);
		main.add(mainl3);
		
		JButton btnGo = new JButton("GO");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//setBounds(100, 100, 500, 351);
				JPanel resultPane = new JPanel();
				resultPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame.setContentPane(resultPane);
				resultPane.setLayout(null);
				resultPane.setVisible(true);
				
				JLabel label = new JLabel("");
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setIcon(new ImageIcon(result.class.getResource("/Project/xlogo_mar.png.pagespeed.ic.JQMhTt0Ai0.png")));
				label.setBounds(0, 13, 482, 72);
				resultPane.add(label);
				
				JLabel lblSeatNo = new JLabel("Seat No");
				lblSeatNo.setHorizontalAlignment(SwingConstants.CENTER);
				lblSeatNo.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
				lblSeatNo.setBounds(135, 142, 85, 16);
				resultPane.add(lblSeatNo);
				
				JTextField textField = new JTextField();
				textField.setBounds(232, 139, 116, 22);
				resultPane.add(textField);
				textField.setColumns(10);
				
				JButton btnEnter = new JButton("Enter");
				btnEnter.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
				btnEnter.setBounds(127, 192, 97, 25);
				resultPane.add(btnEnter);
				
				JButton btnBack = new JButton("Back");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						resultPane.setVisible(false);
						main.setVisible(true);
					}
				});
				btnBack.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
				btnBack.setBounds(251, 192, 97, 25);
				resultPane.add(btnBack);
				
				JLabel label_1 = new JLabel("");
				label_1.setIcon(new ImageIcon(result.class.getResource("/Project/img.png")));
				label_1.setBounds(0, 0, 482, 304);
				resultPane.add(label_1);
			}
		});
		btnGo.setBounds(232, 131, 97, 25);
		main.add(btnGo);
	}

}

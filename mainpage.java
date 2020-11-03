package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class mainpage extends marks {

	static JPanel mainpanel;
	private marks ms;
	private result rs;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage frame = new mainpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public mainpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 839);
		mainpanel = new JPanel();
		mainpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainpanel);
		mainpanel.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(mainpage.class.getResource("/Project/index.png")));
		label_2.setBounds(12, 350, 686, 353);
		mainpanel.add(label_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(mainpage.class.getResource("/Project/xlogo_mar.png.pagespeed.ic.JQMhTt0Ai0.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 74, 711, 72);
		mainpanel.add(label);
		
		JLabel lblViewResult = new JLabel("View Result");
		lblViewResult.setForeground(Color.WHITE);
		lblViewResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewResult.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		lblViewResult.setBounds(237, 215, 95, 16);
		mainpanel.add(lblViewResult);
		
		JLabel lblViewMarks = new JLabel("View Marks");
		lblViewMarks.setForeground(Color.WHITE);
		lblViewMarks.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewMarks.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		lblViewMarks.setBounds(237, 269, 95, 16);
		mainpanel.add(lblViewMarks);
		
		JButton btnGo = new JButton("GO");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainpanel.setVisible(false);
				rs = new result();
				rs.setVisible(true);
			}
		});
		btnGo.setBounds(376, 211, 97, 25);
		mainpanel.add(btnGo);
		JButton btnGo_1 = new JButton("GO");
		btnGo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpanel.setVisible(false);
				ms = new marks();
				ms.setVisible(true);
			}
		});
		btnGo_1.setBounds(376, 265, 97, 25);
		mainpanel.add(btnGo_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setIcon(new ImageIcon(mainpage.class.getResource("/Project/board_black_line_texture_background_wood_55220_720x1280.png")));
		label_1.setBounds(0, 0, 720, 792);
		mainpanel.add(label_1);
	}
}

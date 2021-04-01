package Panel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JFrame {
	public MyPanel() {
		getContentPane().setLayout(null);

		JButton btn1 = new JButton("btn1");
		btn1.setBounds(12, 305, 97, 23);
		getContentPane().add(btn1);

		JButton btn2 = new JButton("btn2");
		btn2.setBounds(121, 305, 97, 23);
		getContentPane().add(btn2);

		JButton btn3 = new JButton("btn3");
		btn3.setBounds(230, 305, 97, 23);
		getContentPane().add(btn3);

		JButton btn4 = new JButton("btn4");
		btn4.setBounds(339, 305, 97, 23);
		getContentPane().add(btn4);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 0, 425, 295);
		panel.setLayout(new CardLayout(0, 0));
		
		LoginPanel login = new LoginPanel();
		panel.add(login,"1");
		
		getContentPane().add(panel);
		
		setSize(465,413);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyPanel();
	}
}

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.CardLayout;

class Mypanel extends JPanel{
	public String name;
	public Mypanel(String name) {
		this.name = name;
		this.add(new JButton(name));
	}
}
public class Ex03 extends JFrame{
	public Ex03() {
		setTitle("                                                                                                                                               ");
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
		
		
		Mypanel mp1 = new Mypanel("1");
		Mypanel mp2 = new Mypanel("2");
		panel.add(mp1,"1");
		panel.add(mp2,"2");
		
		MMPanel mp3 = new MMPanel();
		NNPanel mp4 = new NNPanel();
		panel.add(mp3,"3");
		panel.add(mp4,"4");
		CPanel cp1 = new CPanel();
		
		getContentPane().add(panel);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "1");
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "2");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "3");
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cards =  (CardLayout) panel.getLayout();				
				cards.show(panel, "4");
			}
		});
		
		setSize(465,413);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex03();
	}
}

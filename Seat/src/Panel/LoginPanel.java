package Panel;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.CardLayout;

public class LoginPanel extends JFrame {
    JLabel la1, la2;
    JTextField tf;
    JPasswordField pf;
    JButton b1, b2;
	public LoginPanel() {
		setLayout(null);
		
		JLabel la1=new JLabel("아이디",JLabel.RIGHT);
        la1.setBounds(745, 775, 80, 30);
        JTextField tf=new JTextField();
        tf.setBounds(830, 775, 150, 30);
        
        add(la1);add(tf);
        
        JLabel la2=new JLabel("비밀번호",JLabel.RIGHT);
        la2.setBounds(745, 810, 80, 30);
        pf=new JPasswordField();
        pf.setBounds(830, 810, 150, 30);
        
        add(la2); add(pf);
        
        b1=new JButton("로그인");
        b2=new JButton("취소");
        JPanel p=new JPanel();
        p.add(b1);
        p.add(b2);
        p.setOpaque(false);
        p.setBounds(745, 850, 235, 35);
        add(p);
        
        setSize(465,413);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new LoginPanel();
	}
}

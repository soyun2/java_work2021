import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame{
	/*��ư*/
	static JButton b1=new JButton("\uB85C\uADF8\uC778");
	/*�г�1*/
	static JPanel page1=new JPanel();
	/*�г�2*/
	static JPanel page2=new JPanel();
	public Main() {
		homeframe();//homeframe�Լ��� ����
		setpanel();//setpanel�Լ��� ����
		cg();//cg�Լ��� ����
	}
	/*������ ����*/
	public void homeframe() {
		setTitle("1");//Ÿ��Ʋ
		setSize(400,400);//�������� ũ��
		setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		setLocationRelativeTo(null);//â�� ��� ������
		getContentPane().setLayout(null);//���̾ƿ� ����
		setVisible(true);//â�� ���̰�	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
	}
	/*�г� ���� ����*/
	public void setpanel() {
		/*��ġ ����*/
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b1.setBounds(131, 138, 100, 43);//��ư1�� ��ġ ����
		page1.setBounds(0, 0, 400, 400);//�г�1�� ��ġ ����
		page2.setBounds(0, 0, 400, 400);//�г�2�� ��ġ ����
		/*���̾ƿ� ����*/
		page2.setLayout(null);//���̾ƿ� ����
		page1.setLayout(null);//���̾ƿ� ����
		/*visible*/
		page2.setVisible(false);//â�� ������ �ʰ�
		/*�г��̳� �����ӿ� �߰�*/
		getContentPane().add(page1);//�����ӿ� �г��� �߰�
		getContentPane().add(page2);//�����ӿ� �г��� �߰�
		page1.add(b1);//�г�1�� ��ư�� �߰�
	}
	/*���콺 �̺�Ʈ*/
	public void cg(){
		b1.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			public void mousePressed(MouseEvent e) { // Ŭ�������� 
				page1.setVisible(false);//â�� ���̰�
				page2.setVisible(true);//â�� ���̰�
				System.out.println("������");//���ȴ��� Ȯ���Ϸ��� ����.
			} 
		});
	}
	/*�����Լ�*/
	public static void main(String[] args){
		new Main(); //�����ϸ� �����ڰ� �����.
	}
}
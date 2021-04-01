package project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class JoinFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JTextField tfUsername;
	private JTextField tfPassword;
	private JTextField tfName;
	private JTextField tfPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinFrame frame = new JoinFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * ȸ������ �� �����
	 */
	public JoinFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblJoin = new JLabel("ȸ������");
		Font f1 = new Font("����", Font.BOLD, 20); //�ü� ���� ����
		lblJoin.setFont(f1); 
		lblJoin.setBounds(159, 41, 101, 20);
		contentPane.add(lblJoin);
		
		JLabel lblUsername = new JLabel("��й�ȣ");
		lblUsername.setBounds(69, 163, 69, 20);
		contentPane.add(lblUsername);
		
		JLabel label = new JLabel("ID");
		label.setBounds(69, 113, 69, 20);
		contentPane.add(label);
		
		JLabel lblName = new JLabel("�̸�");
		lblName.setBounds(69, 210, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("��ȭ��ȣ");
		lblPhone.setBounds(69, 257, 69, 20);
		contentPane.add(lblPhone);
		
		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(159, 106, 186, 35);
		contentPane.add(tfUsername);
		
		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(159, 156, 186, 35);
		contentPane.add(tfPassword);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(159, 203, 186, 35);
		contentPane.add(tfName);
		
		tfPhone = new JTextField();
		tfPhone.setColumns(10);
		tfPhone.setBounds(159, 250, 186, 35);
		contentPane.add(tfPhone);
		
		joinCompleteBtn = new JButton("ȸ�����ԿϷ�");
		joinCompleteBtn.setBounds(206, 363, 139, 29);
		contentPane.add(joinCompleteBtn);
		
		setVisible(true);
		//ȸ�����ԿϷ� �׼�
		joinCompleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Member member = new Member();
				member.setUsername(tfUsername.getText());
				member.setPassword(tfPassword.getText());
				member.setName(tfName.getText());
				member.setPhone(tfPhone.getText());
				
				MemberDao dao = MemberDao.getInstance();
				int result = dao.save(member);
				
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.");
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "ȸ�������� �����Ͽ����ϴ�.");
					dispose();
				}	
			}
		});

	}
}


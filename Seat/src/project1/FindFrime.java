package project1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FindFrime extends JFrame{
	
	private Connection conn; // DB ���� ��ü
	private PreparedStatement pstmt; // Query �ۼ� ��ü
	private ResultSet rs; // Query ��� Ŀ��
	
	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton findCompleteBtn;
	private JTextField tfUsername,tfName,tfPhone;
	private JPasswordField tfPassword;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindFrime find = new FindFrime();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public FindFrime() {
		conn = DB.getConnection();
		setTitle("IDã��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 430);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblJoin = new JLabel("IDã��");
		Font f1 = new Font("����", Font.BOLD, 20); // �ü� ���� ����
		lblJoin.setFont(f1);
		lblJoin.setBounds(0, 41, 430, 20);
		lblJoin.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblJoin);

		JLabel lblName = new JLabel("�̸�");
		lblName.setBounds(70, 200, 70, 35);
		lblName.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblName);

		JLabel lblPhone = new JLabel("��ȭ��ȣ");
		lblPhone.setBounds(70, 100, 70, 35);
		lblPhone.setHorizontalAlignment(JLabel.CENTER);
		
		contentPane.add(lblPhone);
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(160, 200, 186, 35);
		
		contentPane.add(tfName);

		tfPhone = new JTextField();
		tfPhone.setColumns(10);
		tfPhone.setBounds(160, 100, 186, 35);
		contentPane.add(tfPhone);

		findCompleteBtn = new JButton("ã��");
		findCompleteBtn.setBounds(20, 320, 370, 30);
		contentPane.add(findCompleteBtn);

		setVisible(true);
		
		findCompleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String ID = "test";
				String PHONE = tfPhone.getText();
				String NAME = tfName.getText();
				try {
					pstmt = conn.prepareStatement("select username from member where Phone = ? and NAME = ?");
					pstmt.setString(1, PHONE);
					pstmt.setString(2, NAME);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						ID =rs.getString("username");
					}
					if(ID!="test"){
						JOptionPane.showMessageDialog(null, ID+"�Դϴ�.");
						}
					else if(ID.equals("test")) {
						JOptionPane.showMessageDialog(null, "������ ��ġ���� �ʽ��ϴ�.");
					}
					dispose();
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
	});
	}
}

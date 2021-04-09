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

public class JoinFrame extends JFrame {

	private Connection conn = null; // DB ���� ��ü
	private PreparedStatement pstmt = null; // Query �ۼ� ��ü
	private ResultSet rs; // Query ��� Ŀ��

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JTextField tfUsername,tfName,tfPhone;
	private JPasswordField tfPassword;

	/*
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
	 * Create the frame.
	 */
	public JoinFrame() {
		conn = DB.getConnection();
		setTitle("ȸ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 430);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblJoin = new JLabel("ȸ������");
		Font f1 = new Font("����", Font.BOLD, 20); // �ü� ���� ����
		lblJoin.setFont(f1);
		lblJoin.setBounds(0, 41, 430, 20);
		lblJoin.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblJoin);

		JLabel lblUsername = new JLabel("��й�ȣ");
		lblUsername.setBounds(69, 163, 69, 20);
		lblUsername.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblUsername);

		JLabel label = new JLabel("ID");
		label.setBounds(69, 113, 69, 20);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);

		JLabel lblName = new JLabel("�̸�");
		lblName.setBounds(69, 210, 69, 20);
		lblName.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblName);

		JLabel lblPhone = new JLabel("��ȭ��ȣ");
		lblPhone.setBounds(69, 257, 69, 20);
		lblPhone.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblPhone);

		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(159, 106, 186, 35);
		contentPane.add(tfUsername);

		tfPassword = new JPasswordField();
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
		joinCompleteBtn.setBounds(20, 320, 370, 30);
		contentPane.add(joinCompleteBtn);

		setVisible(true);
		
		// ȸ�����ԿϷ� �׼�
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

				if (result == 1) {
					JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.");
					try {
						conn.setAutoCommit(false);
						pstmt = conn.prepareStatement("update time set id= ? where num = (select max(num) from time)");
						pstmt.setString(1, tfUsername.getText());
						pstmt.executeUpdate();
						pstmt.close();
						conn.commit();
						
						pstmt = conn.prepareStatement("update timemanager set id= ? where num = (select max(num) from timemanager)");
						pstmt.setString(1, tfUsername.getText());
						pstmt.executeUpdate();
						pstmt.close();
						conn.commit();
					} catch (SQLException e1) {
						
					}
				
					dispose();
				} else{
					try {
						
						JOptionPane.showMessageDialog(null, "ȸ�������� �����Ͽ����ϴ�.");
						String ID = tfUsername.getText();
						String PHONE = tfPhone.getText();
						String DB_ID = null;
						String DB_PHONE =null;
						pstmt = conn.prepareStatement("select username from member where username = ?");
						pstmt.setString(1, ID);
						rs = pstmt.executeQuery();
						while (rs.next()) {
							DB_ID =rs.getString("username");
						}
						
						if(ID.equals(DB_ID)) {
						JOptionPane.showMessageDialog(null, "�����ϴ� ���̵��Դϴ�.");}
						
						
						pstmt = conn.prepareStatement("select Phone from member where Phone = ?");
						pstmt.setString(1, PHONE);
						rs = pstmt.executeQuery();
						while (rs.next()) {
							DB_PHONE =rs.getString("phone");
						}
						if(PHONE.equals(DB_PHONE)) {
							JOptionPane.showMessageDialog(null, "�����ϴ� ��ȭ��ȣ �Դϴ�.");
							}
						else {
							JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� �Է��ϼ���.");
						}
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
					
				}

			}
		});

	}

}

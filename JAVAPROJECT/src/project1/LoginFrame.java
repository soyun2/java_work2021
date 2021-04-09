package project1;

import java.awt.EventQueue;
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

public class LoginFrame extends JFrame {

	TimeFunction tf = new TimeFunction();
	private JPasswordField tfPassword;
	private JPanel contentPane;
	private JTextField tfUsername;
	private JButton loginBtn, joinBtn, findbtn, OutBtn;
	private Connection conn; // DB ���� ��ü
	private PreparedStatement pstmt; // Query �ۼ� ��ü
	private ResultSet rs; // Query ��� Ŀ��
	public int Time = 0;
	public int seat = 0;
	
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		
		setTitle("�α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(481, 260);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("ID");
		lblLogin.setBounds(71, 32, 70, 35);
		lblLogin.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblLogin);

		JLabel lblPassword = new JLabel("��й�ȣ");
		lblPassword.setBounds(71, 83, 70, 35);
		lblLogin.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblPassword);

		tfUsername = new JTextField();
		tfUsername.setBounds(187, 32, 170, 35);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);

		joinBtn = new JButton("ȸ������");
		joinBtn.setBounds(235, 156, 90, 30);
		contentPane.add(joinBtn);

		loginBtn = new JButton("�α���");
		loginBtn.setBounds(135, 156, 90, 30);
		contentPane.add(loginBtn);

		findbtn = new JButton("IDã��");
		findbtn.setBounds(35, 156, 90, 30);
		contentPane.add(findbtn);

		OutBtn = new JButton("���");
		OutBtn.setBounds(335, 156, 90, 30);
		contentPane.add(OutBtn);

		tfPassword = new JPasswordField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(187, 83, 170, 35);
		contentPane.add(tfPassword);

		setVisible(true);
 
		// IDã��
		findbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FindFrime find = new FindFrime();
			}
		});

		// ȸ������ �׼�
		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JoinFrame frame = new JoinFrame();

			}
		});
		// ���
		OutBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ID = tfUsername.getText();
				String password = tfPassword.getText();
				conn = DB.getConnection();
				MemberDao dao = MemberDao.getInstance();
				int result = dao.findByUsernameAndPassword(ID, password);
				
				try {
					conn.setAutoCommit(false);
					
					pstmt = conn.prepareStatement("select seat from timemanager where ID = ?");
					pstmt.setString(1, ID);
					rs = pstmt.executeQuery();
					while(rs.next()){
						seat = rs.getInt("seat");
						
						}
					pstmt.close();
					conn.commit();
				} catch (Exception e2) {
					
				}
				if (result == 1 && seat!=0) {
					
					JOptionPane.showMessageDialog(null, "����� �Ϸ�Ǿ����ϴ�.");
					try {
						conn.setAutoCommit(false);
						
						pstmt = conn.prepareStatement("update timemanager set time2 = systimestamp where ID = ?");
						pstmt.setString(1, ID);
						pstmt.executeUpdate();
						pstmt.close();
						conn.commit();
						
						pstmt = conn.prepareStatement("SELECT time2 - time1 AS interval, EXTRACT(DAY    FROM time2 - time1) *24*60*60+ EXTRACT(HOUR   FROM time2 - time1) *60*60+ EXTRACT(MINUTE FROM time2 - time1) *60+trunc( EXTRACT(SECOND FROM time2 - time1)) AS second FROM timemanager where id = ?");
						pstmt.setString(1, ID);
						rs = pstmt.executeQuery();
						while(rs.next()){
						Time = rs.getInt("second");
						}
						pstmt.close();
						conn.commit();
						
						pstmt = conn.prepareStatement("update Time set time = (time-?) where ID = ?");
						pstmt.setInt(1, Time);
						pstmt.setString(2, ID);
						pstmt.executeUpdate();
						pstmt.close();
						conn.commit(); 
						System.out.println(Time+"�� �������ϴ�.");
						
						pstmt = conn.prepareStatement("update timemanager set seat = null where ID = ?");
						pstmt.setString(1, ID);
						pstmt.executeUpdate();
						pstmt.close();
						conn.commit(); 
						
						System.out.println(Time);
					} catch (SQLException e1) {

					}
					dispose();
					new LoginFrame();
				}
				else {
					JOptionPane.showMessageDialog(null, "������ Ȯ�����ּ���.");
				}
			}
		});

		// �α��� �׼�
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				conn = DB.getConnection();
				String username = tfUsername.getText();
				String password = tfPassword.getText();
				MemberDao dao = MemberDao.getInstance();
				int result = dao.findByUsernameAndPassword(username, password);
				if (result == 1) {
					// �α��� ���� �޽���
					JOptionPane.showMessageDialog(null, "�α��� ����");
					// ȸ�� ���� ����Ʈ ȭ�� �̵��� ���ÿ� username,password ���ǰ����� �ѱ�.
					MemberListFrame mlf = new MemberListFrame(username, password);
					// ���� ȭ�� ����
					
					dispose();
				} else {
					try {
						JOptionPane.showMessageDialog(null, "�α��� ����");

						if (username.equals("")) {
							JOptionPane.showMessageDialog(null, "���̵� �Է��ϼ���.");
						} else {
							JOptionPane.showMessageDialog(null, "���̵� Ʋ�Ƚ��ϴ�.");
						}

						if (password.equals("")) {
							JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է��ϼ���.");
						} else {
							JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						}

					} catch (Exception e2) {
						// TODO: handle exception
					}

				}
				
			}
		});
	}
}

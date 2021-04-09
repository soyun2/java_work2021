package project1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class MemberListFrame extends JFrame {

	//
	private Connection conn; // DB ���� ��ü
	private PreparedStatement pstmt; // Query �ۼ� ��ü
	private ResultSet rs; // Query ��� Ŀ��
	//
	public String ID; // ���ǰ�
	public String PWD; // ���ǰ�
	private JPanel contentPane;
	private JPanel southPanel;
	public int seat1 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberListFrame frame = new MemberListFrame();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MemberListFrame() {

	}

	public MemberListFrame(String ID, String PWD) {
		conn = DB.getConnection();
		this.ID = ID;
		this.PWD = PWD;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel label = new JLabel("\uD68C\uC6D0\uC815\uBCF4");
		label.setFont(new Font("����", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.NORTH);

		southPanel = new JPanel(new GridLayout(1, 2));

		JButton btnAddTime = new JButton("�ð�����");
		southPanel.add(btnAddTime);
		contentPane.add(southPanel, BorderLayout.SOUTH);

		JButton btnSelSeat = new JButton("�¼�����");
		southPanel.add(btnSelSeat);
		contentPane.add(southPanel, BorderLayout.SOUTH);

		JButton btnLogout = new JButton("�α׾ƿ�");
		southPanel.add(btnLogout);
		contentPane.add(southPanel, BorderLayout.SOUTH);

		btnLogout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�α׾ƿ� �Ǿ����ϴ�.");
				dispose();
				new LoginFrame();
			}

		});
		// �¼�����
		btnSelSeat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					pstmt = conn.prepareStatement("select seat from timemanager where ID = ?");
					pstmt.setString(1, ID);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						seat1 = rs.getInt("seat");
					}
					
				} catch (Exception e2) {

				}
				if (seat1 == 0) {
				Seat st = new Seat(ID);
				
				}
			}
		});

		btnAddTime.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String num = null; // ������ �ð�				
				num = JOptionPane.showInputDialog("���� �ð��� �Է��ϼ���.", "");
				try {
					pstmt = conn.prepareStatement("select time from time where ID = ?");
					pstmt.setString(1, ID);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						TimeFunction.myTime = rs.getInt("time");
					}
					TimeFunction.addTime(Integer.parseInt(num)*3600);
				} catch (SQLException e1) {

				} catch (NumberFormatException e2) {

				}

				try {
					pstmt = conn.prepareStatement("update time set time= ? where ID = ?");
					pstmt.setInt(1, TimeFunction.myTime);
					pstmt.setString(2, ID);
					pstmt.executeUpdate();
				} catch (SQLException e1) {

				}
				
			}

		});

		// JTable ������ �����ϱ� (������, Į���̸�, ���̺��)
		// 1. Į���̸�
		Vector<String> memberName = List.getMemberName();
		// 2. ������
		MemberDao dao = MemberDao.getInstance();
		Vector<Member> members = dao.findByAll();
		// 3. ���̺��
		DefaultTableModel tableModel = new DefaultTableModel(memberName, 0);

		// 4.������ ���� �ֱ�
		//
		conn = DB.getConnection();

		try {
			pstmt = conn.prepareStatement(
					"select M.username,M.name,M.phone,T.time from member M inner join time T  on M.username = T.ID where username = ? and password = ?");

			pstmt.setString(1, ID);
			pstmt.setString(2, PWD);

			rs = pstmt.executeQuery();

			Vector<Object> row = new Vector<>();
			while (rs.next()) {

				row.addElement(rs.getString("username"));
				row.addElement(rs.getString("name"));
				row.addElement(rs.getString("phone"));
				row.addElement(TimeFunction.secToHHMMSS(rs.getInt("time")));
				tableModel.addRow(row);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//

		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);

		contentPane.add(scrollPane, BorderLayout.CENTER);

		if (ID == null) {
			JOptionPane.showMessageDialog(null, "�������� ���� ������Դϴ�.");
			dispose();
		} else {
			setVisible(true);
		}
	}

}

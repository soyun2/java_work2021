package BB;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JTextField idText = new JTextField();
	private JPasswordField pwText = new JPasswordField();

	public Login() {
		
		getContentPane().setLayout(null);
		setSize(700, 400);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		idText = new JTextField();
		idText.setBounds(175, 124, 160, 30);
		getContentPane().add(idText);
		idText.setColumns(10);

		JLabel lblId = new JLabel("\uC544\uC774\uB514");
		lblId.setFont(new Font("궁서", Font.PLAIN, 20));
		lblId.setBounds(81, 124, 68, 30);
		getContentPane().add(lblId);

		pwText = new JPasswordField();
		pwText.setBounds(175, 167, 160, 30);
		getContentPane().add(pwText);
		pwText.setColumns(10);

		JLabel lblPassword = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblPassword.setFont(new Font("궁서", Font.PLAIN, 20));
		lblPassword.setBounds(81, 167, 93, 30);
		getContentPane().add(lblPassword);

		JButton loginBtn = new JButton("\uB85C\uADF8\uC778");
		loginBtn.setFont(new Font("궁서", Font.PLAIN, 20));
		loginBtn.setBounds(346, 124, 97, 70);
		getContentPane().add(loginBtn);
		setVisible(true);
		
		JButton btnInsert = new JButton("회원가입");
		btnInsert.setFont(new Font("궁서", Font.PLAIN, 20));
		btnInsert.setBounds(455,124,131,70);
		getContentPane().add(btnInsert);
		setVisible(true);

		// 로그인 버튼을 눌렀을때

		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 아이디 비번 확인 테스트 코드~
				String id = idText.getText().trim();
				String pw = pwText.getText().trim();

				if (id.length() == 0 || pw.length() == 0) {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력 하셔야 됩니다.", "아이디나 비번을 입력!",
							JOptionPane.DEFAULT_OPTION);					
					return;
				}
				if (id.equals("한글") && pw.equals("1234")) {

					JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
					new Member_List();
					setVisible(false);
					return;
				}
				JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
			}
		});
		
	}
	public static void main(String[] args) {
		new Login();
	}

	
}

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;


public class DataBaseManager implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
//			int a=1/0;
			//oracle 연결하는 jar 파일 추가 확인..
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.111:1521:xe","AI","1234");
			pstmt = conn.prepareStatement("insert into atable values(1,'a','b','b')");
			pstmt.executeUpdate();
		}
		catch(ArithmeticException ae) {
			JOptionPane.showMessageDialog(null,"0으로 나눌 수 없다.");
		}
		catch(ClassNotFoundException cne) {
			JOptionPane.showMessageDialog(null,"class없다");
		}
		catch(Exception exc) {
			//몇번째 줄에서 에러가 났는지 확인하기 위한 출력 구문
			exc.printStackTrace();
		}
		System.out.println("데이터베이스 매니저...");
	}
}

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
			//oracle �����ϴ� jar ���� �߰� Ȯ��..
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.111:1521:xe","AI","1234");
			pstmt = conn.prepareStatement("insert into atable values(1,'a','b','b')");
			pstmt.executeUpdate();
		}
		catch(ArithmeticException ae) {
			JOptionPane.showMessageDialog(null,"0���� ���� �� ����.");
		}
		catch(ClassNotFoundException cne) {
			JOptionPane.showMessageDialog(null,"class����");
		}
		catch(Exception exc) {
			//���° �ٿ��� ������ ������ Ȯ���ϱ� ���� ��� ����
			exc.printStackTrace();
		}
		System.out.println("�����ͺ��̽� �Ŵ���...");
	}
}

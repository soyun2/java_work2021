import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class DBManager {
	public Vector<Vector> getData() {
		Vector<Vector> data = new Vector<Vector>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="AI";
		String pw="1234";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, id, pw);
			System.out.println("DB연결 완료");
			pstmt = conn.prepareStatement("select * from atable");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Vector<String> row = new Vector<String>();
				row.add(rs.getString(1));
				row.add(rs.getString(2));
				row.add(rs.getString(3));
				row.add(rs.getString(4));
				data.add(row);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception closee) {
				
			}
		}
		return data;
	}
}

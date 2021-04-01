package BB;
import java.sql.*;
import java.util.Scanner;
import java.util.Vector;
 
import javax.swing.table.DefaultTableModel;
 
//DB ó��
public class MemberDAO {
 
    private static final String DRIVER
        = "oracle.jdbc.driver.OracleDriver";
    private static final String URL
        = "jdbc:oracle:thin:@localhost:1521:xe";
   
    private static final String USER = "AI"; //DB ID
    private static final String PASS = "1234"; //DB �н�����
    Member_List mList;
   
    public MemberDAO() {
   
    }
   
    public MemberDAO(Member_List mList){
        this.mList = mList;
        System.out.println("DAO=>"+mList);
    }
   
    /**DB���� �޼ҵ�*/
    public Connection getConn(){
        Connection con = null;
       
        try {
            Class.forName(DRIVER); //1. ����̹� �ε�
            con = DriverManager.getConnection(URL,USER,PASS); //2. ����̹� ����
           
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return con;
    }
   
   
    /*�ѻ���� ȸ�� ������ ��� �޼ҵ�*/
    public MemberDTO getMemberDTO(String tel){
       
        MemberDTO dto = new MemberDTO();
        Connection con = null;       //����
        PreparedStatement ps = null; //���
        ResultSet rs = null;         //���
       
        try {
           
            con = getConn();
            String sql = "select A.name , A.tel , A.addr , T.TIME from tb_member A Inner join TIME T on A.tel = T.tel";
            ps = con.prepareStatement(sql);
            
            ps.setString(3, tel);
           
            rs = ps.executeQuery();
           
            if(rs.next()){
            	dto.setName(rs.getString("Name"));
                dto.setTel(rs.getString("tel"));
                dto.setAddr(rs.getString("addr"));
                dto.setTime(rs.getString("time"));
               
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }      
       
        return dto;    
    }
   
    /**�������Ʈ ���*/
    public Vector getMemberList(){
       
        Vector data = new Vector(); 
       
           
        Connection con = null;       //����
        PreparedStatement ps = null; //���
        ResultSet rs = null;         //���
       
        try{           
            con = getConn();
            String sql = "select A.name , A.tel , A.addr , T.TIME from tb_member A Inner join TIME T on A.tel = T.tel";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            	String name = rs.getString("name");
                String tel = rs.getString("tel");
                String addr = rs.getString("addr");
                String time = rs.getString("time");
                
                Vector row = new Vector();
                row.add(name);
                row.add(tel);
                row.add(addr);
                row.add(time);
                data.add(row);             
            }//while
        }catch(Exception e){
//            e.printStackTrace();
        }
        return data;
    }//getMemberList()
   
 
 
    /**ȸ�� ���*/
    public boolean insertMember(MemberDTO dto){
       
        boolean ok = false;
       
        Connection con = null;       //����
        PreparedStatement ps = null; //���
       
        try{
           
            con = getConn();
            String sql = "insert  all into tb_member" +
                       "(name, pwd,tel,addr)" +
                        "values(?,?,?,?)"+
                       "into time"+"(name,tel)"+"values(?,?)"
                        +"SELECT *"+"FROM dual";
                       
            ps = con.prepareStatement(sql);
            ps.setString(1, dto.getName());
            ps.setString(2, dto.getPwd());
            ps.setString(3, dto.getTel());
            ps.setString(4, dto.getAddr());
            
            ps.setString(5, dto.getName());
            ps.setString(6, dto.getTel());
            int r = ps.executeUpdate(); //���� -> ����
            
            if(r>0){
                System.out.println("���� ����");   
                ok=true;
            }else{
                System.out.println("���� ����");
            }
           
               
           
        }catch(Exception e){
//            e.printStackTrace();
        }
       
        return ok;
    }//insertMmeber
   
   
    /**ȸ������ ����*/
    public boolean updateMember(MemberDTO vMem){
        System.out.println("dto="+vMem.toString());
        boolean ok = false;
        Connection con = null;
        PreparedStatement ps = null;
        try{
           
            con = getConn();           
            String sql = "update tb_member set name=?, Pwd=?, addr=?,tel=?";
           
            ps = con.prepareStatement(sql);
           
            ps.setString(1, vMem.getName());
            ps.setString(2, vMem.getPwd());
            ps.setString(3, vMem.getTel());
            ps.setString(4, vMem.getAddr());
            
           
            int r = ps.executeUpdate(); //���� -> ����
            // 1~n: ���� , 0 : ����
           
            if(r>0) ok = true; //������ �����Ǹ� ok���� true�� ����
           
        }catch(Exception e){
//            e.printStackTrace();
        }
       
        return ok;
    }
   
    /**ȸ������ ���� */
    public boolean deleteMember(String name, String pwd, String tel){
       
        boolean ok =false ;
        Connection con =null;
        PreparedStatement ps =null;
       
        try {
            con = getConn();
            String sql = "delete from tb_member where name = ? and pwd=? and tel=?";
           
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pwd);
            ps.setString(3, tel );
            int r = ps.executeUpdate(); // ���� -> ����
           
            if (r>0) ok=true; //������;
           
        } catch (Exception e) {
            System.out.println(e + "-> �����߻�");
        }      
        return ok;
    }
   
   
    /**DB������ �ٽ� �ҷ�����*/   
    public void userSelectAll(DefaultTableModel model) {
       
       
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
       
        try {
            con = getConn();
            String sql = "select A.name , A.tel , A.addr , T.TIME from tb_member A inner join TIME T on A.tel = T.tel";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
           
            // DefaultTableModel�� �ִ� ������ �����
            for (int i = 0; i < model.getRowCount();) {
                model.removeRow(0);
            }
 
            while (rs.next()) {
                Object data[] = { rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(5)};
 
                model.addRow(data);                
            }
 
        } catch (SQLException e) {
            System.out.println(e + "=> userSelectAll fail");
        } finally{
           
            if(rs!=null)
                try {
                    rs.close();
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            if(ps!=null)
                try {
                    ps.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            if(con!=null)
                try {
                    con.close();
                } catch (SQLException e) {

                    e.printStackTrace();
                }
        }
    }
}
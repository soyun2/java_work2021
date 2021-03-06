package BB;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
public class Member_List extends JFrame implements MouseListener,ActionListener{
   
    Vector v;  
    Vector cols;
    DefaultTableModel model;
    JTable jTable;
    JScrollPane pane;
    JPanel pbtn;
    JButton btnInsert;
   
    public Member_List(){
        super("회원관리 프로그램");
        
        MemberDAO dao = new MemberDAO();
        v = dao.getMemberList();

        cols = getColumn();
       
        model = new DefaultTableModel(v, cols);
        
        jTable = new JTable(model);
        pane = new JScrollPane(jTable);
        add(pane);
       
        pbtn = new JPanel();
        btnInsert = new JButton("회원가입");
        pbtn.add(btnInsert);
        add(pbtn,BorderLayout.NORTH);
       
        jTable.addMouseListener(this); //리스너 등록
        btnInsert.addActionListener(this); //회원가입버튼 리스너 등록
       
        setSize(600,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//end 생성자
   
   
    //JTable의 컬럼
    public Vector getColumn(){
        Vector col = new Vector();
        col.add("이름");
//        col.add("비밀번호");
        col.add("전화번호");
        col.add("지역");
        col.add("남은시간");
        
        
        return col;
    }//getColumn
   
   
    //Jtable 내용 갱신 메서드
    public void jTableRefresh(){
       
        MemberDAO dao = new MemberDAO();
        DefaultTableModel model= new DefaultTableModel(dao.getMemberList(), getColumn());
        jTable.setModel(model);    
       
    }
   
    public static void main(String[] args) {
        new Member_List();
    }//main
    @Override
    public void mouseClicked(MouseEvent e) {
        // mouseClicked 만 사용
        int r = jTable.getSelectedRow();
        String tel = (String) jTable.getValueAt(r, 0);
        MemberProc mem = new MemberProc(tel,this); //전화번호를 인자로 수정창 생성
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //버튼을 클릭하면
        if(e.getSource() == btnInsert ){
            new MemberProc(this);
        }
       
    }
   
}
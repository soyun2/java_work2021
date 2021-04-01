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
        super("ȸ������ ���α׷�");
        
        MemberDAO dao = new MemberDAO();
        v = dao.getMemberList();

        cols = getColumn();
       
        model = new DefaultTableModel(v, cols);
        
        jTable = new JTable(model);
        pane = new JScrollPane(jTable);
        add(pane);
       
        pbtn = new JPanel();
        btnInsert = new JButton("ȸ������");
        pbtn.add(btnInsert);
        add(pbtn,BorderLayout.NORTH);
       
        jTable.addMouseListener(this); //������ ���
        btnInsert.addActionListener(this); //ȸ�����Թ�ư ������ ���
       
        setSize(600,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//end ������
   
   
    //JTable�� �÷�
    public Vector getColumn(){
        Vector col = new Vector();
        col.add("�̸�");
//        col.add("��й�ȣ");
        col.add("��ȭ��ȣ");
        col.add("����");
        col.add("�����ð�");
        
        
        return col;
    }//getColumn
   
   
    //Jtable ���� ���� �޼���
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
        // mouseClicked �� ���
        int r = jTable.getSelectedRow();
        String tel = (String) jTable.getValueAt(r, 0);
        MemberProc mem = new MemberProc(tel,this); //��ȭ��ȣ�� ���ڷ� ����â ����
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
        //��ư�� Ŭ���ϸ�
        if(e.getSource() == btnInsert ){
            new MemberProc(this);
        }
       
    }
   
}
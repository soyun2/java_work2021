package BB;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
import java.awt.event.*;
 
public class MemberProc extends JFrame implements ActionListener {
   
   
    JPanel p;
    JTextField tfName, tfAddr ;
    JTextField tfTel1, tfTel2, tfTel3; //��ȭ
    JPasswordField pfPwd; //��й�ȣ   
    JButton btnInsert, btnCancel, btnUpdate,btnDelete; //����, ���, ���� , Ż�� ��ư
   
    GridBagLayout gb;
    GridBagConstraints gbc;
    Member_List mList ;
   
    public MemberProc(){ //���Կ� ������
       
        createUI(); // UI�ۼ����ִ� �޼ҵ�
        btnUpdate.setEnabled(false);
        btnUpdate.setVisible(false);
        btnDelete.setEnabled(false);
        btnDelete.setVisible(false);
       
       
    }//������
   
    public MemberProc(Member_List mList){ //���Կ� ������
       
        createUI(); // UI�ۼ����ִ� �޼ҵ�
        btnUpdate.setEnabled(false);
        btnUpdate.setVisible(false);
        btnDelete.setEnabled(false);
        btnDelete.setVisible(false);
        this.mList = mList;
       
    }//������
    public MemberProc(String tel,Member_List mList){ // ����/������ ������
        createUI();
        btnInsert.setEnabled(false);
        btnInsert.setVisible(false);
        this.mList = mList;
       
       
//        System.out.println("tel = "+tel);
       
        MemberDAO dao = new MemberDAO();
        MemberDTO vMem = dao.getMemberDTO(tel);
        viewData(vMem);
       
       
    }
 
       
    //MemberDTO �� ȸ�� ������ ������ ȭ�鿡 �������ִ� �޼ҵ�
    private void viewData(MemberDTO vMem){
       
        String name = vMem.getName();
        String pwd = vMem.getPwd();
        String tel = vMem.getTel();
        String addr = vMem.getAddr();
        
        
        //ȭ�鿡 ����
	    tfName.setText(name);
	    
        pfPwd.setText(""); //��й�ȣ�� �Ⱥ����ش�.
        String[] tels = tel.split("-");
        tfTel1.setText(tels[0]);
        tfTel2.setText(tels[1]);
        tfTel3.setText(tels[2]);
        tfAddr.setText(addr);
        
       
    }//viewData
   
   
   
    private void createUI(){
        this.setTitle("ȸ������");
        gb = new GridBagLayout();
        setLayout(gb);
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
       
       
       
        //��й�ȣ
        JLabel bName = new JLabel("�̸� :");
        tfName = new JTextField(20);
        gbAdd(bName, 0, 1, 1, 1); 
        gbAdd(tfName, 1, 1, 3, 1); 
       
        //�̸�
        JLabel bPwd = new JLabel("��й�ȣ : ");
        pfPwd = new JPasswordField(20);
        gbAdd(bPwd,0,2,1,1);
        gbAdd(pfPwd,1,2,3,1);
       
        //��ȭ
        JLabel bTel = new JLabel("��ȭ :");
        JPanel pTel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        tfTel1 = new JTextField(6);    
        tfTel2 = new JTextField(6);    
        tfTel3 = new JTextField(6);
        pTel.add(tfTel1);
        pTel.add(new JLabel(" - "));
        pTel.add(tfTel2);
        pTel.add(new JLabel(" - "));
        pTel.add(tfTel3);
        gbAdd(bTel, 0, 3, 1,1);
        gbAdd(pTel, 1, 3, 3,1);
       
        //�ּ�
        JLabel bAddr = new JLabel("�ּ�: ");
        tfAddr = new JTextField(20);
        gbAdd(bAddr, 0,4,1,1);
        gbAdd(tfAddr, 1, 4, 3,1);   
       
       
       
        //��ư
        JPanel pButton = new JPanel();
        btnInsert = new JButton("����");
        btnUpdate = new JButton("����"); 
        btnDelete = new JButton("Ż��");
        btnCancel = new JButton("���");     
        pButton.add(btnInsert);
        pButton.add(btnUpdate);
        pButton.add(btnDelete);
        pButton.add(btnCancel);    
        gbAdd(pButton, 0, 10, 4, 1);
       
        //��ư�� �����⸦ ������
        btnInsert.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnCancel.addActionListener(this);
        btnDelete.addActionListener(this);
       
        setSize(350,350);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //dispose(); //����â�� �ݴ´�.
       
       
    }//createUI
   
    //�׸���鷹�̾ƿ��� ���̴� �޼ҵ�
    private void gbAdd(JComponent c, int x, int y, int w, int h){
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gb.setConstraints(c, gbc);
        gbc.insets = new Insets(2, 2, 2, 2);
        add(c, gbc);
    }//gbAdd
   
    public static void main(String[] args) {
       
        new MemberProc();
    }
   
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btnInsert){
            insertMember();
            System.out.println("insertMember() ȣ�� ����");
        }else if(ae.getSource() == btnCancel){
            this.dispose(); //â�ݱ� (����â�� ����)
        }else if(ae.getSource() == btnUpdate){
            UpdateMember();            
        }else if(ae.getSource() == btnDelete){
            int x = JOptionPane.showConfirmDialog(this,"���� �����Ͻðڽ��ϱ�?","����",JOptionPane.YES_NO_OPTION);
           
            if (x == JOptionPane.OK_OPTION){
                deleteMember();
            }else{
                JOptionPane.showMessageDialog(this, "������ ����Ͽ����ϴ�.");
            }
        }
       
        //jTable���� ���� �޼ҵ� ȣ��
        mList.jTableRefresh();
       
    }//actionPerformed 
   
   
    private void deleteMember() {
        String name = tfName.getText();
        String pwd = pfPwd.getText();
        String tel1 = tfTel1.getText();
        String tel2 = tfTel2.getText();
        String tel3 = tfTel3.getText();
        String tel = tel1+"-"+tel2+"-"+tel3;
        
        if(pwd.length()==0){ //���̰� 0�̸�
           
            JOptionPane.showMessageDialog(this, "��й�ȣ�� �� �Է��ϼ���!");
            return; //�޼ҵ� ��
        }
        MemberDAO dao = new MemberDAO();
        boolean ok = dao.deleteMember(name, pwd, tel);
       
        if(ok){
            JOptionPane.showMessageDialog(this, "�����Ϸ�");
            dispose();         
           
        }else{
            JOptionPane.showMessageDialog(this, "��������");
           
        }          
       
    }//deleteMember
   
    private void UpdateMember() {
       
        //1. ȭ���� ������ ��´�.
        MemberDTO dto = getViewData();     
        //2. �������� DB�� ����
        MemberDAO dao = new MemberDAO();
        boolean ok = dao.updateMember(dto);
       
        if(ok){
            JOptionPane.showMessageDialog(this, "�����Ǿ����ϴ�.");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "��������: ���� Ȯ���ϼ���");   
        }
    }
 
    private void insertMember(){
       
        //ȭ�鿡�� ����ڰ� �Է��� ������ ��´�.
        MemberDTO dto = getViewData();
        MemberDAO dao = new MemberDAO();       
        boolean ok = dao.insertMember(dto);
       
        if(ok){
           
            JOptionPane.showMessageDialog(this, "������ �Ϸ�Ǿ����ϴ�.");
            dispose();
           
        }else{
           
            JOptionPane.showMessageDialog(this, "������ ���������� ó������ �ʾҽ��ϴ�.");
        }
       
       
       
    }//insertMember
   
    public MemberDTO getViewData(){
       
        //ȭ�鿡�� ����ڰ� �Է��� ������ ��´�.
        MemberDTO dto = new MemberDTO();
        String name = tfName.getText();
        String pwd = pfPwd.getText();
        String tel1 = tfTel1.getText();
        String tel2 = tfTel2.getText();
        String tel3 = tfTel3.getText();
        String tel = tel1+"-"+tel2+"-"+tel3;
        String addr = tfAddr.getText();
        
       
        //dto�� ��´�.
        dto.setName(name);
        dto.setPwd(pwd);
        dto.setTel(tel);
        dto.setAddr(addr);
        
        return dto;
    }
   
}
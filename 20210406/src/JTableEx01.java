import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx01 extends JFrame {
	
	JPanel center_panel = new JPanel();
	JPanel bottom_panel = new JPanel();
	
	JButton btn_select = new JButton("��ȸ");
	
	JTable jt = null;
	JScrollPane jp = null;
	
	public static DefaultTableModel DFTM = null; 
	
	public static Vector<Vector> data = new Vector<Vector>();
	public static Vector<String> title = new Vector<String>();
	
	public JTableEx01() {
		center_panel.setLayout(null);	// �ش� ��ǥ�� ũ�⿡ ���� ������Ʈ�� �߰�
		
		center_panel.setBackground(Color.DARK_GRAY);
		bottom_panel.setBackground(Color.LIGHT_GRAY);

		// 1���� �迭
		title.add("1��");
		title.add("2��");
		title.add("3��");
		title.add("4��");
		
		// data[0] = data1 1���� vector �߰�
		Vector<String> data1 = new Vector<String>();
		data1.add("����1");
		data1.add("����1");
		data1.add("����1");
		data1.add("����1");

		// data[1] = data2 1���� vector �߰�
		Vector<String> data2 = new Vector<String>();
		data2.add("����2");
		data2.add("����2");
		data2.add("����2");
		data2.add("����2");
		
		data.add(data1);
		data.add(data2);
		
		DFTM = new DefaultTableModel(data,title);
		
		jt = new JTable(DFTM);
		jt.setBounds(0, 0, 785, 530);	//jtable ũ������
		
		// ��ũ�� �г����� ���̺� �߰�
		jp = new JScrollPane(jt);
		jp.setBounds(0, 0, 785, 530);	//jtable ũ������
		
		// �߰� ��ο� ��ũ�� ��� �߰�
		// JPanel �⺻ ���̾ƿ� -> FlowLayout -> �帣�°�..
		// Component -> JButton, Jtable, JScrollPane, JLabel
		// Contorl -> DataGridView, Label, TextField
		center_panel.add(jp, BorderLayout.CENTER);
		
		// �ؿ� �гο� ��ư �߰�
		bottom_panel.add(btn_select);
		btn_select.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				data.clear();
				
				//data ������ DB���� �����;���..
				DBManager dbm = new DBManager();
				dbm.getData();
				
				DFTM.fireTableDataChanged();
				
//				jt = new JTable(data,title);
//				jt.setBounds(0, 0, 785, 530);
//				
//				jp = new JScrollPane(jt);
//				jp.setBounds(0, 0, 785, 530);
//				
//				center_panel.add(jp, BorderLayout.CENTER);
			}
		});
		
		getContentPane().add(center_panel, BorderLayout.CENTER);
		getContentPane().add(bottom_panel, BorderLayout.SOUTH);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableEx01();
	}
}

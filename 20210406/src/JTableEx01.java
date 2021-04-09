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
	
	JButton btn_select = new JButton("조회");
	
	JTable jt = null;
	JScrollPane jp = null;
	
	public static DefaultTableModel DFTM = null; 
	
	public static Vector<Vector> data = new Vector<Vector>();
	public static Vector<String> title = new Vector<String>();
	
	public JTableEx01() {
		center_panel.setLayout(null);	// 해당 좌표와 크기에 따라서 컴포넌트가 추가
		
		center_panel.setBackground(Color.DARK_GRAY);
		bottom_panel.setBackground(Color.LIGHT_GRAY);

		// 1차원 배열
		title.add("1번");
		title.add("2번");
		title.add("3번");
		title.add("4번");
		
		// data[0] = data1 1차원 vector 추가
		Vector<String> data1 = new Vector<String>();
		data1.add("내용1");
		data1.add("내용1");
		data1.add("내용1");
		data1.add("내용1");

		// data[1] = data2 1차원 vector 추가
		Vector<String> data2 = new Vector<String>();
		data2.add("내용2");
		data2.add("내용2");
		data2.add("내용2");
		data2.add("내용2");
		
		data.add(data1);
		data.add(data2);
		
		DFTM = new DefaultTableModel(data,title);
		
		jt = new JTable(DFTM);
		jt.setBounds(0, 0, 785, 530);	//jtable 크기지정
		
		// 스크롤 패널위에 테이블 추가
		jp = new JScrollPane(jt);
		jp.setBounds(0, 0, 785, 530);	//jtable 크기지정
		
		// 중간 페널에 스크롤 페널 추가
		// JPanel 기본 레이아웃 -> FlowLayout -> 흐르는거..
		// Component -> JButton, Jtable, JScrollPane, JLabel
		// Contorl -> DataGridView, Label, TextField
		center_panel.add(jp, BorderLayout.CENTER);
		
		// 밑에 패널에 버튼 추가
		bottom_panel.add(btn_select);
		btn_select.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				data.clear();
				
				//data 내용을 DB에서 가져와야함..
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

package project1;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;


public class List {
	
	public static Vector<String> getMemberName(){
		//Į�� ������ , ���⿡�� �÷��� �߰���
		Vector<String> memberName = new Vector<>();
		memberName.add("ID");
		memberName.add("�̸�");
		memberName.add("��ȭ��ȣ");
		memberName.add("�����ð�");
		
		return memberName;
	}
	
	public static Vector<Member> getMembers(){
		//Member ������
		Vector<Member> members = new Vector<>();
		


		return members;
	}
}



package project;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;


public class List {
	
	public static Vector<String> getMemberName(){
		//Į�� ������
		Vector<String> memberName = new Vector<>();
		memberName.add("USERNAME");
		memberName.add("PASSWORD");
		memberName.add("NAME");
		memberName.add("PHONE");
		
		return memberName;
	}
	
	public static Vector<Member> getMembers(){
		//Member ������
		Vector<Member> members = new Vector<>();
		
		return members;
	}
}



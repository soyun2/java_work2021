class AAAA{
	AAAA(){System.out.println("����Ŭ���� ������");}
}
public class Person extends AAAA{
	private String name;
	private int age;
	
	// ������ �����ε�
	public Person(){
		super(); //�������� ������ ȣ��ÿ� �ٷ� �� �����ٿ� ��ġ
	}
	
	public Person(String name, int age){
		super(); //��������
		this.name = name;
		age = age; //private int age �״��  (this x)
	}
	public void doPrint(){
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
	//������ �ڵ� ����� alt+shift+s+o
}
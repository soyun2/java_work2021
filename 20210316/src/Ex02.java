class AAA{
	AAA(){System.out.println("AAA ������");}
}
class BBB extends AAA{
	BBB(){System.out.println("BBB ������");}
}
class CCC extends BBB{
	CCC(){super();//��������
	System.out.println("CCC ������");}
}
public class Ex02 {
	Ex02(){
		CCC ccc = new CCC();
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
class AAA{
	AAA(){System.out.println("AAA 持失切");}
}
class BBB extends AAA{
	BBB(){System.out.println("BBB 持失切");}
}
class CCC extends BBB{
	CCC(){super();//持繰亜管
	System.out.println("CCC 持失切");}
}
public class Ex02 {
	Ex02(){
		CCC ccc = new CCC();
	}
	public static void main(String[] args) {
		new Ex02();
	}
}

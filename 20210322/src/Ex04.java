class AAA{
	int a = 10;
	public void method() {
		System.out.println("A method");
	}
}
class BBB extends AAA{
	int a = 20;
	public void method() {
		System.out.println("B method");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		aaa.method();
		bbb.method();
		
		System.out.println("aaa.a = "+aaa.a);
		System.out.println("bbb.a = "+bbb.a);
		
		AAA abb= new BBB();
		abb.method();
		
		System.out.println("abb.a = "+abb.a);
	}
}

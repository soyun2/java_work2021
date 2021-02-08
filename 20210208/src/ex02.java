
public class ex02 {
	public static void doPrint(int a, int b)
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public static void doA() {
		int a = 10;
		int b = 20;
		doPrint(a, b);
	}
	public static void doB() {
		int a = 30;
		int b = 40;
		doPrint(a,b);
	}
	public static void main(String[] args) {
		int a = 50;
		int b = 60;
		doPrint(a,b);
		doA();
		doB();
	}
}

class CC{
	int a = 10;
	int b = 20;
	public void doPrint(){
		System.out.println("a = "+a);
		System.out.println("b = "+b);		
	}
}
public class Ex06 {
	public static void main(String[] args) {
		System.out.println("c1------");
		CC c1 = new CC();
		c1.doPrint();
		c1.a=30;
		c1.doPrint();
		System.out.println("c2------");
		CC c2 = new CC();
		c2.doPrint();
		c2.b=40;
		c2.doPrint();
	}
}

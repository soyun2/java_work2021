class A{
	int a = 10;
}
class B{
	int b = 20;
}
class C{
	public void doSetAB(A aa, B bb){
		aa.a = 30;
		bb.b = 40;
	}
	public void doPrint(A aa, B bb){
		System.out.println("aa.a = "+aa.a);
		System.out.println("bb.b = "+bb.b);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		B b1 = new B();
		B b2 = new B();
		
		C c = new C();
		
		System.out.println("a1 ===== b1 ======");
		c.doPrint(a1, b1);
		c.doSetAB(a1, b1);
		System.out.println("a1 ===== b1 ======");
		c.doPrint(a1, b1);
		System.out.println("a2 ===== b2 ======");
		c.doPrint(a2, b2);
	}
}

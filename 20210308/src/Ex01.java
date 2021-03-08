class StaticValues{
	static int A = 10;
}
class A{
	public void doPrintStaticA(){
		System.out.println("SV.A = "+StaticValues.A++);
	}
}
class B{
	public void doPrintStaticA(){
		System.out.println("SV.A = "+StaticValues.A++);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A a = new A();
		a.doPrintStaticA();
		B b = new B();
		b.doPrintStaticA();
		System.out.println("SV.A = "+StaticValues.A);
	}
}

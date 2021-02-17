class A{
	public void doA(){System.out.println("A class");}
}
class B{
	public void doB(){System.out.println("B class");}
}
public class Ex01 {
	public static void main(String[] args) {
		A a = new A();
		a.doA();
		
		B b = new B();
		b.doB();
	}

}

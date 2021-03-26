class A{
	public void doA() {System.out.println("A");}
}
class B{
	public void doB() {System.out.println("B");}
}
public class Ex02 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		
		B b = new B();
		System.out.println(b);
		
		Object obj1 = new A();
		Object obj2 = new B();
		
		Object c[] = {new A(), new A(), new B()};
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
			if(c[i] instanceof A) {
				A ina=(A) c[i];
				ina.doA();
			}
			if(c[i] instanceof B) {
				B ina = (B) c[i];
				ina.doB();
			}
		}
	}
}

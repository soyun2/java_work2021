class A{
	int a = 20;
	int b = 30;
	public void doA(){
		System.out.println("doA 함수입니다.");
	}
}
public class Ex01 extends A{
	Ex01(){
		System.out.println(a);
		System.out.println(b);
		doA();
	}
	public static void main(String[] args) {
		new Ex01();
	}
}

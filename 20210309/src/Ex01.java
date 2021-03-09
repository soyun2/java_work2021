class A{
	public static int a = 10;
	public static void doA(){
		System.out.println("static doA 입니다.");
	}
	//main에 호출 불가
	private void doB(){
		System.out.println("private doB");
	}
	//doC를 통해서 doB를 호출 가능
	public void doC(){
		doB();
		System.out.println("public doC입니다");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A.doA();
		System.out.println(A.a);
		//public static이므로 어디에서든 접근 가능
		A a = new A();
		a.doC();
	}
}

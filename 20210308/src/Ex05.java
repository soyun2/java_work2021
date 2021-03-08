class AAA{
	int a = 10;
	public static void doA(String a){
		System.out.println(a);
	}
	public void doB(){
		System.out.println(this.a);
	}
	static{
		int b = 20;
		int c = 30;
	}
}

public class Ex05 {
	public static AAA aa= new AAA();
	public static void main(String[] args) {
		System.out.println("test");
		aa.doA("test");
	}
}

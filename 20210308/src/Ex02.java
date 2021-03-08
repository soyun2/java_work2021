
public class Ex02 {
	public static void main(String[] args) {
		doB();
		Ex02 ex02 = new Ex02();
		ex02.doA();
	}
	
	public void doA(){
		System.out.println("A 함수입니다.");
	}
	
	public static void doB(){
		System.out.println("B 함수입니다.");
	}
}


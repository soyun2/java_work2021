
public class Ex02 {
	public static void main(String[] args) {
		doB();
		Ex02 ex02 = new Ex02();
		ex02.doA();
	}
	
	public void doA(){
		System.out.println("A �Լ��Դϴ�.");
	}
	
	public static void doB(){
		System.out.println("B �Լ��Դϴ�.");
	}
}


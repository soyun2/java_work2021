class A{
	public static int a = 10;
	public static void doA(){
		System.out.println("static doA �Դϴ�.");
	}
	//main�� ȣ�� �Ұ�
	private void doB(){
		System.out.println("private doB");
	}
	//doC�� ���ؼ� doB�� ȣ�� ����
	public void doC(){
		doB();
		System.out.println("public doC�Դϴ�");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A.doA();
		System.out.println(A.a);
		//public static�̹Ƿ� ��𿡼��� ���� ����
		A a = new A();
		a.doC();
	}
}

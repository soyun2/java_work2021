class Printer{
	public void doA(){
		System.out.println("doA �Լ� �Դϴ�.");
	}
	public void doB(){
		System.out.println("doB �Լ� �Դϴ�.");
	}
	public static void doC(){
		System.out.println("doC �Լ� �Դϴ�.");
	}
	public static void doD(){
		System.out.println("doD �Լ� �Դϴ�.");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.doA();
		printer.doB();
		Printer.doC();
		Printer.doD();
	}
}

class BB{
	public int a = 10;
	public int b = 20;
	public void doA(){
		System.out.println("doA �޼��� �Դϴ�");
	}
}


public class ex04 {
	public static void main(String[] args) {
		BB b = new BB();
		System.out.println("b.a = "+b.a);
		System.out.println("b.b = "+b.b);
	}
}

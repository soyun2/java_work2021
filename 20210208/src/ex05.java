
public class ex05 {
	int a = 10;
	
	public void doA()
	{
		a++;
	}
	
	public void doB(){
		a = 20;
	}
	
	public static void main(String[] args) {
		ex05 E5 = new ex05();
		System.out.println("E5.a = "+E5.a);
		E5.doA();
		System.out.println("E5.a = "+E5.a);
		E5.doB();
		System.out.println("E5.a = "+E5.a);
	}
}

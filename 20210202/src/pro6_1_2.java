
public class pro6_1_2 {
	public static void main(String[] args) {
		cha(4,2);
		cha(2,4);
	}
	
	public static void cha(int a, int b)
	{
		System.out.println("a = "+a+"  b = "+b);
		if(a>b)
			System.out.println("|a-b| = "+(a-b));
		else
			System.out.println("|a-b| = "+(b-a));
	}
}

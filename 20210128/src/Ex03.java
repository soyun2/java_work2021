import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("소수점 숫자 입력 : ");
		double a = scan.nextDouble();
		int b;
		b = (int)(a*100);
		double c = (double)b/100;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
	}

}

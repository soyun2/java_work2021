import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex02 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자 두 개 입력  : ");
		int a = scan.nextInt();
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		if(a>b)
		{
			System.out.println("a - b = "+(a-b));
		}
		else
			System.out.println("b - a = "+(b-a));
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("����, ����, ���� ���� �Է� : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int avg = (a+b+c)/3;
		System.out.println("�� ���� ����� "+avg+"��");
		
		if(avg >=90)
			System.out.println("���� A");
		else if(avg >=80)
			System.out.println("���� B");
		else if(avg>=70)
			System.out.println("���� C");
		else if(avg>=60)
			System.out.println("���� D");
		else
			System.out.println("���� E");
	}
}

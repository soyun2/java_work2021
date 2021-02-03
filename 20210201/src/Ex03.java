import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("국어, 영어, 수학 점수 입력 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int avg = (a+b+c)/3;
		System.out.println("세 과목 평균은 "+avg+"점");
		
		if(avg >=90)
			System.out.println("성적 A");
		else if(avg >=80)
			System.out.println("성적 B");
		else if(avg>=70)
			System.out.println("성적 C");
		else if(avg>=60)
			System.out.println("성적 D");
		else
			System.out.println("성적 E");
	}
}

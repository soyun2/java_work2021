import java.util.Scanner;

public class Ex02 {
	Ex02(){
		Scanner scan = new Scanner(System.in);
		System.out.println("배열 길이 입력  : ");
		int len= scan.nextInt();
		int arr[] = new int[len];
		
		System.out.println("arr.length = "+arr.length);
		scan.close();
	}
	public static void main(String[] args) {
		new Ex02();
	}
}

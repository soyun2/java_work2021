import java.util.Scanner;

public class Ex02 {
	Ex02(){
		Scanner scan = new Scanner(System.in);
		System.out.println("�迭 ���� �Է�  : ");
		int len= scan.nextInt();
		int arr[] = new int[len];
		
		System.out.println("arr.length = "+arr.length);
		scan.close();
	}
	public static void main(String[] args) {
		new Ex02();
	}
}

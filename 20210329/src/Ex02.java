import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("숫자입력");
			int n1 = scan.nextInt();
			
			System.out.println("숫자입력");
			int n2 = scan.nextInt();
			
			System.out.println("n1/n2 = "+(n1/n2));
			System.out.println("예외발생하면 안나오는 구문");
		}catch(Exception e) {
			System.out.println("캐치....");
		}
		System.out.println("예외적 상황 발생시 종료됨..");
		System.out.println("이거 출력 되남..");	
	}
}

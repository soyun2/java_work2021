import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("�����Է�");
			int n1 = scan.nextInt();
			
			System.out.println("�����Է�");
			int n2 = scan.nextInt();
			
			System.out.println("n1/n2 = "+(n1/n2));
			System.out.println("���ܹ߻��ϸ� �ȳ����� ����");
		}catch(Exception e) {
			System.out.println("ĳġ....");
		}
		System.out.println("������ ��Ȳ �߻��� �����..");
		System.out.println("�̰� ��� �ǳ�..");	
	}
}

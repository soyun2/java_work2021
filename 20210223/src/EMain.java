import java.util.Scanner;

public class EMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸� �Է��ض�");
		String name = scan.nextLine();
		emp.setName(name);
		
		System.out.println("�ֹι�ȣ �Է��ض�");
		String Jumin = scan.nextLine();
		emp.setJumin(Jumin);
		
		System.out.println("�޿� �Է��ض�");
		int sal = scan.nextInt();
		emp.setSal(sal);
		
		emp.doPrint();
		
//		emp.setName("ȫ�浿");
		
	}
}
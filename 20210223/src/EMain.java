import java.util.Scanner;

public class EMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력해랍");
		String name = scan.nextLine();
		emp.setName(name);
		
		System.out.println("주민번호 입력해랍");
		String Jumin = scan.nextLine();
		emp.setJumin(Jumin);
		
		System.out.println("급여 입력해랍");
		int sal = scan.nextInt();
		emp.setSal(sal);
		
		emp.doPrint();
		
//		emp.setName("홍길동");
		
	}
}

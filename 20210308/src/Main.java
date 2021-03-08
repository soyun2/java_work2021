import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static Student inputStudent(){
		Scanner scan = new Scanner(System.in);
//		scan.nextLine();
		System.out.println("이름은? ");
		String name = scan.nextLine();
		System.out.println("성별은 ? ");
		String gender = scan.nextLine();
		System.out.println("나이? ");
		int age = scan.nextInt();
		Student stu = new Student(name,gender,age);
		return stu;
	}
	
	public static void main(String[] args) {
		Student[] student = new Student[50];
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("뭐할래요? 1,2,3,4 선택");
			int select = scan.nextInt();
			System.out.println("select = "+select);
			if(select==1)
			{
				Student stu = inputStudent();
//				student[0] = new Student(name,gender,age);
				for(int i=0;i<student.length;i++)
				{
					if(student[i] == null){
						student[i]=stu;
						break;
					}
				}
			}
			else if(select == 2)
			{
				System.out.println("===학생조회===");
				for(int i=0; i<student.length;i++)
				{
//					System.out.println(i+" = "+student[i]);
					if(student[i] != null){
						System.out.println(i+"번째 학생");
						student[i].print();
					}
				}
				System.out.println("===========");
			}
			else if(select==3)
			{
				System.out.println("수정하고 싶은 학생 번호 입력 : ");
				int num = scan.nextInt();
				Student stu = inputStudent();
				student[num]=stu;
				System.out.println("수정되었습니다.");
			}
			else if(select == 4){
				System.out.println("삭제하고 싶은 학생 번호 입력 : ");
				int num = scan.nextInt();
				student[num] = null;
				System.out.println("삭제되었습니다.");
			}
			else{
				System.out.println("종료됩니다.");
				break;
			}
		}
	}
}

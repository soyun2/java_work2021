import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Console;
import java.io.File;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static Student inputStudent(){
		Scanner scan = new Scanner(System.in);
//		scan.nextLine();
		System.out.println("�̸���? ");
		String name = scan.nextLine();
		System.out.println("������ ? ");
		String gender = scan.nextLine();
		System.out.println("����? ");
		int age = scan.nextInt();
		Student stu = new Student(name,gender,age);
		return stu;
	}
	
	public static void main(String[] args) throws Exception{
		Student[] student = new Student[50];
	
		File a = new File("a");
		if(a.exists()){
			FileInputStream fis = new FileInputStream(new File("a.bat"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			student= (Student[]) ois.readObject();
		}
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("���ҷ���? 1,2,3,4 ����");
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
				System.out.println("===�л���ȸ===");
				for(int i=0; i<student.length;i++)
				{
//					System.out.println(i+" = "+student[i]);
					if(student[i] != null){
						System.out.println(i+"��° �л�");
						student[i].print();
					}
				}
				System.out.println("===========");
			}
			else if(select==3)
			{
				System.out.println("�����ϰ� ���� �л� ��ȣ �Է� : ");
				int num = scan.nextInt();
				Student stu = inputStudent();
				student[num]=stu;
				System.out.println("�����Ǿ����ϴ�.");
			}
			else if(select == 4){
				System.out.println("�����ϰ� ���� �л� ��ȣ �Է� : ");
				int num = scan.nextInt();
				student[num] = null;
				System.out.println("�����Ǿ����ϴ�.");
			}
			else{
				FileOutputStream fos = new FileOutputStream(new File("a.bat"));
//				OutputStreamWriter ow = new OutputStreamWriter(fos);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(student);
				System.out.println("����˴ϴ�.");
				break;
			}
		}
	}
}

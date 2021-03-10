import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("src/c.txt"));
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();
		String d = scan.nextLine();
		String e = scan.nextLine();
		String f = scan.nextLine();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		scan.close();
		
		
		
	}
}

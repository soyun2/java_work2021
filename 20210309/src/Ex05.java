import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ют╥б: ");
		String a = br.readLine();
		System.out.println("a = "+a);
		
		int b = Integer.parseInt(a)+10;
		System.out.println("b = "+b);
	}
}

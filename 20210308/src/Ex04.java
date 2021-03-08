
public class Ex04 {
	static int a = 10;
	
	public static void doA(int n){
		a+=n;
		System.out.println(n);
	}
	
	public static void main(String[] args){
		doA(5);
	}
}

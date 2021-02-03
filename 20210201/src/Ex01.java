
public class Ex01 {
	public static void main(String[] args) {
		int i = 1;
		while(i<100)
		{
			System.out.println(i%7 ==0 || i%9==0?"i = "+i:null);
			i++;
		}
	}
}


public class pro5_4_3 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i<=1000)
		{
			if(i%7==0 && i%2==0)
				System.out.println("i = "+i);
				sum += i;
				i++;
		}
		
		System.out.println("sum = "+sum);
	}
}

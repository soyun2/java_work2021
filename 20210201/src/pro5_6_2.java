
public class pro5_6_2 {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		while(sum<1000)
		{
			if(num%2==1)
			{
				sum += num;
			}
			num++;
		}
		System.out.println("합은 "+sum+" 수는"+num);
	}
}

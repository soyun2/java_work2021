
public class pro6_2_2 {
	public static void main(String[] args) 
	{
		System.out.println(PN(42));
		System.out.println(PN(41));
		
		int num=1;
		while(num<=100)
		{
			if(PN(num)==true)
				System.out.println("¼Ò¼ö "+num);
			num++;
		}
	}
	
	public static boolean PN(int num)
	{
		boolean result=true;
		int cnt=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				cnt++;
		}		
		if(cnt!=2)
			result = false;
		return result;
	}
}

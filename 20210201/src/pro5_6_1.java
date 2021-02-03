
public class pro5_6_1 {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		for(num=1;num<=100;num++)
		{
			if(num%5==0 && num%7==0)
				{System.out.println("Á¤¼ö "+num);
				count+=1;}
		}
		System.out.println("count: "+count);
	}
}

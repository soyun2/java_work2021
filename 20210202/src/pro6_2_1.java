
public class pro6_2_1 {
	public static void main(String[] args) {
		
		int r = 4;
		
		System.out.println("원의 반지름은 "+r);
		System.out.println("원의 넓이는 "+area(r));
		System.out.println("원의 둘레는 "+length(r));
	}
	
	public static double area(int r)
	{
		return (r*r*3.14);
	}
	
	public static double length(int r)
	{
		return (2*r*3.14);
	}
}

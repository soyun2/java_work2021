
public class pro6_2_1 {
	public static void main(String[] args) {
		
		int r = 4;
		
		System.out.println("���� �������� "+r);
		System.out.println("���� ���̴� "+area(r));
		System.out.println("���� �ѷ��� "+length(r));
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

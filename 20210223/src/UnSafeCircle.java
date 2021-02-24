
public class UnSafeCircle {
	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		double area = c.getArea();
		System.out.println("c ³ĞÀÌ´Â "+area);
		
		c.setRad(2.5);
		area = c.getArea();
		System.out.println("c ³ĞÀÌ´Â "+area);
		
		c.setRad(-1.5);
		area = c.getArea();
		System.out.println("c ³ĞÀÌ´Â "+area);
	}
}

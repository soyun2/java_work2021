
class Triangle {
	double x;
	double y;
	
	public void change(double a, double b)
	{
		x = a;
		y = b;		
	}
	
	public static double area(double x, double y)
	{
		double z;
		z = x * y / 2;
		return z;
	}
	
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.x = 10;
		tri.y = 20;
		System.out.println(area(tri.x, tri.y));
		
		tri.change(15, 30);
		System.out.println(area(tri.x, tri.y));
		
	}
}



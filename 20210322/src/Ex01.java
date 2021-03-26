class Car{
	protected String name;
	Car(String name){
		this.name = name;
	}
}
class Kia extends Car{
	private int price;
	Kia(String name){
		super(name);
	}
	Kia(String name, int price){
		this(name);
		this.price = price;
	}
	public String toString() {
		return "name = "+name +" price = "+price;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Kia kia = new Kia("스포티지", 2000);
		System.out.println(kia);
	}
}

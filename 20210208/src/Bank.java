
public class Bank {
	public static void main(String[] args) {
		Account yoon;
		Account park;
		yoon = new Account();
		park = new Account();
		
		yoon.setName("��");
		park.setName("��");
		
		yoon.printAl();
		yoon.setBal(40);
		yoon.printAl();

		park.printAl();
		park.setBal(50);
		park.printAl();
	}
}


public class Bank {
	public static void main(String[] args) {
		Account yoon;
		Account park;
		yoon = new Account();
		park = new Account();
		
		yoon.setName("À±");
		park.setName("¹Ú");
		
		yoon.printAl();
		yoon.setBal(40);
		yoon.printAl();

		park.printAl();
		park.setBal(50);
		park.printAl();
	}
}

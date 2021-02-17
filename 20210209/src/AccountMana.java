class Account{
	String accNumber; //°èÁÂ¹øÈ£
	String ssNumber; //ÁÖ¹Îµî·Ï¹øÈ£
	int balance=0;	//°èÁÂÀÜ¾×
	
	public Account(String acc, String ss, int bal){
		accNumber = acc;
		ssNumber = ss;
		balance = bal;		
	}
	
//	public void initAccount(String acc, String ss, int bal){
//		accNumber = acc;
//		ssNumber = ss;
//		balance = bal;
//	}
	public void checkAccount(){
		System.out.println("°èÁÂ¹øÈ£ = "+accNumber);
		System.out.println("ÁÖ¹Îµî·Ï = "+ssNumber);
		System.out.println("±İ¾× = "+balance);
	}
}


public class AccountMana {
	public static void main(String[] args) {
		Account acc1 = new Account("12-347-9984", "960619-2222222", 10000);
		Account acc2 = new Account("12-389-9984", "960619-1111111", 10000);
		
		acc1.checkAccount();
		acc2.checkAccount();
		
//		acc1.initAccount("12-347-9984", "960619-2222222", 10000);
//		acc2.initAccount("12-389-9984", "960619-1111111", 10000);
		

	}
}


public class Man extends BusinessMan{
	private String company;
	private String position;
	
	public void tellYourInfo(){
		System.out.println("company = "+company);
		System.out.println("position = "+position);
		tellName();
	}
	
	Man(String company, String position, String name){
		this.company = company;
		this.position = position;
		super.name = name;
	}
	
	public static void main(String[] args) {
		Man man = new Man("À¯´ÏÅØ","°³¹ßÆÀ","È«±æµ¿");
		man.tellYourInfo();
	}
}


public class Ex01 {

	public static void main(String[] args) {
		 Ex01_Out eo1 = new Ex01_Out(); //기본생성자
		 eo1.doA();
		 eo1.namePrint();
		 
		 Ex01_Out eo2 = new Ex01_Out("매개변수");
		 eo2.doA();
		 eo2.namePrint();
	}
	
	protected void doA(){
		
	}
}

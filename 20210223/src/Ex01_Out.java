
public class Ex01_Out {
	int a = 10;
	int b = 20;
	String name = "";
	public Ex01_Out(){} //기본생성자
	public Ex01_Out(String a){
		name = a;
	}//매개변수 a가 들고 있는 생성자
	public void doA(){
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public void namePrint(){
		System.out.println("name = "+name);
	}
}


public class Account {
	String name;
	int al = 10;
	//al 설정
	public void setName(String a){
		name = a;
	}
	public void setBal(int value){
		al = value;
	}
	//al 출력
	public void printAl(){
		System.out.println("name = "+name);
		System.out.println("al = "+al);
	}
}

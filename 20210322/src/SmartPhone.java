class MobilePhone{
	protected int number;
	MobilePhone(int number){
		this.number=number;
	}
	public void answer() {
		System.out.println("전화번호 "+number+"가 응답하고 있습니다.");
	}
}
public class SmartPhone extends MobilePhone{
	private String ver;
	SmartPhone(String ver, int number){
		super(number);
		this.ver = ver;
	}
	public void version(){
		System.out.println("version = "+ver);
	}
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("버전 8.0",1099462262);
		sp.answer();
		sp.version();
		
		MobilePhone mp = new SmartPhone("버전 7.0", 131323);
		SmartPhone sp1 = (SmartPhone)mp;
		sp1.version();
	}
}

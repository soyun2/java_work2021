
public class ex03 {
	public static int doA(int a)
	{
		System.out.println("���丮�� �Լ�");
		if(a>1){
			return a*doA(a-1);
		}
		else{
			return 1;
		}
	}
	
	public static void main(String[] args) {
		int returnValue = doA(5);
		System.out.println("returnValue = "+returnValue);
	}
}

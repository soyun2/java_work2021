class SuperCls{
	SuperCls(){System.out.println("�θ�⺻������");}
	SuperCls(int a){System.out.println("�θ� a = "+a);}
	SuperCls(int a, int b){System.out.println("�θ� a = "+a); System.out.println("�θ� b = "+b);}
}
class SubCls extends SuperCls{
	SubCls(){
		super(); //����
		System.out.println("�⺻������");
	}
	SubCls(int a){
		super(a);
		System.out.println("a = "+a);
	}
	SubCls(int a,int b){
		super(a,b);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
public class Ex03 {
	public static void main(String[] args) {
		new SubCls();
		new SubCls(10);
		new SubCls(10,20);
	}
}
class Box{
	private String conts;
	Box(String cont){
		this.conts = cont;
	}
	public String toString(){
		return conts;
	}
}
public class Ex03 {
	Ex03(){
		Box a = new Box("���");
		System.out.println(a);
		System.out.println(a.toString());
		
		Box bana = new Box("�ٳ���");
		System.out.println(bana);
		
		Box box[] = new Box[5];
		System.out.println("�ڽ� �? "+box.length);
		System.out.println("box[0] = "+box[0]);
		System.out.println("box[1] = "+box[1]);
		
		box[0] = a;
		box[1] = bana;
		System.out.println("box[0] = "+box[0]);
		System.out.println("box[1] = "+box[1]);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
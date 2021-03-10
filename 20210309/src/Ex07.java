class Box{
	private String content;
	Box(){}
	Box(String content){
		this.content = content;
	}
}

public class Ex07 {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder();
		stb.append("34");
		System.out.println(stb.toString());
		System.out.println(stb);
		
		Box box = new Box("apple");
		System.out.println(box);
		System.out.println(box.toString());
	}
}

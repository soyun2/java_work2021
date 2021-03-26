class Box{
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}
class PaperBox extends Box{
	public void simpleWrap() {
		System.out.println("Paper Wrapping");
	}
}
class GoldPaperBox extends PaperBox{
	public void simpleWrap() {
		System.out.println("Gold Wrapping");
	}
}
//public class Wrapping {
//	public static void main(String[] args) {
//		Box box1 = new Box();
//		PaperBox box2 = new PaperBox();
//		GoldPaperBox box3 = new GoldPaperBox();
//		
//		wrapBox(box1);
//		wrapBox(box2);
//		wrapBox(box3);
//	}
//	
//	public static void wrapBox(Box box) {
//		if(box instanceof GoldPaperBox) {
//			((GoldPaperBox)box).goldWrap();
//		}
//		else if(box instanceof PaperBox) {
//			((PaperBox)box).paperWrap();
//		}
//		else {
//			box.simpleWrap();
//		}
//	}	
//}

public class Wrapping{
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new PaperBox();
		Box box3 = new GoldPaperBox();
		
		box1.simpleWrap();
		box2.simpleWrap();
		box3.simpleWrap();
	}
}

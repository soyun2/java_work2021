class Person{
	String name = "이름";
	int age = 20;
}
public class Ex02 {
	public static void main(String[] args) {
		String a = "String ";
		String b = new String("String b");
		
		Person c = new Person();
//		Person d = Person(name = "aa", age = 20);
		
		int[] aa = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("a의 길이 = "+a.length());
		System.out.println("aa 의 길이 = "+aa.length);
	}
}

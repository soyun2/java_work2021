
public class Ex04 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "def";
		
		String str3 = str1.concat(str2);
		System.out.println("str3 = "+str3);
		
		String str6 = str1+str2;
		
		String str4 = "abcdef".concat(str3);
		System.out.println("str4 = "+str4);
		
		String str5 = new String("abcdef");
		
		if(str3 == str6)
		{
			System.out.println("��ġ");
		}
		else
			System.out.println("����ġ");
	}
}

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex11 {
	public static void main(String[] args) throws IOException{
		OutputStream os = new FileOutputStream("src/d.txt");
		String test = "æ»≥Á«œººø‰";
		byte[] atest_byte = test.getBytes();
		os.write(atest_byte);
		os.close();
	}
}

import javax.swing.*;
import java.awt.*;

public class MainPage {
	public static void main(String[] args) {
		JFrame fr = new JFrame("Main 화면");
		JPanel pn = new JPanel();
		JLabel lb = new JLabel("로그인");
		System.out.println();
		JTextField tf = new JTextField("텍스트필드 입니다.");

        pn.add(lb);
		fr.setContentPane(pn);

		pn.add(tf);
        fr.setContentPane(pn);
		
		fr.setSize(600, 400);
		fr.setVisible(true);

	}
}

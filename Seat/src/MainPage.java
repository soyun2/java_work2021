import javax.swing.*;
import java.awt.*;

public class MainPage {
	public static void main(String[] args) {
		JFrame fr = new JFrame("Main ȭ��");
		JPanel pn = new JPanel();
		JLabel lb = new JLabel("�α���");
		System.out.println();
		JTextField tf = new JTextField("�ؽ�Ʈ�ʵ� �Դϴ�.");

        pn.add(lb);
		fr.setContentPane(pn);

		pn.add(tf);
        fr.setContentPane(pn);
		
		fr.setSize(600, 400);
		fr.setVisible(true);

	}
}

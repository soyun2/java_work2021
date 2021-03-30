import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01 extends JFrame{
	
		JButton btn1 = new JButton("입력");
		DataBaseManager dbm = new DataBaseManager();
		
		Ex01(){
			getContentPane().setLayout(null);
			
			btn1.setBounds(20,20,100,30);
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.out.println("이거는 인터페이스");
				}
			});
			
			btn1.addActionListener((e)->{System.out.println("랃다...");});
			btn1.addActionListener(dbm);
			
			super.add(btn1);
			
			setSize(500,600);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
//			for(int i=0;i<10;i++) {
//				JFrame jf = new JFrame(i+"");
//				jf.setSize(500,600);
//				jf.setVisible(true);
//			}
		}
		public static void main(String[] args) {
			new Ex01();
		}
}

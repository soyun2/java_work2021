
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.*;
public class Mouse {

   @SuppressWarnings("serial")
   static class setGUI extends JFrame {

      setGUI() {

         setTitle("�¼� ��ġǥ");

         getContentPane().setLayout(new FlowLayout());
         setSize(30, 30);
         setLayout(new FlowLayout(0, 20, 20));
         for (int i = 0; i < 42; i++) {
            
            JButton btn1 = new JButton("�¼�");
            getContentPane().add(btn1);
            btn1.addActionListener(new ActionListener(){ //�͸�Ŭ������ ������ �ۼ�
               public void actionPerformed(ActionEvent e){
                  JButton btn1 = (JButton) e.getSource();
                  if(btn1.getText().equals("�¼�"))
                     btn1.setText("����");
                  else 
                     btn1.setText("�¼�");
               }
            });
            
         }

      
         
         
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         setSize(600, 600);

         setVisible(true);
      }
   }

   public static void main(String[] args) {

      setGUI setGUI_ = new setGUI();
      setGUI_.getContentPane().setLayout(null);

      JButton button = new JButton("����");
      button.setBounds(464, 439, 97, 23);
      setGUI_.getContentPane().add(button);
      button.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            System.exit(0);
         }
      });
      
   }
}
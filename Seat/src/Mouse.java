
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.*;
public class Mouse {

   @SuppressWarnings("serial")
   static class setGUI extends JFrame {

      setGUI() {

         setTitle("좌석 배치표");

         getContentPane().setLayout(new FlowLayout());
         setSize(30, 30);
         setLayout(new FlowLayout(0, 20, 20));
         for (int i = 0; i < 42; i++) {
            
            JButton btn1 = new JButton("좌석");
            getContentPane().add(btn1);
            btn1.addActionListener(new ActionListener(){ //익명클래스로 리스너 작성
               public void actionPerformed(ActionEvent e){
                  JButton btn1 = (JButton) e.getSource();
                  if(btn1.getText().equals("좌석"))
                     btn1.setText("예약");
                  else 
                     btn1.setText("좌석");
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

      JButton button = new JButton("종료");
      button.setBounds(464, 439, 97, 23);
      setGUI_.getContentPane().add(button);
      button.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            System.exit(0);
         }
      });
      
   }
}
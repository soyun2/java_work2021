package project1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Action implements ActionListener {

   int k=0;
   
   static int num;
   
   @Override
   public void actionPerformed(ActionEvent e) {
      JButton btn = (JButton) e.getSource();
      String seatnum = btn.getText();
      
      num = Integer.parseInt(seatnum);      
      
      k++;
      
      if(k==1) {
         btn.setBackground(Color.cyan);
         btn.setEnabled(false);
      }
      else {
         JOptionPane.showMessageDialog(null, "�� �̻� ������ �� �����ϴ�.");
         k=1;
      }         
   }
}
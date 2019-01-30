package edu.vccs.email.ash28520.lecture.GUI;

import javax.swing.*;
import java.awt.*;

public class FirstSwing extends JFrame {

   public static void main(String[] args) {

      new FirstSwing();

   }

   public FirstSwing() {

      JLabel jLabel = new JLabel("Hello, world!");
      JButton jButton = new JButton("Click me!");
      JButton jButton1 = new JButton("No! Click me!");


      Container contentPane = getContentPane();
      setTitle("Hi");

      contentPane.setLayout(new FlowLayout());
      contentPane.add(jLabel);
      contentPane.add(jButton);
      contentPane.add(jButton1);


      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setBounds(50, 50, 300, 200);
      setVisible(true);
      SwingUtilities.invokeLater(()->{

      });
   }
}

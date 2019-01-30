package edu.vccs.email.ash28520.lecture.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid extends JFrame {
   private static final int ROWS = 3;
   private static final int COLS = 4;
   private JButton[] buttons = new JButton[ROWS * COLS];
   private JPanel[] panels = new JPanel[ROWS * COLS];

   public static void main(String[] args) {
      new Grid();
   }

   public Grid() {
      Container contentPane = getContentPane();
      contentPane.setLayout(new GridLayout(ROWS, COLS));
      for (int i = 0; i < ROWS * COLS; i++) {
         buttons[i] = new JButton();
         buttons[i].setText("Button " + (i + 1));
         buttons[i].addActionListener(e->((JButton)e.getSource()).setText("clicked"));
         panels[i] = new JPanel();
         panels[i].add(buttons[i]);
         contentPane.add(panels[i]);
      }
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      pack();
      setVisible(true);
      setBackground(Color.BLUE);
      setTitle("Grid");
      setBounds(0, 0, 1600, 1000);
      SwingUtilities.invokeLater(()->{});
   }
}

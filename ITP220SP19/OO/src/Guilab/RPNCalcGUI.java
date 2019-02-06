package Guilab;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPNCalcGUI extends JFrame {
    private RPNCalcGUIHelper helper;
    private JTextField inputField = new JTextField(20);


    public RPNCalcGUI() {

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        this.add(buildDisplayPanel(),BorderLayout.NORTH);
        this.add(buildKeyPadPanel(),BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        pack();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setVisible(true);
            }
        });
    }

    private JPanel buildDisplayPanel() {
        JPanel displayPanel = new JPanel();

        displayPanel.setLayout(new FlowLayout());
        displayPanel.add(inputField);

        return displayPanel;
    }

    private JPanel buildKeyPadPanel() {
        JPanel keyPadPanel = new JPanel();
        JPanel temp;

        keyPadPanel.setLayout(new GridLayout(4,5));

        JButton[] buttons = new JButton[20];
        buttons[0] = new JButton("7");
        buttons[1] = new JButton("8");
        buttons[2] = new JButton("9");
        buttons[3] = new JButton("pi");
        buttons[4] = new JButton("/");
        buttons[5] = new JButton("4");
        buttons[6] = new JButton("5");
        buttons[7] = new JButton("6");
        buttons[8] = new JButton("");
        //buttons[8].setSize(10,10);
        buttons[9] = new JButton("*");
        buttons[10] = new JButton("1");
        buttons[11] = new JButton("2");
        buttons[12] = new JButton("3");
        buttons[13] = new JButton("<");
        buttons[14] = new JButton("-");
        buttons[15] = new JButton("0");
        buttons[16] = new JButton(".");
        buttons[17] = new JButton("+/-");
        buttons[18] = new JButton("^");
        buttons[19] = new JButton("+");

        for (int i = 0; i < buttons.length; i++) {
            temp = new JPanel();
            temp.add(buttons[i]);
            keyPadPanel.add(temp);
        }

        return keyPadPanel;
    }

    public static void main(String[] args) {
        new RPNCalcGUI();
    }
}

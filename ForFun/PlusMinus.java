package company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlusMinus extends JFrame {
    JButton b1, b2, b3, b4,b5,b6;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    int i, k;
    int minus, plus, umnog;
    String s, b;
    eHandler handler = new eHandler();


    public PlusMinus(String s) {
        super(s);
        setLayout(new FlowLayout());
        l1 = new JLabel("Первое число: ");
        l2 = new JLabel(" Второе число: ");
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        b2 = new JButton("-");
        b3 = new JButton("+");
        b4 = new JButton("*");
        l4 = new JLabel("");
        b5 = new JButton("/");
        b1 = new JButton("Стереть");
        l3 = new JLabel("");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l4);
        add(b3);
        add(b2);
        add(b4);
        add(b5);
        add(b1);
        add(l3);


        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(220, 230);
        setResizable(false);
        t1.setFont(new Font("Times", Font.PLAIN, 20));
        t2.setFont(new Font("Times", Font.PLAIN, 19));
        t1.setForeground(new Color(0xFD3F3F));
        t2.setForeground(new Color(0xFD3F3F));
        t1.setBackground(new Color(0x282828));
        t2.setBackground(new Color(0x282828));
        setLocationRelativeTo(null);
        setBackground(Color.red);
        t1.setCaretColor(Color.white);
        t2.setCaretColor(Color.white);

    }

    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == b1) {
                    t1.setText(null);
                    t2.setText(null);
                    l3.setText(null);
                    l4.setText(null);
                }
                if (e.getSource() == b2) {
                    int k = Integer.parseInt(t2.getText());
                    int i = Integer.parseInt(t1.getText());
                    minus = i - k;
                    s = "Ответ: " + minus;
                    l3.setText(s);
                }
                if (e.getSource() == b3) {
                    int k = Integer.parseInt(t2.getText());
                    int i = Integer.parseInt(t1.getText());
                    plus = (k + i);
                    s = "Ответ: " + plus;
                    l3.setText(s);
                }
                if(e.getSource() == b4){
                    int k = Integer.parseInt(t2.getText());
                    int i = Integer.parseInt(t1.getText());
                    umnog = k * i;
                    s = "Ответ: " + umnog;
                    l3.setText(s);

                }
                if(e.getSource() == b5) {
                    int k = Integer.parseInt(t2.getText());
                    int i = Integer.parseInt(t1.getText());
                    umnog = k / i;
                    s = "Ответ: " + umnog;
                    l3.setText(s);
                }
            } catch (Exception lala) {
                JOptionPane.showMessageDialog(null, "Введите в поле число");
            }


        }

    }
}

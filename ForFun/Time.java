package company;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class Time extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6;
    public Time(String s){
        super(s);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);
        setResizable(false);
        eHandler handler = new eHandler();
        SimpleDateFormat formats = new SimpleDateFormat("d MMMM yyyy");
        Date date = new Date();
        String sa = formats.format(date);
        l1 = new JLabel("Сегодня " + sa + " года :)");
        l1.setFont(new Font("Segoe Print", Font.PLAIN, 20));

        add(l1);






    }
    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
}

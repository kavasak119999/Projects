package company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class All extends JFrame implements ActionListener {
    JLabel im;
    ImageIcon image = new ImageIcon("src/company/vinni.png");

    public All(){
        setVisible(true);
        setSize(500,500);
        im = new JLabel();
        im.setIcon(image);
        add(im);
    }


    public void actionPerformed(ActionEvent e) {

    }
}

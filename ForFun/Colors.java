package company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Colors extends JFrame implements MouseListener {
    JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16;


    Colors(){
        setTitle("Colors");
        setResizable(false);
        setSize(415,435);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        j1 = new JLabel();
        j1.setBounds(0,0,100,100);
        j1.setBackground(Color.red);
        j1.setOpaque(true);
        j2 = new JLabel();
        j2.setBounds(0,100,100,100);
        j2.setBackground(Color.green);
        j2.setOpaque(true);
        j3 = new JLabel();
        j3.setBounds(0,200,100,100);
        j3.setOpaque(true);
        j3.setBackground(Color.MAGENTA);
        j4 = new JLabel();
        j4.setBounds(0,300,100,100);
        j4.setBackground(Color.red);
        j4.setOpaque(true);
        j5 = new JLabel();
        j5.setBounds(100,0,100,100);
        j5.setBackground(Color.yellow);
        j5.setOpaque(true);
        j6 = new JLabel();
        j6.setBounds(200,0,100,100);
        j6.setBackground(Color.gray);
        j6.setOpaque(true);
        j7 = new JLabel();
        j7.setBounds(300,0,100,100);
        j7.setOpaque(true);
        j7.setBackground(Color.cyan);
        j8 = new JLabel();
        j8.setBounds(100,100,100,100);
        j8.setBackground(Color.pink);
        j8.setOpaque(true);
        //j8.setText("HI, MY");
        //j8.setFont(new Font("",Font.PLAIN,30));
        j9 = new JLabel();
        j9.setBounds(200,100,100,100);
        j9.setBackground(Color.LIGHT_GRAY);
        j9.setOpaque(true);
        //j9.setText("NAME");
        //j9.setFont(new Font("",Font.PLAIN,35));
        j10 = new JLabel();
        j10.setBounds(300,100,100,100);
        j10.setBackground(Color.blue);
        j10.setOpaque(true);
        j11 = new JLabel();
        j11.setBounds(200,200,100,100);
        j11.setBackground(Color.orange);
        j11.setOpaque(true);
        //j11.setText(" MAX");
        //j11.setFont(new Font("",Font.PLAIN,35));
        j12 = new JLabel();
        j12.setBounds(300,200,100,100);
        j12.setOpaque(true);
        j12.setBackground(Color.darkGray);
        j13 = new JLabel();
        j13.setBounds(100,200,100,100);
        j13.setBackground(new Color(0x783C3C));
        j13.setOpaque(true);
        //j13.setText("   IS");
        //j13.setFont(new Font("",Font.PLAIN,35));
        j14 = new JLabel();
        j14.setBounds(100,300,100,100);
        j14.setBackground(new Color(0x6B81E8));
        j14.setOpaque(true);
        j15 = new JLabel();
        j15.setBounds(200,300,100,100);
        j15.setBackground(new Color(0xF24BF8));
        j15.setOpaque(true);
        j16 = new JLabel();
        j16.setBounds(300,300,100,100);
        j16.setOpaque(true);
        j16.setBackground(new Color(0x34FF49));

        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(j5);
        add(j6);
        add(j7);
        add(j8);
        add(j9);
        add(j10);
        add(j11);
        add(j12);
        add(j13);
        add(j14);
        add(j15);
        add(j16);
        j1.addMouseListener(this);
        j2.addMouseListener(this);
        j3.addMouseListener(this);
        j4.addMouseListener(this);
        j5.addMouseListener(this);
        j6.addMouseListener(this);
        j7.addMouseListener(this);
        j8.addMouseListener(this);
        j9.addMouseListener(this);
        j10.addMouseListener(this);
        j11.addMouseListener(this);
        j12.addMouseListener(this);
        j13.addMouseListener(this);
        j14.addMouseListener(this);
        j15.addMouseListener(this);
        j16.addMouseListener(this);



        setVisible(true);
    }



    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "А зачем тыкать? :)");
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==j1){
            j1.setBackground(new Color(0x6B81E8));
        }
        if(e.getSource()==j2){
            j2.setBackground(new Color(0xF48CF5));
        }
        if(e.getSource()==j3){
            j3.setBackground(new Color(0x070B21));
        }
        if(e.getSource()==j4){
            j4.setBackground(new Color(0xEEB5B5));
        }
        if(e.getSource()==j5){
            j5.setBackground(new Color(0xA55D00));
        }
        if(e.getSource()==j6){
            j6.setBackground(new Color(0x0BE887));
        }
        if(e.getSource()==j7){
            j7.setBackground(new Color(0xA13AF3));
        }
        if(e.getSource()==j8){
            j8.setBackground(new Color(0x501438));
        }
        if(e.getSource()==j9){
            j9.setBackground(new Color(0x0A4E50));
        }
        if(e.getSource()==j10){
            j10.setBackground(new Color(0x30AA05));
        }
        if(e.getSource()==j11){
            j11.setBackground(new Color(0x491FFF));
        }
        if(e.getSource()==j12){
            j12.setBackground(new Color(0xBD5904));
        }
        if(e.getSource()==j13){
            j13.setBackground(new Color(0x8FF5DD));
        }
        if(e.getSource()==j14){
            j14.setBackground(new Color(0xEA4EAD));
        }
        if(e.getSource()==j15){
            j15.setBackground(new Color(0x00F3DF));
        }
        if(e.getSource()==j16){
            j16.setBackground(new Color(0x556F4D));
        }

    }

    public void mouseExited(MouseEvent e) {
        if(e.getSource()==j1){
            j1.setBackground(Color.red);
        }
        if(e.getSource()==j2){
            j2.setBackground(Color.green);
        }
        if(e.getSource()==j3){
            j3.setBackground(Color.MAGENTA);
        }
        if(e.getSource()==j4){
            j4.setBackground(Color.red);
        }
        if(e.getSource()==j5){
            j5.setBackground(Color.yellow);
        }
        if(e.getSource()==j6){
            j6.setBackground(Color.gray);
        }
        if(e.getSource()==j7){
            j7.setBackground(Color.cyan);
        }
        if(e.getSource()==j8){
            j8.setBackground(Color.pink);
        }
        if(e.getSource()==j9){
            j9.setBackground(Color.LIGHT_GRAY);
        }
        if(e.getSource()==j10){
            j10.setBackground(Color.blue);
        }
        if(e.getSource()==j11){
            j11.setBackground(Color.orange);
        }
        if(e.getSource()==j12){
            j12.setBackground(Color.darkGray);
        }
        if(e.getSource()==j13){
            j13.setBackground(new Color(0x783C3C));
        }
        if(e.getSource()==j14){
            j14.setBackground(new Color(0x6B81E8));
        }
        if(e.getSource()==j15){
            j15.setBackground(new Color(0xF24BF8));
        }
        if(e.getSource()==j16){
            j16.setBackground(new Color(0x34FF49));
        }
    }
}

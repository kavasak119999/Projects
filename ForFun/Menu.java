package company;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;


public class Menu extends JFrame {
       JLabel l1, l2,l3;
       JButton b1, b2, b3, b4, b5,b6,b7,b8,b9;
       String sa;
       SimpleDateFormat formats = new SimpleDateFormat("HH:mm:ss");
       Calendar date;
       ImageIcon button = new ImageIcon("src/company/fire.png");




    eHandler handler = new eHandler();


    public Menu(String s){
        super(s);
        Image img = button.getImage() ;
        Image newimg = img.getScaledInstance( 110, 30,  java.awt.Image.SCALE_SMOOTH ) ;
        button = new ImageIcon(newimg);
        sa = formats.format(Calendar.getInstance().getTime());
        setContentPane(new BgPanel());
        Container cont = getContentPane();
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);

        b1 = new JButton("Калькулятор", button);
        b2 = new JButton("Орёл & Решка", button);
        l2 = new JLabel();
        b3 = new JButton("Дата", button);
        b4 = new JButton("Colors", button);
        b5 = new JButton("Battle", button);
        b6 = new JButton("Всякое", button);

        b3.setBorder(BorderFactory.createLineBorder(Color.RED));
        b1.setBorder(BorderFactory.createLineBorder(Color.RED));
        b2.setBorder(BorderFactory.createLineBorder(Color.RED));
        b4.setBorder(BorderFactory.createLineBorder(Color.RED));
        b5.setBorder(BorderFactory.createLineBorder(Color.RED));
        b6.setBorder(BorderFactory.createLineBorder(Color.RED));

        b1.setBounds(20,190,110,30);
        b1.setForeground(new Color(0xE00606));
        b1.setHorizontalTextPosition(SwingConstants.CENTER);
        b1.setOpaque(true);
        add(b1);

        b2.setBounds(20,130,110,30);
        b2.setFont(new Font("", Font.PLAIN,11));
        b2.setForeground(new Color(0xE00606));
        b2.setHorizontalTextPosition(SwingConstants.CENTER);
        b2.setOpaque(true);
        add(b2);

        b3.setBounds(20,70,110,30);
        b3.setForeground(new Color(0xE00606));
        b3.setHorizontalTextPosition(SwingConstants.CENTER);
        b3.setOpaque(true);
        add(b3);

        b4.setBounds(20,250,110,30);
        b4.setForeground(new Color(0xE00606));
        b4.setHorizontalTextPosition(SwingConstants.CENTER);
        b4.setOpaque(true);
        add(b4);

        b5.setBounds(20,310,110,30);
        b5.setForeground(new Color(0xE00606));
        b5.setHorizontalTextPosition(SwingConstants.CENTER);
        b5.setOpaque(true);
        add(b5);

        b6.setBounds(20,370,110,30);
        b6.setForeground(new Color(0xE00606));
        b6.setHorizontalTextPosition(SwingConstants.CENTER);
        b6.setOpaque(true);
        add(b6);

        l2.setBounds(5,3,80,20);
        l2.setFont(new Font("Impact", Font.PLAIN,20));
        l2.setBackground(Color.BLACK);
        l2.setForeground(new Color(0x404040));
        l2.setOpaque(true);
        add(l2);



        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);

        TimeClock();

    }

    private void TimeClock() {
        while (true) {
            sa = formats.format(Calendar.getInstance().getTime());
            l2.setText(sa);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try{
                if(e.getSource()==b1){
                    PlusMinus lalka = new PlusMinus("LALKA");
                }
                if(e.getSource()==b2){
                    OrelReshka or = new OrelReshka("Орёл & Решка");
                }
                if(e.getSource()==b3){
                    Time time = new Time("Дата");
                }
                if(e.getSource()==b4){
                    Colors color = new Colors();
                }
                if(e.getSource()==b5){
                    Battle battle = new Battle("BATTLE");
                }
                if(e.getSource()==b6){
                    All all = new All();
                }
            }
            catch (Exception f){

            }
        }
    }

    class BgPanel extends JPanel{
        public void paintComponent(Graphics g){
            Image im = null;
            try {
                im = ImageIO.read(new File("src/company/kot.jpg"));
            } catch (Exception e) {}
            g.drawImage(im, 0, 0, null);
        }
    }



}

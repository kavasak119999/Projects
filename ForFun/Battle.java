package company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Battle extends JFrame implements ActionListener {
    public static JButton b1, b2, b3,b4,b5;
    public static JLabel l1, l2, l3,scoreMe,scoreBot,score;
    public volatile static int scoreMee, scoreBoot, startTime, b, count;
    public volatile static boolean started = false, game = false;



    public Battle(String s){
        super(s);
        setLayout(null);

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(253,220);
        scoreMee = 0;
        scoreBoot = 0;
        startTime = 4;
        b1 = new JButton("Click");
        b2 = new JButton("Start");
        l1 = new JLabel("YOU");
        l2 = new JLabel("MAX");
        scoreMe = new JLabel(String.valueOf(scoreMee));
        scoreBot = new JLabel(String.valueOf(scoreBoot));
        scoreMe.setBounds(66,37,27,27);
        scoreMe.setFont(new Font("Impact",Font.PLAIN,19));
        scoreBot.setBounds(158,37,27,27);
        scoreBot.setFont(new Font("Impact",Font.PLAIN,19));

        score = new JLabel("");
        score.setBounds(113,30,30,30);
        score.setFont(new Font("Impact",Font.PLAIN,25));

        l3 = new JLabel("level");
        l3.setBorder(BorderFactory.createLineBorder(Color.lightGray,2));
        l3.setBounds(41,110,155,60);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setVerticalAlignment(JLabel.TOP);
        l3.setOpaque(true);

        //Color green = new Color(0x075F03);
        //Color red = new Color(0x860303);
        b3 = new JButton("");
        b3.setBounds(53,138,25,25);
        b3.setBackground(new Color(0x075F03));
        //b3.setFocusable(false);
        b4 = new JButton("");
        b4.setBounds(105,138,25,25);
        b4.setBackground(new Color(0x860303));
        //b4.setFocusable(false);
        b5 = new JButton("");
        b5.setBounds(157,138,25,25);
        b5.setBackground(new Color(0x860303));

        b1.setEnabled(false);
        l1.setBounds(60,8,30,20);
        l2.setBounds(152,8,60,20);
        l1.setForeground(Color.BLUE);
        l2.setForeground(Color.RED);
        b1.setBounds(41,70,70,30);
        b2.setBounds(125, 70,70,30);

        add(l2);
        add(scoreMe);
        add(score);
        add(scoreBot);
        add(b3);
        add(b5);
        add(b4);
        add(l3);
        add(l1);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b1){
                scoreMee++;
                scoreMe.setText(String.valueOf(scoreMee));
            }
            if(e.getSource()==b2){
                if(!started) {
                    startBot();
                }
                else if (started){
                    stop();
                }
            }
            if(e.getSource()==b3){
                b3.setBackground(new Color(0x075F03));
                b4.setBackground(new Color(0x860303));
                b5.setBackground(new Color(0x860303));
            }
            if(e.getSource()==b4){
                b4.setBackground(new Color(0x075F03));
                b3.setBackground(new Color(0x860303));
                b5.setBackground(new Color(0x860303));
            }
            if (e.getSource() == b5) {
                b5.setBackground(new Color(0x075F03));
                b4.setBackground(new Color(0x860303));
                b3.setBackground(new Color(0x860303));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void paintComponent(Graphics g){

    }
    static void stop(){
        b2.setText("Start");
        b1.setEnabled(false);
        started = false;
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
    }
    void startBot() throws InterruptedException {
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        int i = 4;
        while(i > 0) {
                score.setText(String.valueOf(i - 1));
                super.update(this.getGraphics());
                i--;
                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        b1.setEnabled(true);
        b2.setText("Stop");
        started = true;
        count = 31;
        b = 1;
        scoreBoot = 0;
        scoreMee = 0;
        Bot bot = new Bot();
        Thread bot1 = new Thread(bot);
        Me me1 = new Me();
        Thread me2 = new Thread(me1);
        bot1.start();
        me2.start();


    }
    public static class Bot implements Runnable{
        public Bot() {
            super();
        }
        public void run() {
                while (started) {
                    scoreBot.setText(String.valueOf(scoreBoot));
                    scoreBoot++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {

                    }
                }


        }
    }
    public static class Me implements Runnable{



        public void run() {
            while(true){
                if(scoreBoot == 31){
                    stop();
                    JOptionPane.showMessageDialog(null,"Ты проиграл!");
                    break;
                }
                else if(scoreMee == 30){
                    stop();
                    JOptionPane.showMessageDialog(null,"Ты выиграл!");
                    break;
                }
            }
        }
    }

}

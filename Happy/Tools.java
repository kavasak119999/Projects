import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tools extends JFrame {
    JButton b1, b2;
    JLabel l1, l2, l3;
    JTextField f1;
    JComboBox<String> boxx, hapBoxx;
    DefaultComboBoxModel<String> box, hapBox;
    String[] elements = new String[] {"Синий", "Желтый", "Красный",
            "Зеленый", "Фиолетовый", "Черный"};
    String[] element = new String[] {"#1", "#2", "#3"};
    eHandler handler = new eHandler();
    String text = "<html>Поздравляю с днем рождения. " +
            "Желаю крупных успехов, крепкого здоровья и надежных друзей." +
            " Пусть дом твой будет уютным, теплым и добрым." +
            " Пусть никогда не исчезает вдохновение жить, любить, творить и побеждать.</html>";
    String textB = "<html> Желаю здоровья, успехов, достатка!" +
            " И деньги чтоб липли к ладошкам и пяткам!" +
            " Желаю удачи и верных друзей" +
            " Огромного счастья и солнечных дней!</html>";
    String textC = "<html> Пусть удача ведет, как звезда," +
            " Планы новые строятся смело!" +
            " Пусть находятся силы всегда" +
            " Для мечты и любимого дела!" +
            " Пусть проблемы улетают," +
            " Как воздушные шары," +
            " С днем рождения поздравляю," +
            " Улыбайся, не грусти!</html>";

    Tools() {
        super("Инструменты");
        b1 = new JButton("ОБОЗНАЧИТЬ");
        b1.setBounds(151,93,109,26);
        b1.setFont(new Font(null, Font.PLAIN,11));
        add(b1);
        b2 = new JButton("ОКРАСИТЬ");
        b2.setBounds(20,93,111,27);
        b2.setFont(new Font(null, Font.PLAIN, 11));
        add(b2);


        hapBox = new DefaultComboBoxModel<>();
        for (String s : element) {
            hapBox.addElement(s);
        }
        hapBoxx = new JComboBox<>(hapBox);
        hapBoxx.setBounds(35,165,70,17);
        hapBoxx.setSelectedItem("1");
        add(hapBoxx);
        box = new DefaultComboBoxModel<>();
        for (String s : elements) {
            box.addElement(s);
        }

        boxx = new JComboBox<>(box);
        boxx.setBounds(20,45,112,40);
        boxx.setSelectedItem("ЖЕЛТЫЙ");
        add(boxx);
        boxx.addActionListener(handler);
        hapBoxx.addActionListener(handler);
        b1.addActionListener(handler);
        b2.addActionListener(handler);


        l1 = new JLabel("Цвет шрифта");
        l1.setBounds(24,11,100,40);
        l1.setFont(new Font(null,Font.PLAIN,15));
        add(l1);
        l2 = new JLabel("Именинник");
        l2.setBounds(165,11,100,40);
        l2.setFont(new Font(null,Font.PLAIN,15));
        add(l2);
        l3 = new JLabel("Шаблон поздравления");
        l3.setBounds(16,130,140,40);
        l3.setFont(new Font(null,Font.PLAIN,11));
        add(l3);
        f1 = new JTextField();
        f1.setBounds(155,45,100,40);
        f1.setFont(new Font(null,Font.PLAIN,15));
        add(f1);




        this.setLocation(1000, 1);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLayout(null);
        setSize(300,230);
        setVisible(true);
    }


    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try{
                if(e.getSource()==b1){
                    Happy.l1.setText(f1.getText());
                }
                else if(e.getSource()== hapBoxx){
                    int s = hapBoxx.getSelectedIndex();
                    if(s == 0){
                        Happy.hap.setText(text);
                    }
                    else if(s == 1){
                        Happy.hap.setText(textB);
                    }
                    else if(s == 2){
                        Happy.hap.setText(textC);
                    }
                }
                else if(e.getSource()==b2){
                    int s = (boxx.getSelectedIndex());
                    if(s == 0){
                        Happy.setColorText(Color.BLUE);
                    }
                    if(s == 1){
                        Happy.setColorText(Color.YELLOW);
                    }
                    if(s == 2){
                        Happy.setColorText(Color.RED);
                    }
                    if(s == 3){
                        Happy.setColorText(Color.GREEN);
                    }
                    if(s == 4){
                        Happy.setColorText(new Color(0xFC4C40C9, true));
                    }
                    if(s == 5){
                        Happy.setColorText(Color.BLACK);
                    }
                }
            }

            catch (Exception ignored){

            }
        }
    }

}

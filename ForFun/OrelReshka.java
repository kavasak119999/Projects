package company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrelReshka extends JFrame {
    JButton b1, b2,b3,b4;
    JLabel l1, l2,l3,l4;
    eHandler handler = new eHandler();
    public OrelReshka(String s){
        super(s);
        GridBagConstraints c = new GridBagConstraints ();
        GridBagConstraints l12 = new GridBagConstraints ();

        setVisible(true);
        setSize(180,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLayout(new GridBagLayout());
        b1 = new JButton("ПОДКИНУТЬ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20; //Восстановление значений по умолчанию
        c.weighty = 1.0; // запрашиваем дополнительное вертикальное пространство
        c.anchor = GridBagConstraints.PAGE_START; // нижняя часть пространства
        c.insets = new Insets(5,5,5,5); // заполнение сверху
        //c.gridx = 1; // выравнивается с кнопкой 2
        //c.gridwidth = 2; // 2 колонки шириной
        //c.gridy = 2; // третья строка
        b1.setFont(new Font("Arial Black", Font.PLAIN, 15));
        add(b1,c);
        l1 = new JLabel("");
        l12.fill = GridBagConstraints.CENTER;
        l12.ipady = 40;
        l12.weightx = 0.0;
        l1.setFont(new Font("Arial Black", Font.PLAIN, 15));
        l12.gridx = 0;
        l12.insets = new Insets(1,1,3,1);
        l12.anchor = GridBagConstraints.CENTER;

        add(l1,l12);
        b1.addActionListener(handler);



    }
    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                if(e.getSource() == b1){
                    int RandomNumber = (int) (Math.random() * 2);
                    if(RandomNumber == 0){
                        l1.setText("ОРЁЛ");
                        l1.setForeground(Color.BLUE);
                    }
                    else{
                        l1.setText("РЕШКА");
                        l1.setForeground(Color.RED);
                    }
                }
            }
            catch(Exception es){

            }
        }
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Happy extends JFrame {
    public static JLabel l1,hap;
    public static Object pict;
    String[] fn = new String[] {"Космос", "Цветы", "Машины"};

    public static File pic;


    Happy() throws IOException {
        super("Открытка");
        pict = JOptionPane.showInputDialog(Happy.this,"Выберите стиль открытки", "Объект", JOptionPane.QUESTION_MESSAGE, null,fn,fn[0]);
        if(pict.equals(fn[0])){
            setFile(new File("kosm.png"));
            setContentPane(new BgPanel());
        }
        else if(pict.equals(fn[1])){
            setFile(new File("flav.png"));
            setContentPane(new BgPanel());
        }
        else if(pict.equals(fn[2])){
            setFile(new File("cars.png"));
            setContentPane(new BgPanel());
        }
        this.setLocation(1, 1);

        l1 = new JLabel();
        l1.setBounds(325,120,230,100);
        l1.setFont(new Font("Segoe Print", Font.PLAIN,40));
        l1.setForeground(new Color(0xFFFF19));
        l1.setBackground(getColor(pic));
        l1.setOpaque(true);
        add(l1);

        hap = new JLabel();
        hap.setBounds(150,252,560,171);
        hap.setFont(new Font("Segoe Print", Font.PLAIN,20));
        hap.setForeground(new Color(0xFFFF19));
        hap.setBackground(getColor(pic));
        hap.setOpaque(true);
        add(hap);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(813,637);
        setVisible(true);
    }

    public void setName(String s){ //getter
        l1.setText(s);

    }

    public static void setColorText(Color s){ //getter
        l1.setForeground(s);
        hap.setForeground(s);
    }

    public static File getFile(){ //getter
        return pic;
    }
    public static void setFile(File f){ //setter
        pic = f;
    }

    static class BgPanel extends JPanel{ // наследуется от JPanel
        public void paintComponent(Graphics g){
            Image im = null;
            try {
                im = ImageIO.read(getFile());
            } catch (Exception ignored) {}
            g.drawImage(im, 0, 0, null);
        }
    }



    public static void main(String[] args) throws IOException {
        new Happy();
        new Tools();
    }
    public Color getColor(File file) throws IOException { //getter
        BufferedImage image = ImageIO.read(file);
        return new Color(image.getRGB(300,300));
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.tika.language.LanguageIdentifier;


public class MenuApp extends JFrame {
    public static String language = "";
    JButton b1;
    JTextArea f1;
    public static JLabel l1;
    public static Object result = null;
    public static String word;
    eHandler handler = new eHandler();
    public static String[] elements = new String[] {"Славянская группа", "Германская группа",
            "Романская группа"};


    MenuApp(){
        super("Язык текста");
        result = JOptionPane.showInputDialog(MenuApp.this,"Выберите языковую группу","Выбор группы",JOptionPane.QUESTION_MESSAGE, null,elements,elements[0]);

        b1 = new JButton("Определить");
        l1 = new JLabel();
        f1 = new JTextArea(20,20);

        b1.setBounds(100,210, 150,50);
        l1.setBounds(80,30,350,60);
        l1.setFont(new Font("Impact", Font.PLAIN,15));

        f1.setBounds(60,100,220,100);
        f1.setLineWrap(true);
        f1.setWrapStyleWord(true);

        JScrollPane scroller1 = new JScrollPane();
        scroller1.setViewportView(f1);
        scroller1.setBounds(60,80,220,100);



        add(b1);
        add(scroller1);
        add(l1);

        b1.addActionListener(handler);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(350,350);
        setVisible(true);




    }
    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try{
                if(e.getSource()==b1){
                    @Deprecated
                    LanguageIdentifier identifier = new LanguageIdentifier(f1.getText());
                    language = identifier.getLanguage();
                    languages(language);

                }
            }
            catch(Exception ignored){

            }
        }
    }
    public void languages(String language) {
        if (result.equals(elements[0])) { // Славянская группа
            switch (language) {
                case "ru" -> {
                    word = "Русский";
                    l1.setText("Язык текста - " + word);
                }
                case "be" -> {
                    word = "Белорусский";
                    l1.setText("Язык текста - " + word);
                }
                case "uk" -> {
                    word = "Украинский";
                    l1.setText("Язык текста - " + word);
                }
                case "sl" -> {
                    word = "Словенский";
                    l1.setText("Язык текста - " + word);
                }
                case "sk" -> {
                    word = "Словацкий";
                    l1.setText("Язык текста - " + word);
                }
                case "pl" -> {
                    word = "Польский";
                    l1.setText("Язык текста - " + word);
                }
                default -> {
                    l1.setText("");
                    JOptionPane.showMessageDialog(MenuApp.this, "Введенный язык из данной языковой группы не найден.", "Язык не найден", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (result.equals(elements[1])) { // Германская группа
            switch (language) {
                case "da" -> {
                    word = "Датский";
                    l1.setText("Язык текста - " + word);
                }
                case "sv" -> {
                    word = "Шведский";
                    l1.setText("Язык текста - " + word);
                }
                case "no" -> {
                    word = "Норвежский";
                    l1.setText("Язык текста - " + word);
                }
                case "is" -> {
                    word = "Исландский";
                    l1.setText("Язык текста - " + word);
                }
                case "en", "lt" -> {
                    word = "Английский";
                    l1.setText("Язык текста - " + word);
                }
                case "nl" -> {
                    word = "Нидерландский";
                    l1.setText("Язык текста - " + word);
                }
                case "de" -> {
                    word = "Немецкий";
                    l1.setText("Язык текста - " + word);
                }
                default -> {
                    l1.setText("");
                    JOptionPane.showMessageDialog(MenuApp.this, "Введенный язык из данной языковой группы не найден.", "Язык не найден", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (result.equals(elements[2])) { // Романская группа
            switch (language) {
                case "fr" -> {
                    word = "Французский";
                    l1.setText("Язык текста - " + word);
                }
                case "it" -> {
                    word = "Итальянский";
                    l1.setText("Язык текста - " + word);
                }
                case "es" -> {
                    word = "Испанский";
                    l1.setText("Язык текста - " + word);
                }
                case "ca" -> {
                    word = "Каталинский";
                    l1.setText("Язык текста - " + word);
                }
                case "pt" -> {
                    word = "Португальский";
                    l1.setText("Язык текста - " + word);
                }
                case "ro" -> {
                    word = "Румынский";
                    l1.setText("Язык текста - " + word);
                }
                default -> {
                    l1.setText("");
                    JOptionPane.showMessageDialog(MenuApp.this, "Введенный язык из данной языковой группы не найден.", "Язык не найден", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
    public static void main(String[] args){
        new MenuApp();
    }
}

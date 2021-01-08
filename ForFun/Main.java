package company;


public class Main {
    public static void main(String[] args){
        Main.class.getClassLoader().getResource("src/company/mainCat.png");
        Menu menu = new Menu("Меню");
    }
}

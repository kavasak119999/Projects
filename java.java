import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class NewMain {
    private static ArrayList<String> abc = new ArrayList<>();
    private static final int size = 30;
    private static String word;
    private static String words = "";
    private static String saveWords = "";
    private static ArrayList<String> result = null;


    public static void main(String[] args) {
        abc.add("Серед ліцейських викладачів дауж если бы."); // 26
        abc.add("Не беручи участі в діяльності перших таємних організацій,"); // больше 30
        abc.add("Серед ліцейських яких викладачів був Пушкін."); // После Пу - 30

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Вписуйте рядки, щоб зупинити введення введіть \"кінець\"");
        while(scanner.hasNextLine()){
            String scan = scanner.nextLine();
            if(scan.equals("кінець")) break;
            listOfWords.add(scan);
        }*/
        result = getIt(abc);

        System.out.println("******************");
        for(String s : result){
            System.out.println(s);
        }

    }

    public static ArrayList<String> getIt(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        String sent = "";
        String word = "";
        String line = "";
        String next = "";
        String parseWord = "";
        String allParseWord = "";
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() > size){
                if(!word.equals("")){
                    list.set(i,word + list.get(i));
                    word = "";
                }
                if(!parseWord.equals("")){
                    list.set(i, parseWord + " " + list.get(i));
                    parseWord = "";
                }
                while(list.get(i).length() > size) {
                    line = list.get(i);
                    word = list.get(i).substring(list.get(i).lastIndexOf(' ') + 1) + " " + word;
                    sent = line.substring(0,line.lastIndexOf(' '));
                    list.set(i,sent);
                }

                next = getFirstWord(word);

                if(next.length() > 3) {
                    parseWord = makeSyllable(next);
                    allParseWord = getMainWord(next, parseWord);
                    result.add(list.get(i) + " " + allParseWord);

                }
                else{
                    result.add(list.get(i) + " " + next);
                }

                //System.out.println(next);
                //System.out.println(parseWord + " 1");
                //System.out.println(allParseWord + " 1");
                word = word.substring(word.indexOf(' ')+1);
            }
            else{
                result.add(list.get(i));
            }
        }


        if(!parseWord.equals("") && !word.equals("")){
            /*while(result.get(result.size() - 1).length() > size){
                 // Доделать метод для одной линии! и вызывать каждый раз когда работает цикл
            }*/
            System.out.println("2");
            result.add(parseWord + " " + word);
        }
        else if(!parseWord.equals("")){
            System.out.println("1");
            result.add(parseWord);
        }




        return result;
    }


    public static String getFirstWord(String word){
        return word.substring(0,word.indexOf(' '));
    }
    public static String makeSyllable(String word){
        String[] glas = { "а", "у", "е", "ї", "и", "о", "я", "і", "є", "ю" };
        word = word.toLowerCase();

        List<Integer> glasIndexes = new ArrayList<>();
        for (int i = 0; i < word.length(); i++)
        {
            String symbol = word.substring(i, i + 1);
            for (String gla : glas) {
                if (symbol.equals(gla)) {
                    glasIndexes.add(i);
                    break;
                }
            }
        }


        String result = "";
        for (int i = glasIndexes.size() - 1; i > 0; i--)
        {

            String symbol = word.substring(glasIndexes.get(i)- 1, glasIndexes.get(i));
            if (symbol.equals("ь"))
            {
                int n = glasIndexes.get(i) - glasIndexes.get(i - 1) - 1;
                result = "-" + word.substring(glasIndexes.get(i)) + result;
                word = word.replace(String.valueOf(glasIndexes.get(i)), "");
            }
            else
            {
                int n = glasIndexes.get(i) - glasIndexes.get(i - 1) - 1;
                int ind = glasIndexes.get(i - 1) + 1 + n / 2;
                symbol = word.substring(ind, ind + 1);
                if (symbol.equals("ь")) ind++;

                result = "-" + word.substring(ind) + result;
                word = word.replace(String.valueOf(ind), "");
            }

        }

        result = result.substring(result.lastIndexOf("-")).replace("-", "");
        return result;
    }
    public static String getMainWord(String word, String result){
        word = word.replace(result,"-");
        return word;
    }
}

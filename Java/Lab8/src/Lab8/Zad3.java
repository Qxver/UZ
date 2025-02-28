package Lab8;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("zawarte w nim słowa");
        Matcher matcher = pattern.matcher("Z podanego zdania należy wyodrębnić zawarte w nim słowa stosując wyrażenie regularne.");
        boolean match = matcher.find();
        boolean match100 = matcher.matches();
        System.out.println(match);
        System.out.println(match100);

    }
}

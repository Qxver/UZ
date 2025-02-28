package Lab8;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]+[a-z0-9._-]{3,}@[a-z0-9]+[a-z0-9._-]\\.[a-z]{2,}");
        Matcher matcher = pattern.matcher("maill@gmail.com");
        boolean match = matcher.find();
        if(match) {
          System.out.println("E-mail prawidlowy");
        }
        else{
            System.out.println("E-mail nie prawidlowy");
        }

    }
}

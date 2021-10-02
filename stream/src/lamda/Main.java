package lamda;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        FeildEvent onInput = (s1,s2)-> "Hello".toLowerCase(Locale.ROOT) + "Hello!" + "Hay".toLowerCase(Locale.ROOT);
        System.out.println(onInput);
    }
    String handle (String s1, String s2){
        return s1.toLowerCase(Locale.ROOT) + "Hello" + s2.toLowerCase(Locale.ROOT);
    }
}

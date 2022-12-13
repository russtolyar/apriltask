package rus.april.com.solvd.extra.november;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class E1 {
    public static void main(String[] args) {
        String s = "Hello world";
        printMap(countLetters(s));
    }

    public static Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (letters.containsKey(s.toLowerCase(Locale.ROOT).charAt(i))) {

                letters.put(s.toLowerCase(Locale.ROOT).charAt(i), letters.get(s.charAt(i)) + 1);
            } else {
                letters.put(s.toLowerCase(Locale.ROOT).charAt(i), 1);
            }}
        return letters;
    }

    public static void printMap(Map<Character, Integer> let) {
        let.entrySet().stream().forEach(s->System.out.println(s.getKey() + " - " + s.getValue()));
    }
}
package rus.april.com.solvd.extra.extra1;


import java.util.HashMap;
import java.util.Map;

// "Hello world hhhh"

/**
 * h = 1
 * e = 1
 * l = 3
 * 0 = 2
 */
// Main class should be named 'Solution'
// What are the list of test cases to test your function x
public class ExtraTask1AT {
    public static void main(String[] args) {
        String str = "Hello world";
        Map<Character, Integer> hashMap = letterCounter(str);

        hashMap.entrySet().stream().forEach(entry ->
                System.out.println(entry.getKey() + "=" + entry.getValue())
        );

    }

    private static Map<Character, Integer> letterCounter(String str) {
        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (letters.containsKey(str.charAt(i))) {
                letters.put(str.charAt(i), letters.get(str.charAt(i)) + 1);
            } else {
                letters.put(str.charAt(i), 1);
            }
        }
        return letters;
    }

}
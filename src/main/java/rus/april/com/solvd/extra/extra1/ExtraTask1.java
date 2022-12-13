package rus.april.com.solvd.extra.extra1;

import java.util.HashMap;
import java.util.Map;

public class ExtraTask1 {
    /**
     * "Hello world" count letters
     * h - 1
     * e - 1
     * l - 3 ...
     */
    public static void main(String[] args) {
        String s = "Hello world";
        countLetters(s);
    }

    public static void countLetters(String s) {
        String[] sArr = s.split("");
        int count = 1;
        Map<String,Integer>lettersMap = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            if(lettersMap.containsKey(sArr[i])){
                continue;
            }
            for (int j = i + 1; j < sArr.length; j++) {

                if (sArr[j].equals(sArr[i].toLowerCase())) {
                    count++;
                    lettersMap.put(sArr[i].toLowerCase(),count);
                }
            }
            System.out.println(sArr[i].toLowerCase() + " - " + count);

            count = 1;
        }

    }
}
package rus.april.com.solvd.extra.extra1;

import java.util.HashMap;
import java.util.Map;

public class ExtraTask1Try2 {
    public static void main(String[] args) {
        String str = "Hello world";
        print(str);

    }

    public static void print(String str) {
        Map<Character, Integer> strMap = createMap(str);
        strMap.entrySet().forEach(e ->
                System.out.println(e.getKey() + " = " + e.getValue()));
    }

    public static Map<Character, Integer> createMap(String str) {
        Map<Character, Integer> strMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (strMap.containsKey(str.charAt(i))) {
                strMap.put(str.charAt(i), strMap.get(str.charAt(i)) + 1);
            } else {
                strMap.put(str.charAt(i), 1);
            }
        }
        return strMap;
    }
}
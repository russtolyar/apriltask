package rus.april.com.solvd.tasksreddit.november;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class T6 {
    /**
     * Сombinations
     * You have next input parameters.
     * Coins = 400;
     * Menu = { "coffee" : 100
     * "cake" : 200
     * "popcorn" : 225
     * }
     * You need to calculate optimal amount of products that you can buy for your coins. Print all possible combinations of foods.
     */
    public static void main(String[] args) {
        int coins = 400;
        Map<String, Integer> menu = Map.ofEntries(entry("coffee", 100), entry("cake", 200), entry("popcorn", 225));

        findVariantsLight(menu,coins);
    }

    public static void findVariantsLight(Map<String, Integer> menu, int coins) {
        List<Integer> menuListInt = new ArrayList<>(menu.values());

        for (int i = 0; i < menu.size(); i++) {
            if(menuListInt.get(i) <= coins){
                System.out.println(getTheKeyFromVal(menu, menuListInt.get(i)));
            }
            for (int j = i; j < menuListInt.size(); j++) {
                if ((menuListInt.get(i) + menuListInt.get(j)) <= coins){
                    System.out.println(getTheKeyFromVal(menu, menuListInt.get(i)) + "  and  "
                            + getTheKeyFromVal(menu, menuListInt.get(j)));
                }
                for (int k = j; k < menuListInt.size(); k++) {
                    if ((menuListInt.get(i) + menuListInt.get(j) + menuListInt.get(k)) <= coins){
                        System.out.println(getTheKeyFromVal(menu, menuListInt.get(i)) + "  and  "
                                + getTheKeyFromVal(menu, menuListInt.get(j))  + "  and  "
                                + getTheKeyFromVal(menu, menuListInt.get(k)));
                    }}
            }
        }
    }

    public static String getTheKeyFromVal(Map<String, Integer> menu, int coin) {
        for (String s : menu.keySet()) {
            if (menu.get(s).equals(coin)) {
                return s;
            }
        }return  null;
    }
}
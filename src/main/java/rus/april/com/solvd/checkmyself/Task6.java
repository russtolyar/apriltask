package rus.april.com.solvd.checkmyself;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class Task6 {
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
        Map<String, Integer> menu = Map.ofEntries(entry("coffee", 100), entry("cake", 200), entry("popcorn", 225), entry("0", 0));
        findVariants(coins, menu);


    }

    public static void findVariants(int coins, Map<String, Integer> menu) {
        List<Integer> menuCost = new ArrayList<>(menu.values());
        System.out.println(menuCost);
        System.out.println("coins = " + coins);
        for (int i = 0; i < menu.size(); i++) {
            for (int j = 0; j < menu.size(); j++) {
                if ((menuCost.get(i) + menuCost.get(j)) <= coins) {
                    System.out.println("\nu can buy\n");
                    System.out.print(getKey(menu, menuCost.get(i)));
                    System.out.println();
                    System.out.print(getKey(menu, menuCost.get(j)));

                }
            }
        }

    }

    public static Object getKey(Map<String, Integer> menu, int val) {
        for (Object e : menu.keySet()) {
            if (menu.get(e).equals(val)) {
                return (String) e;
            }
        }
        return null;
    }
}
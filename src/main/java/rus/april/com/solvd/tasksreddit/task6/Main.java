package rus.april.com.solvd.tasksreddit.task6;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class Main {
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
        findVariants(coins, menu);


    }

    public static void findVariants(int coins, Map<String, Integer> menu) {
//        int[] menuInt = new int[menu.size()];
//        Set<String> menuString = menu.keySet();
        List<Integer> menuIntList = new LinkedList<>(menu.values());
        System.out.println(menuIntList);
        for (int i = 0; i < menuIntList.size(); i++) {
            for (int j = i + 1; j < menuIntList.size(); j++) {
                if ((menuIntList.get(i) + menuIntList.get(j)) <= coins) {
                    System.out.println("\nA variant of products u can buy for your coins");
                    String products = String.format("These products '%s' and '%s' can be bought for these coins - '%d'"
                            , getKeyFromValue(menu,menuIntList.get(i)), getKeyFromValue(menu,menuIntList.get(j)), coins);
                    System.out.println(products);
                }
            }
        }

    }
    public static Object getKeyFromValue(Map menu, int value) {
        for (Object s : menu.keySet()) {
            if (menu.get(s).equals(value)) {
                return (String) s;
            }
        }
        return null;
    }

}
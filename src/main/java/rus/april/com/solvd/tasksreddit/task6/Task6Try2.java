package rus.april.com.solvd.tasksreddit.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class Task6Try2 {
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
        findVariants(menu, coins);
    }
// position ("0" - 0 ) - was added to !unlimit! ALL possible variants

    public static void findVariants(Map<String, Integer> menu, int coins) {
        List<Integer> menuCostList = new ArrayList<>(menu.values());
        String welcome = String.format("for given money '%s' from menu with prices '%s' - we can buy following sets:\n", coins, menuCostList);
        System.out.println(welcome);
        for (int i = 0; i < menuCostList.size(); i++) {
            for (int j = 0; j < menuCostList.size(); j++) {
                for (int k = 0; k < menuCostList.size(); k++) {
                    if ((menuCostList.get(i) + menuCostList.get(j) + menuCostList.get(k)) <= coins) {
                        String setVariant = String.format("Variant: '%s' for '%d' and  '%s' for '%d' and  '%s' for '%d' with total sum .................... '%d'"
                                , getKeyNameFromValueCost(menu, menuCostList.get(i)), menuCostList.get(i),
                                getKeyNameFromValueCost(menu, menuCostList.get(j)), menuCostList.get(j),
                                getKeyNameFromValueCost(menu, menuCostList.get(k)), menuCostList.get(k),
                                menuCostList.get(i) + menuCostList.get(j) + menuCostList.get(k));
                        System.out.println(setVariant);
                    }
                }
            }
        }
    }

    private static Object getKeyNameFromValueCost(Map<String, Integer> menu, int value) {
        for (Object s : menu.keySet()) {
            if (menu.get(s).equals(value)) {
                return (String) s;
            }
        }
        return null;
    }

    public static void myIdeas(Map<String, Integer> menu, int coins) {
        List<Integer> menuCostList = new ArrayList<>(menu.values());
        int count = 0;
        for (int n = 0; n < menuCostList.size(); n++) {
            coins = coins - menuCostList.get(n);
            String setVariant = String.format("Variant: '%s' for '%d' "
                    , getKeyNameFromValueCost(menu, menuCostList.get(n)), menuCostList.get(n));

//отсекать элемены единичные и продолжать работу с оставшейся суммой и снова отскекать
        }
    }

    public static List<Integer> getPriceList(Map<String, Integer> menu) {
        List<Integer> menuCostList = new ArrayList<>(menu.values());
        return menuCostList;
    }

    public static int findTheHighestPrice(Map<String, Integer> menu) {
        List<Integer> menuCostList = getPriceList(menu);
        int maxPrice = 0;
        for (int i = 0; i < menuCostList.size(); i++) {
            if (menuCostList.get(i) > maxPrice) {
                maxPrice = menuCostList.get(i);
            }
        }
        return maxPrice;
    }

    public static List<Integer> getCutMenuListUnderMaxPrice(Map<String, Integer> menu) {
        List<Integer> menuCostList = getPriceList(menu);
        int maxPrice = findTheHighestPrice(menu);
        for (int i = 0; i < menuCostList.size(); i++) {
            if (menuCostList.get(i) == maxPrice) {
                menuCostList.remove(i);
            }
        }
        return menuCostList;
    }
//
//    public static Map<String, Integer> getCutMenu(Map<String, Integer> menu){
//
//    }

    public static int findNextMaxPrice(List<Integer> menuCostList, int maxPrice) {
        int maxPriceNext = 0;
        for (int i = 0; i < menuCostList.size(); i++) {
            if (menuCostList.get(i) > maxPriceNext && maxPriceNext < maxPrice) {
                maxPriceNext = menuCostList.get(i);
            }
        }
        return maxPriceNext;
    }

    public static int findPossibleQuantityForMaxPrice(Map<String, Integer> menu, int coins) {
        int maxPrice = findTheHighestPrice(menu);
        return coins / maxPrice;

    }


}
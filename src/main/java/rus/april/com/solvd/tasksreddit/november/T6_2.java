package rus.april.com.solvd.tasksreddit.november;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Map.entry;

public class T6_2 {
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

//        findVariantsLight(menu,coins);
        getAllVar(menu, coins);
    }

    public static void getAllVar(Map<String, Integer> menu, int coins) {
        TreeMap<String,Integer> sortedMap = new TreeMap<>(menu);
        List<String> menuItemsList = new ArrayList<>(sortedMap.keySet());
        List<Integer> menuCostsList = new ArrayList<>(sortedMap.values());
        printItemsForMoney(sortedMap, menuCostsList, coins);

    }

    public static void printItemsForMoney(Map<String, Integer> menu, List<Integer> menuCostsList, int coins) {
//        int minus = 0;

        while (menuCostsList.size() > 0) {
            for (int i = 0; i < menuCostsList.size(); i++) {
                int minus = 0;
                for (int j = i; j < menuCostsList.size(); j++) {
                    if (menuCostsList.get(j) + minus <= coins) {
                        System.out.print(getTheKeyFromTheValue(menu, menuCostsList.get(j)) + "  ");
                        minus += menuCostsList.get(i);
                    }
                }
            }
//        for (Integer i : menuCostsList){
//            if(i + minus <= coins){
//                System.out.print(getTheKeyFromTheValue(menu,i) + "  ");
//                minus += i;
//            }
//        }
            System.out.println();
            menuCostsList.remove(0);
            printItemsForMoney(menu, menuCostsList, coins);
        }
    }

    public static String getTheKeyFromTheValue(Map<String, Integer> menu, int val) {
        for (String s : menu.keySet()) {
            if (menu.get(s).equals(val)) {
                return s;
            }
        }
        return null;
    }

}
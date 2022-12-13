package rus.april.com.solvd.tasksreddit.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;
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
public class Task6Try4 {
    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int coins = 400;
        Map<String, Integer> menu = Map.ofEntries(entry("coffee", 100), entry("cake", 200), entry("popcorn", 225));
        int[] amounts = menu.values().stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(amounts);
        getCombinations(amounts, 0, new ArrayList<>(), 0, coins);
        System.out.println(res);
        printResult(menu,res);
    }

    private static void getCombinations(int[] arr, int start, List<Integer> results, int sum, int target) {
        int minValue = arr[0];
        if (sum == target || sum + minValue > target) {
            res.add(new ArrayList<Integer>(results));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (arr[i] + sum > target) break;

            results.add(arr[i]);
            getCombinations(arr, i, results, sum + arr[i], target);
            results.remove(results.size() - 1);
        }
    }

    public static Object getTheProductByValue(Map<String, Integer> menu, int value) {
        for (Object o : menu.keySet()) {
            if (menu.get(o).equals(value)) {
                return (String) o;
            }
        }
        return null;
    }
    public static void printResult(Map<String, Integer> menu, List<List<Integer>> res ){
        for (int i = 0; i < res.size(); i++){
            for (int j = 0; j < res.get(i).size(); j ++){
                System.out.println("Variant : " + getTheProductByValue(menu, res.get(i).get(j)) + " - " + res.get(i).get(j));
            }
            System.out.println();
        }
    }

}
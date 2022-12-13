package rus.april.com.solvd.tasksreddit.task5;

import java.util.*;

import static java.util.Map.entry;

public class Main {
    /**
     * Map processing
     * get the total number of views for the last two days
     * Map < String, Map < String, Map < String, Integer >>> test1 = Map.ofEntries(
     * entry("2021-12-23", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 111902), entry("pageviews", 221081))), entry("android", Map.ofEntries(entry("uniques", 298063), entry("pageviews", 1153728))), entry("old reddit", Map.ofEntries(entry("uniques", 132801), entry("pageviews", 723509))), entry("ios", Map.ofEntries(entry("uniques", 311642), entry("pageviews", 755030))), entry("mobile web", Map.ofEntries(entry("uniques", 130288), entry("pageviews", 219457))))),
     * entry("2021-12-22", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 118371), entry("pageviews", 225093))), entry("android", Map.ofEntries(entry("uniques", 280199), entry("pageviews", 1291546))), entry("old reddit", Map.ofEntries(entry("uniques", 145437), entry("pageviews", 760191))), entry("ios", Map.ofEntries(entry("uniques", 257443), entry("pageviews", 575184))), entry("mobile web", Map.ofEntries(entry("uniques", 116411), entry("pageviews", 191464))))),
     * entry("2021-12-21", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 175446), entry("pageviews", 300378))), entry("android", Map.ofEntries(entry("uniques", 331628), entry("pageviews", 1613490))), entry("old reddit", Map.ofEntries(entry("uniques", 164052), entry("pageviews", 830788))), entry("ios", Map.ofEntries(entry("uniques", 288464), entry("pageviews", 626490))), entry("mobile web", Map.ofEntries(entry("uniques", 111844), entry("pageviews", 193197))))),
     * entry("2021-12-10", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 140548), entry("pageviews", 267522))), entry("android", Map.ofEntries(entry("uniques", 375491), entry("pageviews", 1336061))), entry("old reddit", Map.ofEntries(entry("uniques", 189477), entry("pageviews", 957462))), entry("ios", Map.ofEntries(entry("uniques", 418290), entry("pageviews", 985014))), entry("mobile web", Map.ofEntries(entry("uniques", 198403), entry("pageviews", 336195)))))
     */

    public static void main(String[] args) {
        Map<String, Map<String, Map<String, Integer>>> test1 = Map.ofEntries(
                entry("2021-12-23", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 111902), entry("pageviews", 221081))), entry("android", Map.ofEntries(entry("uniques", 298063), entry("pageviews", 1153728))), entry("old reddit", Map.ofEntries(entry("uniques", 132801), entry("pageviews", 723509))), entry("ios", Map.ofEntries(entry("uniques", 311642), entry("pageviews", 755030))), entry("mobile web", Map.ofEntries(entry("uniques", 130288), entry("pageviews", 219457))))),
                entry("2021-12-22", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 118371), entry("pageviews", 225093))), entry("android", Map.ofEntries(entry("uniques", 280199), entry("pageviews", 1291546))), entry("old reddit", Map.ofEntries(entry("uniques", 145437), entry("pageviews", 760191))), entry("ios", Map.ofEntries(entry("uniques", 257443), entry("pageviews", 575184))), entry("mobile web", Map.ofEntries(entry("uniques", 116411), entry("pageviews", 191464))))),
                entry("2021-12-21", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 175446), entry("pageviews", 300378))), entry("android", Map.ofEntries(entry("uniques", 331628), entry("pageviews", 1613490))), entry("old reddit", Map.ofEntries(entry("uniques", 164052), entry("pageviews", 830788))), entry("ios", Map.ofEntries(entry("uniques", 288464), entry("pageviews", 626490))), entry("mobile web", Map.ofEntries(entry("uniques", 111844), entry("pageviews", 193197))))),
                entry("2021-12-10", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 140548), entry("pageviews", 267522))), entry("android", Map.ofEntries(entry("uniques", 375491), entry("pageviews", 1336061))), entry("old reddit", Map.ofEntries(entry("uniques", 189477), entry("pageviews", 957462))), entry("ios", Map.ofEntries(entry("uniques", 418290), entry("pageviews", 985014))), entry("mobile web", Map.ofEntries(entry("uniques", 198403), entry("pageviews", 336195))))));
//        getMapEntriesForLastTwoDays(test1);
//        totalNumberViews(getMapEntriesForLastTwoDays(test1));
//        getSecondLevelMapViewsSum(test1, 0);
//        getSecondLevelMapViewsSum(test1, 1);
        summationTwoDaysViews(getSecondLevelMapViewsSum(test1,0),getSecondLevelMapViewsSum(test1,1));

    }
    public static int summationTwoDaysViews(int viewsFirstDay, int viewsSecondDay){
        int totalSum = viewsFirstDay + viewsSecondDay;
        System.out.println("\n\nTotalSum  of views for two days = " + totalSum);
        return totalSum;
    }
    public static Map<String, Map<String, Integer>> getFirstLevelMap(Map<String, Map<String, Map<String, Integer>>> inputMap, int day) {
        Set<String> dates = inputMap.keySet();
        String thisDayKey = findTwoLastDates(dates)[day];
        Map<String, Map<String, Integer>> thisDateMap = inputMap.get(thisDayKey);
        return thisDateMap;
    }

    public static int getSecondLevelMapViewsSum(Map<String, Map<String, Map<String, Integer>>> inputMap, int day) {
        Map<String, Map<String, Integer>> firstLevelMap = getFirstLevelMap(inputMap, day);
        String neededKey = "pageviews";
        Integer sum = 0;
        for (Map.Entry entry : firstLevelMap.entrySet()) {
            Map<String, Integer> secondLevelMap = (Map<String, Integer>) entry.getValue();
            for (Map.Entry innerEntry : secondLevelMap.entrySet()) {
                if (innerEntry.getKey().equals(neededKey)) {
                    sum += (Integer) innerEntry.getValue();
                }
            }
        }
        System.out.println("Total this day sum = " + sum);
        return sum;
    }

    public static Map<String, Map<String, Map<String, Integer>>> getMapEntriesForLastTwoDays(Map<String, Map<String, Map<String, Integer>>> inputMap) {
        Set<String> dates = inputMap.keySet();
        Map<String, Map<String, Map<String, Integer>>> twoLastDaysMap = new HashMap<>();
        String keyA = findTwoLastDates(dates)[0];
        String keyB = findTwoLastDates(dates)[1];
        Map<String, Map<String, Integer>> entityLastDate = inputMap.get(keyA);
        Map<String, Map<String, Integer>> entityPreLastDate = inputMap.get(keyB);

        twoLastDaysMap.put(keyA, entityLastDate);
        twoLastDaysMap.put(keyB, entityPreLastDate);

        return twoLastDaysMap;
    }

    public static String[] findTwoLastDates(Set<String> dates) {
        List<String> sortedDatesList = new ArrayList<>(dates);
        Collections.sort(sortedDatesList);
        String[] twoLastDatesArr = new String[2];
        twoLastDatesArr[0] = sortedDatesList.get(sortedDatesList.size() - 1);
        twoLastDatesArr[1] = sortedDatesList.get(sortedDatesList.size() - 2);
        return twoLastDatesArr;
    }
}
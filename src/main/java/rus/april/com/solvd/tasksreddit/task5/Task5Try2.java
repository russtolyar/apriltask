package rus.april.com.solvd.tasksreddit.task5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class Task5Try2 {
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
        int numberOfLastDays = 2;
        Map<String, Map<String, Map<String, Integer>>> test1 = Map.ofEntries(
                entry("2021-12-23", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 111902), entry("pageviews", 221081))), entry("android", Map.ofEntries(entry("uniques", 298063), entry("pageviews", 1153728))), entry("old reddit", Map.ofEntries(entry("uniques", 132801), entry("pageviews", 723509))), entry("ios", Map.ofEntries(entry("uniques", 311642), entry("pageviews", 755030))), entry("mobile web", Map.ofEntries(entry("uniques", 130288), entry("pageviews", 219457))))),
                entry("2021-12-22", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 118371), entry("pageviews", 225093))), entry("android", Map.ofEntries(entry("uniques", 280199), entry("pageviews", 1291546))), entry("old reddit", Map.ofEntries(entry("uniques", 145437), entry("pageviews", 760191))), entry("ios", Map.ofEntries(entry("uniques", 257443), entry("pageviews", 575184))), entry("mobile web", Map.ofEntries(entry("uniques", 116411), entry("pageviews", 191464))))),
                entry("2021-12-21", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 175446), entry("pageviews", 300378))), entry("android", Map.ofEntries(entry("uniques", 331628), entry("pageviews", 1613490))), entry("old reddit", Map.ofEntries(entry("uniques", 164052), entry("pageviews", 830788))), entry("ios", Map.ofEntries(entry("uniques", 288464), entry("pageviews", 626490))), entry("mobile web", Map.ofEntries(entry("uniques", 111844), entry("pageviews", 193197))))),
                entry("2021-12-10", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 140548), entry("pageviews", 267522))), entry("android", Map.ofEntries(entry("uniques", 375491), entry("pageviews", 1336061))), entry("old reddit", Map.ofEntries(entry("uniques", 189477), entry("pageviews", 957462))), entry("ios", Map.ofEntries(entry("uniques", 418290), entry("pageviews", 985014))), entry("mobile web", Map.ofEntries(entry("uniques", 198403), entry("pageviews", 336195))))));
        System.out.println(getNumberOfViewers(test1, numberOfLastDays));
    }

    public static int getNumberOfViewers(Map<String, Map<String, Map<String, Integer>>> test1, int numberOfLastDays) {
        List<LocalDate> lastNeededDays = getTheNeededLastDays(test1, numberOfLastDays);
        int viewers = 0;
        for (Map.Entry<String, Map<String, Map<String, Integer>>> entityLevelOne : test1.entrySet()) {
            if (lastNeededDays.contains(LocalDate.parse(entityLevelOne.getKey()))) {
                for (Map.Entry<String, Map<String, Integer>> entityLevelTwo : entityLevelOne.getValue().entrySet()) {
                    for (Map.Entry<String, Integer> entityLevelThree : entityLevelTwo.getValue().entrySet()) {
                        if (entityLevelThree.getKey().equals("pageviews")) {
                            viewers += entityLevelThree.getValue();
                        }
                    }
                }
            }
        }
        return viewers;
    }

    public static List<LocalDate> getTheNeededLastDays(Map<String, Map<String, Map<String, Integer>>> test1,
                                                       int numberOfLastDays) {
        List<LocalDate> daysList = new ArrayList<>();
        for (Map.Entry<String, Map<String, Map<String, Integer>>> entryLayerOne : test1.entrySet()) {
            daysList.add(LocalDate.parse(entryLayerOne.getKey()));
        }
        if (daysList.size() > numberOfLastDays) {
            daysList.sort(Collections.reverseOrder());
            for (int i = daysList.size() - 1; i >= numberOfLastDays; i--) {
                daysList.remove(i);
            }
        }
        return daysList;
    }
}
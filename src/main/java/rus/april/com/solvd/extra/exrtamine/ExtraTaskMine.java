package rus.april.com.solvd.extra.extramine;

import java.util.Map;

public class ExtraTaskMine {

    /**
     * Calculate 'payment' & ‘ receive' for 'user_id ' (we can't know how many user_id can be. All info given in map
     * Map<String,Map<String,Integer>>
     * Info in map is like following:
     * {
     * {"trans_act_1" : [
     * {"user_id" : 1},
     * {"payment" : 300},
     * {"receive" : 200},
     * {"action" : 230}
     * ]
     * {"trans_act_2" : [
     * {"user_id" : 2},
     * {"payment" : 100},
     * {"receive" : 50},
     * {"action" : 0}
     * ]
     * {"trans_act_3" : [
     * {"user_id" : 1},
     * {"payment" : 222},
     * {"receive" : 232},
     * {"action" : 12}
     * ]
     * }
     */
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> actionMap =
                Map.ofEntries(Map.entry("trans_act_0", Map.ofEntries(
                        Map.entry("user_id", 1),
                        Map.entry("payment", 300),
                        Map.entry("receive", 200),
                        Map.entry("action", 23))),
                        Map.entry("trans_act_1", Map.ofEntries(
                                Map.entry("user_id", 3),
                                Map.entry("payment", 1000),
                                Map.entry("receive", 10),
                                Map.entry("action", 2))),
                        Map.entry("trans_act_2", Map.ofEntries(
                                Map.entry("user_id", 2),
                                Map.entry("payment", 10),
                                Map.entry("receive", 12),
                                Map.entry("action", 22))),
                        Map.entry("trans_act_3", Map.ofEntries(
                                Map.entry("user_id", 1),
                                Map.entry("payment", 100),
                                Map.entry("receive", 150),
                                Map.entry("action", 2))),
                        Map.entry("trans_act_4", Map.ofEntries(
                                Map.entry("user_id", 1),
                                Map.entry("payment", 0),
                                Map.entry("receive", 100),
                                Map.entry("action", 33))));

        System.out.println("Payments");
        countAllPayment(actionMap);
        System.out.print("Total number of users - ");
        System.out.print(maxUser(actionMap));
    }

    public static void countAllPayment(Map<String, Map<String, Integer>> inputMap) {
        int payment = 0;
        int maxU = maxUser(inputMap);
//        inputMap.entrySet().stream().map(e->e.getValue().get("user_id")==1);
        for (int i = 1; i <= maxU; i++) {
            for (Map.Entry<String, Map<String, Integer>> firstLevel : inputMap.entrySet()) {
                if (firstLevel.getValue().get("user_id") == i) {
                    payment += firstLevel.getValue().get("payment");
                }

            }
            System.out.println(payment + " - for user_id = " + i);
            payment = 0;
        }

        System.out.println();
    }

    public static int maxUser(Map<String, Map<String, Integer>> inputMap) {

        int maxU = 0;
        for (Map.Entry<String, Map<String, Integer>> firstLevel : inputMap.entrySet()) {
            if (firstLevel.getValue().get("user_id") > maxU) {
                maxU = firstLevel.getValue().get("user_id");
            }
        }
        return maxU;
    }
}
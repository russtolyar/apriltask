package rus.april.com.solvd.codewar.task4;

import java.util.ArrayList;

public class Code4_3 {
    public static void main(String[] args) {
        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(new int[] {10,0});
        stops.add(new int[] {3,5});
        stops.add(new int[] {2,5});
        System.out.println(countPassengers(stops));
    }
    public static int countPassengers(ArrayList<int[]> stops) {
        int res = 0;
        for(int[] onOff : stops) res += onOff[0] - onOff[1];
        return res;
    }
}
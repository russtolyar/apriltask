package rus.april.com.solvd.codewar.task4;

import java.util.ArrayList;

public class Code4_1 {
    /**
     * There is a bus moving in the city, and it takes and drop some people in each bus stop.
     *
     * You are provided with a list (or array) of integer pairs. Elements of each pair represent number
     * of people get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.
     *
     * Your task is to return number of people who are still in the bus after the last bus station
     * (after the last array). Even though it is the last bus stop, the bus is not empty and some people are still
     * in the bus, and they are probably sleeping there :D
     *
     * Take a look on the test cases.
     *
     * Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0.
     * So the return integer can't be negative.
     *
     * The second value in the first integer array is 0, since the bus is empty in the first bus stop.
     */
    public static void main(String[] args) {
        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(new int[] {10,0});
        stops.add(new int[] {3,5});
        stops.add(new int[] {2,5});
        System.out.println(countPassengers(stops));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int in = 0;
        int out = 0;
        for (int i = 0; i < stops.size(); i++){
            in += stops.get(i)[0];
            out += stops.get(i)[1];//Code here!
        }
        return in - out;

    }}
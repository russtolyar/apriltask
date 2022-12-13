package rus.april.com.solvd.tasksreddit.november;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T7_my_sobes {
    /**
     * choose the biggest number in array with the biggest sum of its digits
     * print the number and the sum of its digits in console
     * {2,12,34,52,88,16,135,4}
     */
    public static void main(String[] args) {
        int[] input = new int[]{2, 12, 34, 52, 88, 16, 135, 4};
        printOutput(solution(input));
    }

    public static void printOutput(int[] output) {
        Arrays.stream(output).forEach(System.out::println);
    }

    public static int[] solution(int[] input) {
        int[] output = new int[]{0, 0};
        for (int i = 0; i < input.length; i++) {
            if (input[i] > output[0] && sumDigits(input[i]) > output[1]) {
                output[0] = input[i];
                output[1] = sumDigits(input[i]);
            }
        }
        return output;
    }

    public static int sumDigits(int i) {
        List<Integer> output = new ArrayList<>();
        int sum = 0;
        int in = i;
        while (in != 0) {
            if (i / 10 == 0) {
                output.add(i);
                in = in / 10;

            } else {
                output.add(i % 10);
                in = in / 10;
            }
        }
        for (int inList : output) {
            sum += inList;
        }
        return sum;
    }

}
package rus.april.com.solvd.codewar.task6;

import java.util.ArrayList;
import java.util.List;

public class Code6_1 {
    /**
     * The number 89 is the first integer with more than one digit that fulfills the property partially introduced
     * in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.
     * <p>
     * In effect: 89 = 8^1 + 9^2
     * <p>
     * The next number in having this property is 135.
     * <p>
     * See this property again: 135 = 1^1 + 3^2 + 5^3
     * <p>
     * We need a function to collect these numbers, that may receive two integers a, b that defines the
     * range [a, b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property
     * described above.
     * <p>
     * Let's see some cases:
     * <p>
     * sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
     * <p>
     * sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
     * If there are no numbers of this kind in the range [a, b] the function should output an empty list.
     * <p>
     * sum_dig_pow(90, 100) == []
     * Enjoy it!!
     */
    public final static int countN = 1;

    public static void main(String[] args) {
        long a = 0;
        long b = 1000;

        System.out.println(sumDigPow(a, b));
    }


    public static List<Long> sumDigPow(long a, long b) {
        long[] arL = fillArr(a, b);
        long[] rez = cutIt(arL);
        List<Long> rezL = new ArrayList();
        for (int i = 0; i < rez.length; i++) {
            rezL.add(i, rez[i]);
        }
        return rezL;
    }

    public static long[] cutIt(long[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                count++;
            }
        }
        long[] cuted = new long[count];
        int index = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                cuted[index] = ar[i];
                if (index != count) {
                    index++;
                }
            }
        }
        return cuted;
    }

    public static long[] fillArr(long a, long b) {
        long[] arL = new long[(int) (b - a + 1)];
        for (int i = 0; i < arL.length; i++) {
            if (isIt(a + i)) {
                arL[i] = a + i;
            } else {
                arL[i] = 0;
            }
        }
        return arL;
    }

    public static boolean isIt(long a) {
        return a == numberCheck(a);
    }

    public static long numberCheck(long a) {
        int[] number = splitIt(a);
        long output = 0;
        for (int i = 0; i < number.length; i++) {
            output += Math.pow(number[i], i + 1);
        }
        return output;
    }

    public static int[] splitIt(long b) {
        long a = b;
        int count = getNumberDigits(a,countN);
        int[] output = new int[count];
        for (int i = 0; i < count; i++) {
            if (a / 10 >= 1) {
                output[count - i - 1] = (int) (a % 10);
                a = (a - a % 10) / 10;
                continue;
            }
            output[count - i - 1] = (int) a;
        }
        return output;
    }

    public static int getNumberDigits(long a, int countN) {
        int count = countN;
        long newA = a / 10;
        if (newA >= 1) {
            count++;
            return getNumberDigits(newA,count);
        }
        return countN;
    }

}
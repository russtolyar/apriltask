package rus.april.com.solvd.codewar.task2;

import java.util.TreeSet;

public class Code2_3 {
    private static final String SPACE = " ";
    public static String highAndLow(String numbers) {
        TreeSet<Integer> numberSet = new TreeSet<Integer>();
        String[] numberArr = numbers.split(SPACE);
        for(String numberVal: numberArr){
            numberSet.add(Integer.parseInt(numberVal));
        }
        return String.valueOf(numberSet.last()) + SPACE +String.valueOf(numberSet.first());

    }
}
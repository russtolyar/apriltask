package rus.april.com.solvd.codewar.task3;

import java.util.stream.IntStream;

public class Code3_4 {
    //    public class Sum {
    public static void main(String[] args) {
        System.out.println(getSum(-2,5));
    }
    public static int getSum(int a, int b) {
        int rez =  IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
        return rez;
    }
//    }
}

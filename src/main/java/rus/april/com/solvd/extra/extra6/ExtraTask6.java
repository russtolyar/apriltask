package rus.april.com.solvd.extra.extra6;

public class ExtraTask6 {
    /**
     * input: array 1, 2, 3, 4, 5.. 99, 100; And int 3, 5
     * If you can divide a number from array without remain you should replace that number with word
     * 3 - Fizz
     * 5 - Buzz
     * 3 and 5 - FizzBuzz
     * output: 1, 2, Fizz, 4, Buzz, Fizz..
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        printOutput(numbers);
    }

    public static void printOutput(int[] ints) {
        String f = "Fizz";
        String b = "Buzz";
        String fb = "FizzBuzz";
        for (int i : ints) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(fb + " ");
            } else if (i % 3 == 0) {
                System.out.print(f + " ");
            } else if (i % 5 == 0) {
                System.out.print(b + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
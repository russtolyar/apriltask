package rus.april.com.solvd.extra.november;

public class E6 {
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
        for(int el : ints){
            if (el % 3 == 0 && el % 5 == 0){
                System.out.print("FizzBuzz, ");
            }else if (el % 3 == 0){
                System.out.print("Fizz, ");
            }else if (el % 5 == 0){
                System.out.print("Buzz, ");
            }else {
                System.out.print(el + ", ");
            }
        }
    }

}
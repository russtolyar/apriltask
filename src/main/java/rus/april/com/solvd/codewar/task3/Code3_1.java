package rus.april.com.solvd.codewar.task3;

public class Code3_1 {
    /**
     * Given two integers a and b, which can be positive or negative,
     * find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.
     *
     * Note: a and b are not ordered!
     *
     * Examples (a, b) --> output (explanation)
     * (1, 0) --> 1 (1 + 0 = 1)
     * (1, 2) --> 3 (1 + 2 = 3)
     * (0, 1) --> 1 (0 + 1 = 1)
     * (1, 1) --> 1 (1 since both are same)
     * (-1, 0) --> -1 (-1 + 0 = -1)
     * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
     */
    public static void main(String[] args) {
        System.out.println(getSum(3, -2));
    }

    public static int getSum(int a, int b)
    {
        int result = 0;

        if(a == b){
            result = a;
            return result;
        } else if(a < b){
            for(int i = a; i <= b; i++){
                result += i;
            }
            return result;

        }else if(a > b){
            for (int i = b; i <= a; i++){
                result += i;
            }
            return result;
        }
        return result;
    }
}
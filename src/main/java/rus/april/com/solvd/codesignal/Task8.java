package rus.april.com.solvd.codesignal;

public class Task8 {
    /**
     * Given an array of strings, return another array containing all of its longest strings.
     * <p>
     * Example
     * <p>
     * For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
     * solution(inputArray) = ["aba", "vcd", "aba"].
     * <p>
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] array.string inputArray
     * <p>
     * A non-empty array.
     * <p>
     * Guaranteed constraints:
     * 1 ≤ inputArray.length ≤ 10,
     * 1 ≤ inputArray[i].length ≤ 10.
     * <p>
     * [output] array.string
     * <p>
     * Array of the longest strings, stored in the same order as in the inputArray.
     */
    public static void main(String[] args) {
        String[] i = {"aba", "aa", "ad", "vcd", "aba"};
        print(solution(i));

    }
    public static void print (String[]arr){
        for(String s : arr){
            System.out.println(s);
        }
    }
    public static String[] solution(String[] inputArray) {
        int longestStr = longetsStrLength(inputArray);
        int newArSize = numberOfLongestStr(inputArray);
        String[] outputArray = new String[newArSize];
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == longestStr) {
                outputArray[j] = inputArray[i];
                j++;
            }
        }
        return outputArray;
    }

    public static int numberOfLongestStr(String[] inputArray) {
        int longestStr = longetsStrLength(inputArray);
        int countS = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == longestStr) {
                countS++;
            }
        }
        return countS;
    }

    public static int longetsStrLength(String[] inputArray) {
        int maxSize = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > maxSize) {
                maxSize = inputArray[i].length();
            }
        }
        return maxSize;
    }
}
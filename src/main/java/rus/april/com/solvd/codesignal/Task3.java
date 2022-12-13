package rus.april.com.solvd.codesignal;

public class Task3 {
    /**
     * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
     *
     * Example
     *
     * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
     * solution(inputArray) = 21.
     *
     * 7 and 3 produce the largest product.
     */
    public static void main(String[] args) {
        int[] i = new int[]{3, 6, -2, -5, 7, 3};
        System.out.println(solution(i));
    }
    public  static int solution(int[] inputArray) {
        int max = inputArray[0] * inputArray[1] ;
        for (int i  = 0; i < inputArray.length - 1; i++){
            if(inputArray[i] * inputArray[i + 1] > max){
                max = inputArray[i] * inputArray[i + 1];
            }
        }
        return max;
    }

}
package rus.april.com.solvd.codewar.task2;

public class Code2 {
    /**
     * In this little assignment you are given a string of space separated numbers,
     * and have to return the highest and lowest number.
     * highAndLow("1 2 3 4 5")  // return "5 1"
     * highAndLow("1 2 -3 4 5") // return "5 -3"
     * highAndLow("1 9 3 4 -5") // return "9 -5"
     * Notes
     * All numbers are valid Int32, no need to validate them.
     * There will always be at least one number in the input string.
     * Output string must be two numbers separated by a single space, and highest number is first.
     */
    public static void main(String[] args) {
//        String s = "1 2 3 4 5";
//        String s = "1 9 3 4 -5";
        String s = "1 2 -3 4 25";

        System.out.println(highAndLow(s));
    }
    public static String highAndLow(String numbers) {
        int max;
        int min;
        String output = "";
//        String[] arNumbersS = numbers.replaceAll(" ","").split("");
        String[] arNumbersS = numbers.split(" ");
        int [] arNumbersI = new int[arNumbersS.length];
        for( int i = 0; i < arNumbersS.length; i++){
//            if(arNumbersS[i].equals("-")){
//                arNumbersS[i+1] = arNumbersS[i] + arNumbersS[i+1];
//                continue;
//            }
            arNumbersI[i] = Integer.parseInt(arNumbersS[i]);
        }
        max = arNumbersI[0];
        min = arNumbersI[0];

        for (int i = 0; i < arNumbersI.length; i++){

            if(arNumbersI[i] > max){
                max = arNumbersI[i];
            }
            if(arNumbersI[i] < min){
                min = arNumbersI[i];
            }
            output = String.format("%d %d",max,min);
        }

        return output;
    }
}
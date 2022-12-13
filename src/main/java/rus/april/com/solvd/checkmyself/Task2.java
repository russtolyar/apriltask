package rus.april.com.solvd.checkmyself;

public class Task2 {
    /**
     * given two strings , return true if they are palindromes.
     * I did in 2 different way, but they want the answer using hash, since the complexity is lower
     */
    public static void main(String[] args) {
        String one = "roman";
        String two = "namo";
        String four = "namors";

        System.out.println("areStringsPalindromes(one,two) = " + areStringsPalindromes(one, four));
        System.out.println("hashSolution(one,two) = " + hashSolution(one, four));

    }

    public static boolean areStringsPalindromes(String one, String two) {
        String[] arOne = one.split("");
        String[] arTwo = two.split("");
        String[] arTwoRev = reverseStringArray(arTwo);
        if(arOne.length != arTwo.length){
            return false;
        }
        for (int i = 0; i < arOne.length; i++){
            if(!arOne[i].equals(arTwoRev[i])){
                return false;
            }
        }

        return true;
    }
    public static boolean hashSolution(String one, String two){
        String[] arTwo = two.split("");
        String[] arTwoRev = reverseStringArray(arTwo);
        String twoS = "";
        for(int  i = 0; i < arTwo.length; i ++){
            twoS += arTwoRev[i];
        }
        return one.hashCode() == twoS.hashCode();
    }
    public static String [] reverseStringArray(String[] arr){
        int arHalveLength = arr.length % 2 == 0 ? arr.length / 2 : (arr.length - 1) / 2;
        String a = "";
        for( int i = 0; i < arHalveLength; i++){
            a = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = a;
        }
        return arr;
    }
}
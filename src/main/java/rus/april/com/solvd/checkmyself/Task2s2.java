package rus.april.com.solvd.checkmyself;

import java.util.Locale;

public class Task2s2 {
    /**
     * given two strings , return true if they are palindromes.
     * I did in 2 different way, but they want the answer using hash, since the complexity is lower
     */
    public static void main(String[] args) {
        String one = "mamas";
        String two = "samam";

        System.out.println("hashVerifyIfPalindroms(one,two) = " + hashVerifyIfPalindromes(one, two));
//        System.out.println("verifyIfPalindromes(one, two) = " + verifyIfPalindromes(one, two));
    }

    public static boolean hashVerifyIfPalindromes(String one, String two){
        String[] arrTwo = reverseString(two);
        String a = "";
        for(int i = 0; i < arrTwo.length; i ++){
            a +=arrTwo[i];
        }
        return one.hashCode()==a.hashCode();
    }

    public static boolean verifyIfPalindromes(String one, String two){
        String []arrOne = one.toLowerCase(Locale.ROOT).split("");
        String[] arrTwoRev = reverseString(two);
        if(arrOne.length != arrTwoRev.length){
            return false;
        }
        for(int i = 0; i < arrOne.length; i ++){
            if(!arrOne[i].equals(arrTwoRev[i])){
                return false;
            }
        }
        return  true;
    }
    public static String[] reverseString(String forReverce){
        String[]arrFR = forReverce.toLowerCase(Locale.ROOT).split("");
        int halveArrSize = arrFR.length % 2 ==0 ? arrFR.length / 2 : (arrFR.length - 1) / 2;
        String a = "";
        for(int i = 0; i < halveArrSize; i ++ ){
            a = arrFR[i];
            arrFR[i] = arrFR[arrFR.length - 1 - i];
            arrFR[arrFR.length - 1 - i] = a;
        }
//        for(int i = 0 ; i < arrFR.length; i ++){
//        System.out.println(arrFR[i]);}
        return arrFR;
    }
}
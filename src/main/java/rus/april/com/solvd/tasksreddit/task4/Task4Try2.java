package rus.april.com.solvd.tasksreddit.task4;

import java.util.Objects;

public class Task4Try2 {
    /**
     * given two strings , return true if they are palindromes.
     * I did in 2 different way, but they want the answer using hash, since the complexity is lower
     */
    public static void main(String[] args) {
        String one1 = "amor";
        String two = "roma";
        String zero = "roman";
        String mine = "ramo";
        System.out.println(checkStringsForPalindromes(one1, two));
        System.out.println("HASHES");
        System.out.println(checkWithHashForPalindromes(one1, two));
    }

    public static boolean checkStringsForPalindromes(String one, String two) {
        String[] oneAr = one.split("");
        String[] twoAr = two.split("");
        if (oneAr.length != twoAr.length) {
            return false;
        }
        for (int i = 0; i < oneAr.length; i++) {
            if (!oneAr[i].equals(twoAr[oneAr.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkWithHashForPalindromes(String one, String two) {

        return one.hashCode() == reverseSecondString(two).hashCode();
//        Objects.hash(one,);
    }

    public static String reverseSecondString(String two) {
        String[] arrTwo = two.split("");
        String var;
        String out = "";
        int halfWord = arrTwo.length % 2 == 0 ? arrTwo.length / 2 : (arrTwo.length - 1) / 2;
        for (int i = 0; i < halfWord; i++) {
            var = arrTwo[i];
            arrTwo[i] = arrTwo[arrTwo.length - 1 - i];
            arrTwo[arrTwo.length - 1 - i] = var;
        }
        for (int i = 0; i < arrTwo.length; i++) {
            out = out.concat(arrTwo[i]);
        }
        return out;
    }
}
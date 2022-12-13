package rus.april.com.solvd.extra.november;

import java.util.Arrays;
import java.util.Locale;

public class E2 {
    public static void main(String[]args){
        String one = "eat";
        String two = "tea";
        String three = "eatt";
        String four = "teat";
        String zero = "ea";

        System.out.println(areStringsAnagrams(one, three));
    }
    public static boolean areStringsAnagrams(String a, String b){
        if (a.length() != b.length())return false;

        String[] aAr = a.toLowerCase(Locale.ROOT).split("");
        String[] bAr = b.toLowerCase(Locale.ROOT).split("");
        Arrays.sort(aAr);
        Arrays.sort(bAr);

        for (int i = 0; i< aAr.length;i++){
            if(!aAr[i].equals(bAr[i])) return false;
        }
        return true;
    }
}
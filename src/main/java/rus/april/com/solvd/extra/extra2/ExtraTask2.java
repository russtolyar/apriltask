package rus.april.com.solvd.extra.extra2;

import java.util.Arrays;

public class ExtraTask2 {
    /**
     * Are these strings anagrams:
     *              eat, tea
     * Check time consumption
     * Are these  strings anagrams:
     *              eatt, teat
     */
    public static void main(String[]args){
        String one = "eat";
        String two = "tea";
        String three = "eatt";
        String four = "teat";
        String zero = "ea";

        System.out.println(areStringsAnagrams(four, zero));
    }
    public static boolean areStringsAnagrams(String a, String b){
        boolean anagrams;
        if(a.length() != b.length()){
            return false;
        }
        String [] aA = a.split("");
        String [] bA = b.split("");
        Arrays.sort(aA);
        Arrays.sort(bA);
        for (int i = 0; i < aA.length; i++){
            if(!aA[i].equals(bA[i])){
                return false;
            }
        }
        return true;
    }
}
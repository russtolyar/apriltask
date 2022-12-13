package rus.april.com.solvd.tasksreddit.november;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class T4 {
    /**
     * given two strings , return true if they are palindromes.
     * I did in 2 different way, but they want the answer using hash, since the complexity is lower
     */

    public static final String regExSplit = "";
    static String one = "mama";
    static String two = "amam";
//    static String two = "mmaa";

    public static void main(String[] args) {
        System.out.println(String.format("stringsArePalindromes(%s,%s) = ",one,two) + stringsArePalindromes(one, two));
        System.out.println();
        System.out.println(String.format("stringsArePalindromesNoHashes(%s,%s) = ",one,two) + stringsArePalindromesNoHashes(one, two));
    }

    public static String reverseStr(String str){
        char[] charStr = str.toCharArray();
        String newStr = "";
        int strHalf = str.length() % 2 == 0 ? str.length() / 2 : (str.length() - 1) / 2;
        for (int i = 0 ; i < strHalf; i ++){
            char var = charStr[i];
            charStr[i] = charStr[charStr.length - i - 1];
            charStr[charStr.length - i - 1] = var;
        }
        for (char c : charStr){
            newStr += c;
        }
        return newStr;
    }

    public static boolean stringsArePalindromes(String s1, String s2){
        return s1.hashCode()==reverseStr(s2).hashCode();
    }

    public static boolean stringsArePalindromesNoHashes(String s1, String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        List<String>s1Ar = Arrays.stream(s1.toLowerCase(Locale.ROOT).split("")).sorted().collect(Collectors.toList());
        List<String>s2Ar = Arrays.stream(s2.toLowerCase(Locale.ROOT).split("")).sorted().collect(Collectors.toList());
        if(!s1Ar.equals(s2Ar)){
            return false;
        }
        String[]s1Arr = s1.toLowerCase(Locale.ROOT).split("");
        String[]s2Arr = reverseStr(s2).toLowerCase(Locale.ROOT).split("");
        for (int i = 0 ; i < s1.length(); i++) {
            if(!s1Arr[i].equals(s2Arr[i])){
                return false;
            }
        }
        return true;
    }

}
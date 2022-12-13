package rus.april.com.solvd.tasksreddit.task4;

import java.util.Objects;

public class Main {
    /**
     * given two strings , return true if they are palindromes.
     * I did in 2 different way, but they want the answer using hash, since the complexity is lower
     */

    public static final String regExSplit = "";
    static String one = "asdh";
    static String two = "hdsa";

    public static void main(String[] args) {
        System.out.println(Objects.hash("mama") == Objects.hash("Mama"));
//        System.out.println("\n\nValidation two strings for palindrome with hash codes\n");
//        hashesValidation(one, stringInversion(two));
//
//        System.out.println("\n\nValidation two strings (as arrays) for palindrome\n");
//        stringsValidationForBeingPalidroms(one, two);

//        System.out.println("\n\nValidation just string for being palindrome\n");
//        validateString(one);

    }

    public static String stringInversion(String stringForInver) {
        String[] inputArray = stringForInver.split("");
        String output = "";
        String x;
        int halve = inputArray.length % 2 == 0 ? inputArray.length / 2 : (inputArray.length - 1) / 2;
        for (int i = 0; i < halve; i++) {
            x = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 - i];
            inputArray[inputArray.length - 1 - i] = x;
        }
        for (int i = 0; i < inputArray.length; i++) {
            output += inputArray[i];
        }
        String s = String.format("after inversion '%s' become '%s'", stringForInver, output);
        System.out.println(s);
        return output;
    }

    public static boolean stringsValidationForBeingPalidroms(String play, String reverse) {
        String newReverse = stringInversion(reverse);
        String[] playArr = play.split("");
        String[] newReverseArr = newReverse.split("");
        boolean palidroms = false;
        if (playArr.length != newReverseArr.length) {
            System.out.println(palidroms);
            return palidroms;
        } else {
            for (int i = 0; i < playArr.length; i++) {
                if (!playArr[i].equals(newReverseArr[i]) ){
                    System.out.println(palidroms);
                    return palidroms = false;
                } else {
                    palidroms = true;
                }
            }
        }
        System.out.println(palidroms);
        return palidroms;
    }


    public static boolean hashesValidation(String one, String two) {
        boolean result = one.hashCode() == two.hashCode();
        String s = String.format("These strings '%s' and '%s'  are palidroms  - '%s'", one, two, result);
        System.out.println(s);
        return result;
    }

    public static boolean twoStringsValidation(String one, String two) {
        String[] oneStringArray = one.split(regExSplit);
        String[] twoStringArray = two.split(regExSplit);
        return false;


    }

    public static boolean validateString(String input) {
        String[] stringArray = input.split(regExSplit);
        int halve = stringArray.length % 2 == 0 ? stringArray.length / 2 : (stringArray.length - 1) / 2;
        boolean palindrome = false;
        for (int i = 0; i < halve; i++) {
            if (stringArray[i].equals(stringArray[stringArray.length - 1 - i])) {
                palindrome = true;
            } else {
                palindrome = false;
            }
        }
        String s = String.format("This word '%s'  is palidrome - '%s", input, palindrome);
        System.out.println(s);
        return palindrome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return Objects.equals(one, main.one) && Objects.equals(two, main.two);
    }

    @Override
    public int hashCode() {
        return Objects.hash(one, two);
    }
}
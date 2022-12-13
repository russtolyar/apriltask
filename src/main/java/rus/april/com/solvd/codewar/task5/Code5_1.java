package rus.april.com.solvd.codewar.task5;

public class Code5_1 {
    /**
     * Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument
     * (also a string).
     * <p>
     * Examples:
     * <p>
     * solution('abc', 'bc') // returns true
     * solution('abc', 'd') // returns false
     */
    public static void main(String[] args) {
//        check("samurai", "ai", true);
//        check("sumo", "omo", false);
//        check("ninja", "ja", true);
//        check("sensei", "i", true);
//        check("samurai", "ra", false);
//        check("abc", "abcd", false);
//        check("abc", "abc", true);
//        check("abcabc", "bc", true);
//        check("ails", "fails", false);
//        check("fails", "ails", true);
//        check("this", "fails", false);
//        check("this", "", true);
//        check(":-)", ":-(", false);
//        check("!@#$%^&*() :-)", ":-)", true);
//        check("abc\n", "abc", false);
        System.out.println(solution("!@#$%^&*() :-)", ""));
    }

    public static boolean solution(String str, String ending) {
        if (!str.contains(ending)) {
            return false;
        }
        if (ending.isEmpty()) {
            return true;
        } else {
            String[] arS = str.split("");
            String[] arE = ending.split("");

            for (int i = 0; i < arE.length; i++) {
                if (arE[arE.length - 1 - i].equals(arS[arS.length - 1 - i])) {
                    continue;
                } else {
                    return false;
                }

            }
        }
        return true;
    }
}
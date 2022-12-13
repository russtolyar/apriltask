package rus.april.com.solvd.checkmyself;

public class Task3 {
    /**
     * Given this input: "3[asdf]" you have to generate an output string: asdfasdfasdf
     * # Q1
     * ## input => "3[asdf]"
     * ## output => "asdfasdfasdf"
     * # Q2
     * ## input => "3[a]4[b]"
     * ## output => "aaabbbb"
     * # Q3
     * ## input => "3[a2[b]]"
     * ## interim output => "3[abb]"
     * ## output => "abbabbabb" (edited)
     */

    public static void main(String[] args) {
        String one = "3[asdf]";
        String two = "3[a]4[b]";
        String four = "3[a2[b]]";

        System.out.println("getSolution(one) = " + getSolution(two));

    }

    public static String getSolution(String s) {
        String[] arS = s.split("");
        int multiply = 0;
        String digitString = "";
        String beforeBrackets = "";
        String rez = s;
        for (int i = 0; i < arS.length; i++) {
            if (arS[i].matches("[0-9]")) {
                digitString += arS[i];
            } else {
                if (!digitString.isEmpty()) {
                    multiply = Integer.parseInt(digitString);
                }
                if (arS[i].equals("[")) {
                    int closeBracket = getIndexCloseBracket(s);
                    String betweenBrackets = s.substring(i + 1, closeBracket);
                    String newS = beforeBrackets + multiplyStr(betweenBrackets, multiply) + s.substring(closeBracket + 1);
                    rez = getSolution(newS);
                    return rez;
                } else if (arS[i].equals("]")) {
                    // ok
                } else {
                    beforeBrackets += arS[i];
                }
            }
        }
        return rez;
    }

    public static String multiplyStr(String s, int n) {
        String rez = s;
        for (int i = 1; i < n; i++) {
            rez += rez;
        }
        return rez;
    }

    public static int getIndexCloseBracket(String s) {
        String[] arS = s.split("");
        int openB = 0;
        int closeB = 0;
        for (int i = 0; i < arS.length; i++) {
            if (arS[i].equals("[")) {
                openB++;
            }
            if (arS[i].equals("]")) {
                closeB++;
            } else {
                continue;
            }
            if (closeB == openB) {

                return i;
            }
        }
        System.out.println("incorrect brackets");
        return 0;
    }
}
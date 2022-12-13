package rus.april.com.solvd.checkmyself;

public class Task3s3 {
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
        String nine = "htr3[a0[cv]]";

        System.out.println("getSolution(one) = " + getSolution(nine));
    }

    public static boolean verifyOnlyLetters(String[] arr) {
        boolean only = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("[") || arr[i].equals("]")) {
                only = false;
                break;
            }
        }
        return only;
    }

    public static String getSolution(String str) {
        String result = str;

        String[] arStr = str.split("");
        if (!verifyOnlyLetters(arStr)) {

            int multiplier = 0;
            String digitMult = "";
            String beforeBr = "";
            String betweenBr = "";
            for (int i = 0; i < arStr.length; i++) {
                if (arStr[i].matches("[0-9]")) {
                    digitMult += arStr[i];
                } else {
                    if (!digitMult.isEmpty()) {
                        multiplier = Integer.parseInt(digitMult);
                    }
                    if (arStr[i].equals("[")) {
                        int closeBr = getIndexOfCloseBracket(result);
                        betweenBr = result.substring(i + 1, closeBr);
                        String freshS = beforeBr + getMultiplied(betweenBr, multiplier) + result.substring(closeBr + 1);
                        if(verifyOnlyLetters(freshS.split(""))){
                            return freshS;

                        }else {
                            result = getSolution(freshS);
                            if (verifyOnlyLetters(result.split(""))){
                                return result;}
                        }
                    }
                    if (arStr[i].equals("]")) {
                        // do nothing
                    } else {
                        beforeBr += arStr[i];
                    }
                }
            }
        }
        return result;

    }

    public static String getMultiplied(String str, int n) {
        if(n==0){
            return "";
        }
        String rez = str;
        for (int i = 1; i < n; i++) {
            rez += str;
        }
        return rez;
    }

    public static int getIndexOfCloseBracket(String str) {
        String[] arrStr = str.split("");
        int openB = 0;
        int closeB = 0;
        for (int i = 0; i < arrStr.length; i++) {
            if (!arrStr[i].equals("[") && !arrStr[i].equals("]")) {
                continue;
            } else {
                if (arrStr[i].equals("[")) {
                    openB++;
                } else {
                    closeB++;
                }
            }
            if (openB == closeB && openB != 0) {
                return i;
            }
        }
        System.out.println("incorrect bracket quantity");
        return 0;
    }
}
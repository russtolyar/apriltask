package rus.april.com.solvd.checkmyself;

public class Task7 {
    /**
     * String input = "[(]{)}()"
     * проверить на правильную скобочную последовательность
     */

    public static void main(String[] args) {
//        String input = "[(]{)}()";
        String input = "[]{}()";

        System.out.println(solution(input));

    }

    public static boolean solution(String st) {
        String[] arS = st.split("");
        if (st.length() % 2 != 0) {
            return false;
        }
        int countS = 0;
        int countR = 0;
        int countF = 0;
        String bS1 = "[";
        String bS2 = "]";
        String bR1 = "(";
        String bR2 = ")";
        String bF1 = "{";
        String bF2 = "}";
        boolean s = false;
        boolean r = false;
        boolean f = false;

        for (int i = 0; i < arS.length; i++) {
            if (arS[i].equals(bS1)) {
                countS++;
                s = true;
                continue;
            }
            if (arS[i].equals(bS2)) {
                countS--;
                s = false;
                if (r == true || f == true) {
                    return false;
                }
                continue;
            }
            if (arS[i].equals(bR1)) {
                countR++;
                r = true;
                continue;
            }
            if (arS[i].equals(bR2)) {
                countR--;
                r = false;
                if (s == true || f == true) {
                    return false;
                }
                continue;
            }
            if (arS[i].equals(bF1)) {
                countF++;
                f = true;
                continue;
            }
            if (arS[i].equals(bF2)) {
                countF--;
                f = false;
                if (r == true || s == true) {
                    return false;
                }
                continue;
            }
            if (countF != 0 || countR != 0 || countS != 0) {
                return false;
            }
        }
        return true;
    }
}
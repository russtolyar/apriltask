package rus.april.com.solvd.tasksreddit.november;

public class T3 {
    public static void main(String args[]) {
//        String a = "[asdf][qwerty]3[z]";
//        String b = "3[a]4[b]";
        String c = "3[a2[b]]";
//        String d = "x2[a3[b]2[c]]y4[d]";

//        System.out.println(asdf(a));
//        System.out.println(asdf(b));
        System.out.println(asdf(c));
//        System.out.println(asdf(d));


    }

    static String asdf(String str) {
        char[] charInput = str.toCharArray();
        int multip = 0;
        String digit = "";
        String beforeStr = "";
        String rez = str;
        for (int i = 0; i < charInput.length; i++) {
            if (Character.isDigit(charInput[i])) {
                digit += charInput[i];
            } else {
                if (digit.length() > 0) {
                    multip = Integer.parseInt(digit);

                }
                if (charInput[i] == '[') {
                    int closeBrascet = findCloseBrasketIndex(str);
                    String betweenBrs = str.substring(i + 1, closeBrascet);
                    String afterBrs = str.substring(closeBrascet + 1);
                    rez = beforeStr + multiedStr(multip, betweenBrs) + afterBrs;
                    return asdf(rez);
                }
                if (charInput[i] == ']') {
                    continue;
                } else {
                    beforeStr += charInput[i];
                }}
        }
        return rez;

    }

    public static int findCloseBrasketIndex (String st){
        char[] chSt = st.toCharArray();
        int op = 0;
        int cl = 0;
        for (int i = 0; i < st.length(); i++) {
            if (chSt[i] == '[') {
                op++;
            }
            if (chSt[i] == ']') {
                cl++;
            }
            if (op == cl && op > 0) {
                return i;
            }
        }
        return 0;
    }

    public static String multiedStr ( int mult, String st){
        return st.repeat(mult);
    }
}
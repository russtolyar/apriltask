package rus.april.com.solvd.tasksreddit.task3;

public class Task3AP {


    public static void main(String args[]) {
        String a = "[asdf][qwerty]3[z]";
        String b = "3[a]4[b]";
        String c = "3[a2[b]]";
        String d = "x2[a3[b]2[c]]y4[d]";
        System.out.println(asdf(a));
        System.out.println(asdf(b));
        System.out.println(asdf(c));
        System.out.println(asdf(d));
    }
    static String asdf(String pattern) {
        char[] patternInChars = pattern.toCharArray();
        int multiplier = 0;
        String digitString = "";
        String beforeBrackets = "";
        String result = pattern;
        for (int i = 0; i < patternInChars.length; i++) {
            if (Character.isDigit(patternInChars[i])) {
                digitString += patternInChars[i];
            } else {
                if(digitString.length() != 0) {
                    multiplier = Integer.parseInt(digitString);
                }
                if('[' == patternInChars[i]) {
                    int indexOfCloseBracket = getIndexOfCloseBracket(pattern);
                    String betweenBrackets = pattern.substring(i + 1 , indexOfCloseBracket);
                    String newPattern = beforeBrackets + multiplyString(betweenBrackets, multiplier) + pattern.substring(indexOfCloseBracket + 1);
                    result = asdf(newPattern);
                    return result;
                } else if(']' == patternInChars[i]) {
                    //nothing
                } else {
                    beforeBrackets += patternInChars[i];
                }
            }
        }
        return result;
    }
    static int getIndexOfCloseBracket(String string) {
        int openBracketCount = 0;
        int closeBracketCount = 0;
        char[] chars = string.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if (']' == (chars[i])) {
                closeBracketCount++;
            } else if('[' == chars[i]) {
                openBracketCount++;
            } else {
                continue;
            }
            if((openBracketCount - closeBracketCount) == 0) {
                return i;
            }
        }
        return -1;
    }
    static String multiplyString(String string, int multiplier) {
        String result = string;
        for(int i = 1; i < multiplier; i++) {
            result += string;
        }
        return result;
    }

}
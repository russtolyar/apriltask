package rus.april.com.solvd.tasksreddit.task3;

public class Main {

    public static final String regEx = "[^a-z]";
    public static final String regExNumber = "[^0-9]";
    public static final String regExSplit = "";

    /**
     * String processing
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
        System.out.println("\nQ1");
        q1TaskReturn("3[asdf]");
        System.out.println("\nQ2");
        q2TaskReturn("3[a]4[b]");
        System.out.println("\nQ3");
        q3TaskReturn("3[a2[b]]");
    }

    public static int[] getNumbers(String input) {
        String numberS = input.replaceAll(regExNumber, "");
        String[] numbArr = numberS.split(regExSplit);
        int[] numbersInt = new int[numbArr.length];
        for (int i = 0; i < numbArr.length; i++) {
            numbersInt[i] = Integer.parseInt(numbArr[i]);
        }
        return numbersInt;
    }

    public static String q1TaskReturn(String input) {
        int first = getNumbers(input)[0];
        String output = "";
        String result = input.replaceAll(regEx, "");
        String[] spliterX = result.split(regExSplit);
        for (int one = 0; one < first; one++) {

            for (int i = 0; i < spliterX.length; i++) {
                output += spliterX[i];
                System.out.print(spliterX[i]);
            }
        }
        return output;
    }

    public static String q2TaskReturn(String input) {
        int first = getNumbers(input)[0];
        int second = getNumbers(input)[1];

        String output = "";
        String result = input.replaceAll(regEx, "");
        String[] spliterX = result.split(regExSplit);
        for (int i = 0; i < spliterX.length; i++) {
            if (i == 0) {
                for (int one = 0; one < first; one++) {
                    output += spliterX[i];
                    System.out.print(spliterX[i]);
                }
            } else {
                for (int two = 0; two < second; two++) {
                    output += spliterX[i];
                    System.out.print(spliterX[i]);
                }
            }
        }
        return output;
    }

    public static String q3TaskReturn(String input) {
        int first = getNumbers(input)[0];
        int second = getNumbers(input)[1];

        String output = "";
        String result = input.replaceAll(regEx, "");
        String[] spliterX = result.split(regExSplit);

        for (int j = 0; j < first; j++) {
            for (int i = 0; i < spliterX.length; i++) {
                if (i == 0) {
                    for (int one = 0; one < second; one++) {
                        output += spliterX[i];
                        System.out.print(spliterX[i]);
                    }
                } else {
                    for (int two = 0; two < 2; two++) {
                        output += spliterX[i];
                        System.out.print(spliterX[i]);
                    }
                }
            }
        }
        return output;
    }


}
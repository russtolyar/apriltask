package rus.april.com.solvd.tasksreddit.task3;

public class Task3Try2 {

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
        String one = "3[asdf]";
        String two = "7[a]4[b]";
        String zero = "3[a5[b]]";
        String mine = "2[a2[b]cd]";
        findResult(mine);

    }

    public static void findResult(String input) {
        String print = String.format("\nFor input = '%s', output is :",input);
        System.out.println(print);
        int[] numbers = getTheNumbers(input);
        int[] bracketsIndexes = getTheIndexesOfStringsBlocksBorders(input);
        String[] stringsBlocks = getTheStringsBlocks(input);
        String[] inputStringArray = input.split("");
        if (bracketsIndexes.length == 2) {
            for (int j = 0; j < numbers[0]; j++) {
                for (int s = 0; s < stringsBlocks.length; s++) {
                    System.out.print(stringsBlocks[s]);
                }
            }
        }
        if (bracketsIndexes.length == 4) {
            if (inputStringArray[bracketsIndexes[0]].equals(inputStringArray[bracketsIndexes[2]])) {
                for (int j = 0; j < numbers[0]; j++) {
                    for (int i = bracketsIndexes[0] + 1; i < bracketsIndexes[1]; i++) {
                        System.out.print(inputStringArray[i]);
                    }
                }
                for (int j = 0; j < numbers[1]; j++) {
                    for (int i = bracketsIndexes[2] + 1; i < bracketsIndexes[3]; i++) {
                        System.out.print(inputStringArray[i]);
                    }
                }
            }
            if (inputStringArray[bracketsIndexes[0]].equals(inputStringArray[bracketsIndexes[1]])) {
                for (int j = 0; j < numbers[0]; j++) {
                    for (int i = bracketsIndexes[0] + 1; i < bracketsIndexes[3]; i++) {
                        if (i < bracketsIndexes[1] - 1 || i > bracketsIndexes[2]) {

                            System.out.print(inputStringArray[i]);
                        }
                        if (i > bracketsIndexes[1] && i < bracketsIndexes[2]) {
                            for (int f = 0; f < numbers[1]; f++) {
                                System.out.print(inputStringArray[i]);
                            }
                        }
                    }
                }
            }
        }
    }

    public static int[] getTheNumbers(String input) {
        String inputNumbersS = input.replaceAll("[^0-9]", "");
        String[] inputStrings = inputNumbersS.split("");
        int[] inputInt = new int[inputNumbersS.length()];
        for (int i = 0; i < inputNumbersS.length(); i++) {
            inputInt[i] = Integer.parseInt(inputStrings[i]);
        }
        return inputInt;
    }

    public static int[] getTheIndexesOfStringsBlocksBorders(String input) {
        String start = "[";
        String finish = "]";
        int index = 0;
        String[] inputStrings = input.split("");
        String[] justBracketsArray = input.replaceAll("\\w", "").split("");
        int[] indexesOfBrackets = new int[justBracketsArray.length];

        for (int i = 0; i < input.length(); i++) {
            if (inputStrings[i].equals(start) || inputStrings[i].equals(finish)) {
                indexesOfBrackets[index] = i;
                index++;
            }
        }
        return indexesOfBrackets;
    }

    public static String[] getTheStringsBlocks(String input) {
        String inputStrings = input.replaceAll("[\\W,\\d]", "");
        return inputStrings.split("");
    }
}
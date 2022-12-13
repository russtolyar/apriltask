package rus.april.com.solvd.tasksreddit.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3MG {
    public static void main(String[] args) {
        String one = "jj2[2[a2[A]sdf]ad]ll";
        String two = "jj3[a]4[b]";
        String zero = "3[a2[b]]";
        String mine = "2[a2[3b]cd]";

        findResult(one);
//        findResult(two);
//        findResult(zero);
//        findResult(mine);

    }

    public static void findResult(String input) {
        String regexStr = "\\[[a-zA-Z]*\\]";
        String regexNumber = "(\\d)*\\[[a-zA-Z]*\\]";

        Pattern pattern = Pattern.compile(regexStr);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            Pattern patternNumber = Pattern.compile(regexNumber);
            Matcher matcherNumber = patternNumber.matcher(input);
            String repeatedString = matcher.group().replaceAll("\\W", "");
            matcherNumber.find();
            Integer repeatNumber = Integer.parseInt(matcherNumber.group().replaceAll(regexStr, ""));
            String repeatedSomeTimesString = repeatedString.repeat(repeatNumber);
            input = input.replaceAll(regexNumber, repeatedSomeTimesString);
            matcher = pattern.matcher(input);
        }
        System.out.println(" Needed string: " + input);
    }
//}
}
package rus.april.com.solvd.codewar.task5;

public class Code5_2 {
    public static void main(String[] args) {
        System.out.println(solution("!@#$%^&*() :-)", "f"));

    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
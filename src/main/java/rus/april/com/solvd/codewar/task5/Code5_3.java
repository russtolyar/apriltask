package rus.april.com.solvd.codewar.task5;

public class Code5_3 {
    public static void main(String[] args) {
        System.out.println(solution("!@#$%^&*() :-)", ")"));

    }
    public static boolean solution(String str, String ending) {
        if(str.length() < ending.length()) {
            return false;
        }
        else {
            return str.substring(str.length() - ending.length()).equals(ending);
        }
    }
}
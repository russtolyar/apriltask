package rus.april.com.solvd.codesignal;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(solution(1999));
    }

    public static int solution(int year) {
        if (year < 101) {
            return 1;
        } else if (year > 100 && year < 2101) {
            if (year % 100 == 0) {
                year--;
            }
            return (year - (year % 100)) / 100 +1;
        }
        return 0;
    }
}
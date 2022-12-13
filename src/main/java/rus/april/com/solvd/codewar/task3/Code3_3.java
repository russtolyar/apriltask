package rus.april.com.solvd.codewar.task3;

public class Code3_3 {

    public class Sum
    {
        public int GetSum(int a, int b) {
            int res = 0;
            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                res += i;
            }
            return a == b ? a : res;
        }
    }
}
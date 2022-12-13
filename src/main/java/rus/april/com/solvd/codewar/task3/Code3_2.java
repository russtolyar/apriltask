package rus.april.com.solvd.codewar.task3;

public class Code3_2 {
    public class Sum
    {
        public int GetSum(int a, int b)
        {
            return (a + b) * (Math.abs(a - b) + 1) / 2;
        }
    }
}
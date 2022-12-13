package rus.april.com.solvd.codewar.task3;

public class Code3_5 {
    public class Sum
    {
        public int GetSum(int smaller, int bigger)
        {
            if(bigger<smaller) {
                return GetSum(bigger,smaller);
            }
            else
            {
          /* use Euler's formula to sum up all numbers from 0 to bigger
          /  and subtract the sum of numbers from 0 to smaller (exclusive)
          */
                return (bigger+smaller)*(bigger-smaller+1)/2;
            }
        }
    }
}
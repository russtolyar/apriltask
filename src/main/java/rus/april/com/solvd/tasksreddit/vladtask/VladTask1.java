package rus.april.com.solvd.tasksreddit.vladtask;

public class VladTask1 {
    /**
     * input n (int)
     * find out the number of squares in star made of this
     */
    public static void main(String[] args) {
        System.out.println(numberOfSquares(2));
    }

    public static int numberOfSquares(int n) {
        double sum = Math.pow((double) n,2.0) + Math.pow((double) (n-1),2.0);
        return (int) sum;
    }
}
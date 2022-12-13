package rus.april.com.solvd.codesignal;

public class Task6 {
    /**
     * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing
     * sequence by removing no more than one element from the array.
     * <p>
     * Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an.
     * Sequence containing only one element is also considered to be strictly increasing.
     * <p>
     * Example
     * <p>
     * For sequence = [1, 3, 2, 1], the output should be
     * solution(sequence) = false.
     * <p>
     * There is no one element in this array that can be removed in order to get a strictly increasing sequence.
     * <p>
     * For sequence = [1, 3, 2], the output should be
     * solution(sequence) = true.
     * <p>
     * You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately,
     * you can remove 2 to get the strictly increasing sequence [1, 3].
     */
    public static void main(String[] args) {
//        int[] i = new int[]{1, 3, 2, 4, 5, 6};
        int[] i = new int[]{1000, 1000, 2000, 3000, 4000, 5000, 5000};
        System.out.println(solution(i));
    }

    public static boolean solution(int[] sequence) {
        boolean ok = false;
        int count;
        for (int j = 0; j < sequence.length; j++) {
            count = 0;
            int[] sequence1 = new int[sequence.length - 1];
            for (int k = 0; k < j; k++) {
                sequence1[k] = sequence[k];
            }
            for (int k = j; k < sequence1.length; k++) {
                sequence1[k] = sequence[k + 1];
            }

            for (int i = 0; i < sequence1.length - 1; i++) {
                if (sequence1[i] < sequence1[i + 1]) {
                    count++;
                }
            }

            if (count == sequence.length - 2) {
                ok = true;
                return ok;
            }
        }
        return ok;
    }
}
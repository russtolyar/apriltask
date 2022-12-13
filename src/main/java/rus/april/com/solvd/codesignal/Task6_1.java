package rus.april.com.solvd.codesignal;

public class Task6_1 {

    public static void main(String[] args) {
//        int[] i = new int[]{1, 3, 2, 4, 5, 6};
        int[] i = new int[]{1000, 1000, 2000, 3000, 4000, 5000, 5000};
        System.out.println(solution(i));
    }
//    public  static boolean solution(int[] sequence) {
//        boolean flag=true;
//        int seq1=0;
//        int seq2=0;
//        for(int i=0;i<sequence.length-1;i++){
//            if(sequence[i]>=sequence[i+1]) seq1++;
//        }
//        for(int k=0;k<sequence.length-2;k++){
//            if(sequence[k]>=sequence[k+2]) seq2++;
//        }
//        if(seq1+seq2>2) flag=false;
//        return flag;
//    }



    public  static boolean solution(int[] s) {
        int last = Integer.MIN_VALUE;
        int lastPrev = Integer.MIN_VALUE;
        int c = 0;

        for (int n : s) {
            if (n <= last) {
                c++;
                if (n > lastPrev) last = n;
            } else {
                lastPrev = last;
                last = n;
            }
        }
        return c <= 1;
    }

}
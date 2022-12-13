package rus.april.com.solvd.extra.november;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E5 {
    /**
     //     * A function called pairs() takes an array, for example [3,1,8].
     //     * It should return all pairs, e.g. for mentioned example: [[3,1],[3,8],[1,8]].
     //     * Implement it please
     //     */
    public static void main(String[] args) {
        int [] listI = new int[]{3, 1, 8, 2};
//        printAr(createRezArray(listI));
        createRezArray(listI).stream().forEach(el-> System.out.println("["+el[0]+","+el[1]+"]"));
    }

    public static List<int[]> createRezArray(int[]ar){
        List<int[]> rezAr = new ArrayList<>();
        for(int i = 0; i < ar.length - 1; i++){
            for (int j = i + 1; j < ar.length; j ++){
                int[]pair = new int[2];
                pair[0]=ar[i];
                pair[1]=ar[j];
                rezAr.add(pair);
            }}
        return rezAr;
    }
    public static void printAr(List<int[]>rez){
        for (int[] el : rez){
            System.out.println("["+el[0]+","+el[1]+"]");
        }
    }
}
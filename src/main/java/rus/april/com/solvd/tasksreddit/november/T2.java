package rus.april.com.solvd.tasksreddit.november;

import java.util.Arrays;
import java.util.List;

public class T2 {
    /**
     * calculation in matrix
     * <p>
     * # Imagine we have an image.We'll represent this image as a simple 2D array where every pixel is a 0 or a 1. The image you get is known to have a rectangle of 0s on a background of 1s.
     * # Write a function that takes in the image and returns a data structure that contains the coordinates of the rectangle. (e.g. top-left & bottom-    right, or top-left & width & height, etc.)
     * # {x: 3, y: 2, width: 3, height: 2}
     * # [2, 3, 3, 5]
     * # 2 3 3 5
     * image = [
     * [1, 1, 1, 1, 1, 1, 1],
     * [1, 1, 1, 1, 1, 1, 1],
     * [1, 1, 1, 0, 0, 0, 1],
     * [1, 1, 1, 0, 0, 0, 1],
     * [1, 1, 1, 1, 1, 1, 1],
     * ];
     * then the second task was the same but with more retangles of 0s, something like this
     * image = [
     * [1, 1, 1, 1, 1, 1, 1 1 1 1],
     * [1, 1, 1, 1, 1, 1, 1 1 1 1],
     * [1, 1, 1, 0, 0, 0, 1 1 0 1],
     * [1, 1, 1, 0, 0, 0, 1 1 0 1],
     * [1, 1, 1, 1, 1, 1, 1 1 0 1],
     * ];
     */
    public static void main(String[] args) {
//        int[][] array = {{1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 1}};
        int[][] array = {{1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1}};
//        System.out.println("\nFirst Zero coordinates are: x / y");
//        printCoord(findFirstZero(array));
//        findWidthAndHeight(array, findFirstZero(array));
//        System.out.println("\nLast Zero coordinates are: x / y");
//        printCoord(findLastZero(array));

//        printAr(firstZero(array));
//        System.out.println("\nFirst ZeroBlock coordinates are: y/x - top-left  /  y/x - bottom-right");
//        printAr(zeroBlock(array));
//        System.out.println("new Array");
//        printArAr(newArrWithoutFirstZeroBlock(array));
//        System.out.println(hasZero(newArrWithoutFirstZeroBlock(array)));
        printAllZeroBlocks(array);
    }

    public static void   printAllZeroBlocks(int[][] arr) {
        if (hasZero(arr)) {
            printAr(zeroBlock(arr));
            int[][] newArr = newArrWithoutFirstZeroBlock(arr);
            printAllZeroBlocks(newArr);
        }
    }

    public static void printAr(int[] ar) {
        System.out.println("zero-arr    -   y/x - top-left  /  y/x - bottom-right");
        Arrays.stream(ar).forEach(System.out::println);
        List<String> elts;
    }

//    public static void printArAr(int[][] ar) {
//        Arrays.stream(ar).forEach(s -> Arrays.stream(s).forEach(System.out::println));
//    }


    public static boolean hasZero(int[][] arr) {
        return Arrays.stream(arr).anyMatch(s -> Arrays.stream(s).anyMatch(a -> a == 0));
    }

    public static int[][] newArrWithoutFirstZeroBlock(int[][] arr) {
        int[] fZBlock = zeroBlock(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i >= fZBlock[0] && j >= fZBlock[1] && i <= fZBlock[2] && j <= fZBlock[3]) {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }

    public static int[] firstZero(int[][] arr) {
        int[] rez = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    rez[0] = i; //y
                    rez[1] = j; //x
                    return rez;
                }
            }
        }
        return rez;
    }

    public static int[] zeroBlock(int[][] arr) {
        int[] rez = new int[4];
        rez[0] = firstZero(arr)[0]; //y  i
        rez[1] = firstZero(arr)[1]; //x  j
        boolean x = false;
        boolean y = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1 && i == rez[0] && j > rez[1] && !y) {
                    rez[3] = j - 1;//y
                    y = true;
                }
                if (arr[i][j] == 0 && i == rez[0] && i == arr.length - 1 && !y) {
                    rez[3] = j; //y
                    y = true;
                }
                if (arr[i][j] == 1 && j == rez[1] && i > rez[0] && !x) {
                    rez[2] = i - 1; //x
                    x = true;
                }
                if (arr[i][j] == 0 && j == rez[1] && i == arr[i].length - 1 && !x) {
                    rez[2] = i; //x
                    x = true;
                }
            }
        }
//        printAr(rez);
        return rez;
    }
}
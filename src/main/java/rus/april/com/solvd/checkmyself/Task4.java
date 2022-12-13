package rus.april.com.solvd.checkmyself;

public class Task4 {
    /**
     * Calculation in matrix
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
        int[][] one = {{1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 1}};

        printAr(solution(one));

    }

    public static int[] solution(int[][] arr) {
        int[] arZero = new int[4];//1-fy, 2-fx, 3-ly, 4-lx
        arZero[0] = getFirstZero(arr)[0]; //Y
        arZero[1] = getFirstZero(arr)[1]; //X
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1 && i == arZero[0] && j > arZero[1]) {
                    arZero[3] = j - 1; //lX
                }
                if (arr[i][j] == 1 && i > arZero[0] && j == arZero[1]) {
                    arZero[2] = i - 1; //lY
                }
            }
        }
        return arZero;
    }

    public static void printAr(int[] ar){
        for (int i : ar){
            System.out.println(i);
        }
    }
    public static int[] getFirstZero(int[][] arr) {
        int[] coordZeroOne = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    coordZeroOne[0] = i; //Y
                    coordZeroOne[1] = j; //X
                    return coordZeroOne;
                }
            }
        }
        return null;
    }
}
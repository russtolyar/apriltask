package rus.april.com.solvd.tasksreddit.task2;

public class Main {
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
        int[][] array = {{0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}};
        System.out.println("\nFirst Zero coordinates are: x / y");
        printCoord(findFirstZero(array));
        findWidthAndHeight(array, findFirstZero(array));
        System.out.println("\nLast Zero coordinates are: x / y");
        printCoord(findLastZero(array));

    }

    public static int[] findFirstZero(int[][] array) {
        int[] arr = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == 0) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }

    public static void printCoord(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] findWidthAndHeight(int[][] array, int[] arr) {
        int a = arr[0];
        int b = arr[1];
        int width;
        int height;
        int[] data = new int[4];
        data[0] = a;
        data[1] = b;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == a && j > b && array[i][j] == 1) {
                    width = j - b;
                    data[2] = width;
                    System.out.println("\n the width  = " + width);
                    break;
                }
                if (i > a && j == b && array[i][j] == 1) {
                    height = i - a;
                    data[3] = height;
                    System.out.println(" the height  = " + height);
                    return data;
                }
            }
        }
        System.out.println("\n Data: X/Y/Width/Height");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        return data;
    }

    public static int[] findLastZero(int[][] array) {
        int[] arr = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == 0) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

}
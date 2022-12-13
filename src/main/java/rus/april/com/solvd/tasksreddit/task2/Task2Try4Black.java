package rus.april.com.solvd.tasksreddit.task2;

public class Task2Try4Black {
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
        int[][] arrayM = {{1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 1}};
        int[][] arrayDown = {{1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0}};
        int[][] arrayUp = {{0, 0, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}};

        int[][] arrayBigM = {{1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 0, 0, 1, 0, 1}, {1, 1, 1, 0, 0, 0, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1}};
        int[][] arrayBigDown = {{1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 1, 1, 1, 1, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 0, 0, 0}};
        int[][] arrayBigUp = {{0, 0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 1, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1}};

        int[][] array = {{0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 0, 0, 1, 0, 1, 0}, {1, 1, 1, 0, 0, 0, 1, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 0, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 0}};

        findAllZeroBlocksData(array);

    }

    public static void findAllZeroBlocksData(int[][] arr) {
        System.out.println();
        printData(zeroBlock(arr));
        int right = zeroBlock(arr)[3] + zeroBlock(arr)[1];//x
        int bottom = zeroBlock(arr)[2] + zeroBlock(arr)[0];//y
        int[][] newArr = changeZeroToOnes(arr, right, bottom);
        if (hasZero(newArr)) {
            System.out.println("\nNext");
            findAllZeroBlocksData(newArr);
        } else {
            System.out.println("\nNo more zero");
        }

    }

    public static void printData(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (i == 0) {
                System.out.print("y = " + ar[i] + ", ");
            } else if (i == 1) {
                System.out.print("x = " + ar[i] + ", ");
            } else if (i == 2) {
                System.out.print("height = " + ar[i] + ", ");
            } else if (i == 3) {
                System.out.print("width = " + ar[i] + ", ");
            }
        }
    }


    public static int[] getFirstZero(int[][] arr) {
        int[] arZ = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arZ[0] = i; //y
                    arZ[1] = j; //x
                    return arZ;
                }
            }
        }
        return null;
    }

    public static boolean hasZero(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] zeroBlock(int[][] arr) {
        int[] first = getFirstZero(arr);
        int[] data = new int[4];
        data[0] = first[0]; //y
        data[1] = first[1];//x
        boolean x = false;
        boolean y = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1 && i == first[0] && j > first[1] && !x) {
                    data[3] = j - data[1];//width (x)
                    x = true;
                } else if (arr[i][j] == 0 && i == first[0] && j == arr[i].length - 1 && !x) {
                    data[3] = j - data[1] + 1;//width (x)
                    x = true;
                }
                if (arr[i][j] == 1 && j == first[1] && i > first[0] && !y) {
                    data[2] = i - data[0];// height (y)
                    y = true;
                } else if (arr[i][j] == 0 && j == first[1] && i == arr.length - 1 && !y) {
                    data[2] = i - data[0] + 1;// height (y)
                    y = true;
                }
            }

        }
        return data;
    }

    public static int[][] changeZeroToOnes(int[][] arr, int right, int bottom) {
        int[][] newArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0 && i <= bottom && j <= right) {
                    newArr[i][j] = 1;
                } else {
                    newArr[i][j] = arr[i][j];
                }
            }
        }
        return newArr;
    }
}
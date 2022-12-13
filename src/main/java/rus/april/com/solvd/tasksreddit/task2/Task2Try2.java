package rus.april.com.solvd.tasksreddit.task2;

public class Task2Try2 {
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

        System.out.println("first");
        print(findWidthHeightCoordLastZeroOfRectangle(arrayBigUp,findFirstZeroOfFirstRectangleInArray(arrayBigUp)));
        System.out.println("\n\nsecond" );
        print(findWidthHeightCoordLastZeroOfRectangle(arrayBigUp,checkRestAreaForAnotherArrayCoord(arrayBigUp)));
    }

    public static int[] findFirstZeroOfFirstRectangleInArray(int[][] array) {
        int[] firstZeroCoordinate = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    firstZeroCoordinate[0] = i;
                    firstZeroCoordinate[1] = j;
                    return firstZeroCoordinate;
                }
            }
        }
        return firstZeroCoordinate;
    }

    public static int[] findWidthHeightCoordLastZeroOfRectangle(int[][] array, int []zeroArrCoord) {
        int[] data = new int[6];
        data[0] = zeroArrCoord[0]; //Y
        data[1] = zeroArrCoord[1]; //X
        int width = 0;
        int heigth = 0;
        boolean x = false;
        boolean y = false;
        // i = Y    j = X
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!x) {
                    if (array[i][array[i].length - 1] != 0) {
                        if (array[i][j] == 1 && i == data[0] && j > data[1]) {
                            width = j - data[1];
                            x = true;
                            data[2] = width;
                            data[5] = j - 1;
//                            System.out.println("width = " + width);
                        }
                    } else if (array[i][j] == 0 && j == array[i].length - 1 && i == data[0]) {
                        width = j - data[1] + 1;
                        x = true;
                        data[2] = width;
                        data[5] = j;
//                        System.out.println("width = " + width);
                    }
                } else if (!y) {
                    if (array[array.length - 1][j] != 0) {
                        if (array[i][j] == 1 && j == data[1] && i > data[0]) {
                            heigth = i - data[0];
                            y = true;
                            data[3] = heigth;
                            data[4] = i - 1;
//                            System.out.println("heigth = " + heigth);
                        }
                    } else if (array[i][j] == 0 && i == array.length - 1 && j == data[1]) {
                        heigth = i - data[0] + 1;
                        y = true;
                        data[3] = heigth;
                        data[4] = i;
//                        System.out.println("heigth = " + heigth);
                    }
                }
                if (x && y)
                    return data;
            }
        }
        return data;
    }

    public static void print(int[] array) {
        System.out.println("\n1 - coordinate Y of first zero"
                + "\n2 - coordinate X of first zero"
                + "\n3 - the width of the rectangle"
                + "\n4 - the height of the rectangle"
                + "\n5 - coordinate Y of last zero"
                + "\n6 - coordinate X of last zero\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void print(int[][] array) {
        System.out.println("\nChecked\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("\n");
        }
    }

    //отсекаем проверенный сегмент площади
//    только левее смотрим и только ниже
    public static int[] checkRestAreaForAnotherArrayCoord(int [][]array){
        int upBorder = findWidthHeightCoordLastZeroOfRectangle(array,findFirstZeroOfFirstRectangleInArray(array))[0];
        int leftBorder = findWidthHeightCoordLastZeroOfRectangle(array, findFirstZeroOfFirstRectangleInArray(array))[5];
        int leftDownAreaBorder = findWidthHeightCoordLastZeroOfRectangle(array,findFirstZeroOfFirstRectangleInArray(array))[1];
        int upDownAreaBorder = findWidthHeightCoordLastZeroOfRectangle(array,findFirstZeroOfFirstRectangleInArray(array))[4];
        int anotherX = 0;
        int anotherY = 0;
        int[] anotherArrayCoord = new int[2];
        boolean anotherZeroPresence = false;
        System.out.println("\nAnother rectangle\n");
        if(upBorder + 2 < array.length | leftBorder +  2 < array[0].length | upDownAreaBorder + 2 < array[0].length)
            for (int i = 0; i < array.length; i++){
                for(int j = 0; j < array[i].length; j ++){
                    if(array[i][j] == 0 && i > upBorder && j > leftBorder){
                        anotherZeroPresence = true;
                        anotherArrayCoord[0] = i;
                        anotherArrayCoord[1] = j;
                        return anotherArrayCoord;
                    }
                }
            }
        return anotherArrayCoord;
    }

}
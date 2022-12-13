package rus.april.com.solvd.tasksreddit.task2;

public class Task2Try3 {
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

//        System.out.println(findFirstZeroBlock(arrayM));
        printArray(getSizes(arrayBigUp));
        System.out.println("\n ANOTHER\n");
        printArray(getAnotherZeroRecData(arrayBigUp));
    }

    public static int[] getAnotherZeroRecData(int[][] arr) {
        int[] fza = getSizes(arr);
        int c;
        if ((fza[5] + 1 >= arr.length) && (fza[4] + 1 >= arr[0].length)) {
            return fza;
        }
//        if((fza[5] + 1 < arr.length) && (fza[4] +1 < arr[0].length) ){
//            return fza;
//        }
        if ((fza[5] + 1 >= arr.length) && (fza[4] + 1 < arr[0].length)) {
            c = 0;//for right Array
            return realAnotherZeroData(findFirstZero(getRightArray(arr)),arr,c);
        }
        if ((fza[5] + 1 < arr.length) && (fza[4] + 1 >= arr[0].length)) {
            c = 1; // for bottom Array
            return realAnotherZeroData(findFirstZero(getBottomArray(arr)),arr,c);
        }
        if ((fza[5] + 1 < arr.length) && (fza[4] + 1 < arr[0].length)) {
            for (Integer i : findFirstZero(getRightArray(arr))) {
                return i == null ? realAnotherZeroData(findFirstZero(getBottomArray(arr)),arr,1) : realAnotherZeroData(findFirstZero(getRightArray(arr)),arr,0);
            }
//            return findFirstZero(getBottomArray(arr))  findFirstZero(getBottomArray(arr));
        }
        return null;
    }
    public static int[] realAnotherZeroData(int[]ar,int[][]arr,int c){
        int[]trueAr = new int[2];
        if(c == 0){//right array
            trueAr[0] = ar[0] + getSizes(arr)[4] + 2;
            trueAr[1] = ar[1] + getSizes(arr)[1];
        }
        if(c == 1){//bottom array
            trueAr[0] = ar[0];
            trueAr[1] = ar[1] + getSizes(arr)[5] + 1;
        }
        return trueAr;
    }

    public static int[][] getRightArray(int[][] arr) {
        int[] firstZeroRec = getSizes(arr);
        int x = firstZeroRec[4];
        int y = firstZeroRec[5];
        int[] rightArr = new int[4];
        rightArr[0] = x + 2;//new top left x
        rightArr[1] = firstZeroRec[1] ; // new top left y
        rightArr[2] = arr[y].length - 1; //new bottom right x
        rightArr[3] = y + 1;// new bottom right y
        int newArW = rightArr[2] - rightArr[0] + 1;
        int newArH = rightArr[3] - rightArr[1] + 1;
        int[][] newArr = new int[newArH][newArW];
        for (int i = 0; i < newArH; i++) {
            for (int j = 0; j < newArW; j++) {
                newArr[i][j] = arr[i + rightArr[1]][j + rightArr[0]];
            }
        }
        return newArr;
    }

    public static int[][] getBottomArray(int[][] arr) {
        int[] firstZeroRec = getSizes(arr);
        int x = 0;
        int y = firstZeroRec[5];
        int[] bottomArr = new int[4];
        bottomArr[0] = x; //new left top x
        bottomArr[1] = y + 2; // new left top y
        bottomArr[2] = firstZeroRec[4] + 1;//new right bottom x
        bottomArr[3] = arr.length - 1;// new right bottom y

        int[][] newArr = new int[bottomArr[3] - bottomArr[1]][bottomArr[2] - bottomArr[0]];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = arr[i + bottomArr[1]][j + bottomArr[0]];
            }
        }
        return newArr;
    }

    public static int[] findFirstZero(int[][] arr) {
        int[] firstZero = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    firstZero[0] = j;//X first Zero
                    firstZero[1] = i;//Y first Zero
                    return firstZero;
                }
            }
        }
        return firstZero;
    }

    public static int[] getSizes(int[][] arr) {
        int[] zeroSizes = new int[6];
        zeroSizes[0] = findFirstZero(arr)[0];
        zeroSizes[1] = findFirstZero(arr)[1];
        boolean x = false;
        boolean y = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!x) {
                    if (arr[i][j] == 0 && i == zeroSizes[1] && j == arr[i].length - 1) {
                        zeroSizes[2] = j - zeroSizes[0] + 1;
                        zeroSizes[4] = j;
                    } else if (arr[i][j] == 1 && i == zeroSizes[1] && j > zeroSizes[0]) {
                        x = true;
                        zeroSizes[2] = j - zeroSizes[0]; //X width
                        zeroSizes[4] = j - 1;
                    }
                }
                if (!y) {
                    if (arr[i][j] == 0 && j == zeroSizes[0] && i == arr.length - 1) {
                        zeroSizes[3] = i - zeroSizes[1] + 1;
                        zeroSizes[5] = i;
                    } else if (arr[i][j] == 1 && j == zeroSizes[0] && i > zeroSizes[1]) {
                        y = true;
                        zeroSizes[3] = i - zeroSizes[1];//Y height
                        zeroSizes[5] = i - 1;
                    }
                }
            }
        }
        return zeroSizes;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
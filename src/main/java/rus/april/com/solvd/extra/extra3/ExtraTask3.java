package rus.april.com.solvd.extra.extra3;

public class ExtraTask3 {
    /**
     * есть число 15 вывести в таком виде 1+5
     */
    public static void main(String[] args) {
        int q = 15;
        String s = "15";
        printString(s);
        System.out.println();
        System.out.println();
        printInt(125);
    }

    public static void printString(String s) {
        String a = "";
        String[] b = s.split(a);
        for (int f = 0; f < b.length; f++) {
            if (f == b.length - 1) {
                System.out.print(b[f]);
            } else
                System.out.print(b[f] + " + ");
        }
    }

    public static int getTheRange(int q) {

        if (q > 99 && q < 999) {
            return 3;
        } else if (q > 9 && q < 99) {
            return 2;
        } else if (q > 0 && q < 10) {
            return 1;
        }
        return 0;
    }

    public static void printInt(int q) {
        int range = getTheRange(q);

        if (range == 2) {
            int a = q % 10;
            int b = (q - a) / 10;
            String f = String.format("%d + %d", b, a);
            System.out.println(f);
        }
        if (range == 3) {
            int a = q % 100;
            int b = a % 10;
            int c = (q - a) / 100;
            int d = (a - b) / 10;
            String s = String.format("%d + %d + %d", c, d, b);
            System.out.println(s);
        }
    }
}
package rus.april.com.solvd.extra.november;

public class E3 {
    public static void main(String[] args) {
        int q = 15;
        String s = "15";
        printString(s);
        System.out.println();
        System.out.println();
        printInt(125);
    }

    public static void printString(String s) {
        String newS = s.replaceAll(""," ").trim().replaceAll(" ","+");
        System.out.println(newS);
    }

    public static void printInt(Integer i) {
        String s = i.toString();
        printString(s);
    }
}
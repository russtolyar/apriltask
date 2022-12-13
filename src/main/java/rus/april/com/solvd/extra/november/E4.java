package rus.april.com.solvd.extra.november;

public class E4 {
    public static void main(String[]args){
        String s = "asdfGGkjcl";
        printTheLength(s);
    }
    public static void printTheLength(String s){
        for (int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1))
                System.out.println(s.length()-(i+1));
        }
    }
}
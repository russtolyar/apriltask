package rus.april.com.solvd.extra.extra4;

public class ExtraTask4 {
    /**
     * Стринга asdfGGkjcl, разделить на повторяющем символе и вывести длину(количество) второй части
     */
    public static void main(String[]args){
        String s = "asdfGGkjcl";
        printTheLength(s);
    }
    public static void printTheLength(String s){
        String [] sA = s.split("");
        int length;
        for ( int i = 0; i < sA.length; i++){
            for(int j = i + 1; j < sA.length; j++){
                if(sA[i].equals(sA[j])){
                    length = sA.length - j;
                    System.out.println("length = " + length);
                    return;
                }
            }
        }
    }
}
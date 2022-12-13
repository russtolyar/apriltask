package rus.april.com.solvd.codesignal;

public class Task2 {
    /**
     * Given the string, check if it is a palindrome.
     */
    public static void main(String[] args) {
        System.out.println(solution("mama"));
    }
    public  static boolean solution(String inputString) {
        String [] sAr = inputString.split("");
        if(sAr.length == 1){return true;}
        boolean p = true;
        if(sAr.length % 2 == 0){
            for(int i = 0; i < sAr.length / 2; i++){
                if(!sAr[i].equals(sAr[sAr.length - 1 - i])){
                    p = false;
                    break;
                };
            }
        }else {
            for(int i = 0; i < (sAr.length - 1) / 2; i++){
                if( !sAr[i].equals(sAr[sAr.length - 1 - i])){
                    p = false;
                    break;
                };
            }

        }
        return p;
    }
}
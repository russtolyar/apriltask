//package rus.april.com.solvd.codewar;
//
//public class Code1 {
//    public static void main(String[] args) {
//        digital_root(16);
//    }
//    public static int digital_root(int n) {
////        int a = n;
////         int sum = 0;
////        while(a % 10 >= 1){
////            int b =(a - a % 10) /10;
////            sum = b + a%10;
////            a = sum;
////        }
////        return sum;
//
//////        def digital_root(n):
////        int sum;
////
////        if (n < 10){} else {digital_root(sum(map(int, str(n)))};
////        return n;
//
//
////                int result = 0;
////        String(n).split('').map(num => {
////                result += Number(num);
////  });
////        return result > 10 ? digital_root(result) : result;
//
//
//        String digits = n.toString().split("").map(Number);
//        var sum = 0;
//        for (var i = 0; i < digits.length; i++) {
//            sum += digits[i];
//        }
//        var sumString = sum.toString();
//        if (sumString.length > 1) {
//            var sumDigits = sumString.split("").map(Number);
//            var firstSumDigit = sumDigits.slice(0);
//            var lastSumDigit = sumDigits.slice(-1);
//            return firstSumDigit[0] + lastSumDigit[0];
//        } else {
//            return sum;
//    }
//
//}
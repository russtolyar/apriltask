//package rus.april.com.solvd.task1.myjson;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//import java.io.FileReader;
//import java.util.Iterator;
//import java.util.Map;
//
//public class MyTryJSONRead1 {
//    public static void main(String[] args) throws Exception {
//        myRead();
//    }
//    public static void myRead() throws Exception{
//        Object obj = new JSONParser()
//                .parse(new FileReader("MyTryJSON1.json"));
//
//        JSONObject jsonObject = (JSONObject) obj;
//
//        String myBankName = jsonObject.get("bankName").toString();
//
//       //System.out.println(myBankName);
//        JSONArray jsonArray = (JSONArray) jsonObject.get("clients");
//
//        for(jsonArray)
//        Iterator iterator = jsonArray.iterator();
//        long sum = 0;
//         jsonArray.forEach((clientObject) -> {
//         });
//        while (iterator.hasNext()){
//            Iterator<Map.Entry> iterPair = ((Map) iterator.next()).entrySet().iterator();
//            while (iterPair.hasNext()){
//                Map.Entry pair = iterPair.next();
//                System.out.println(pair.getKey() + " :: " + pair.getValue());
//                if(pair.getKey().equals("amount")){
//                    sum  += (long) pair.getValue();
//                }
//
//            }
//        }
//        System.out.println(sum);
//
//    }
//}
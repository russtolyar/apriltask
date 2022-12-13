package rus.april.com.solvd.tasksreddit.task1.m;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class JSONCreateAndRead {
    public static void main(String[] args) throws Exception {
        System.out.println("test1");
//            writeJSON();

        readingJSON();
    }

//        public static void writeJSON() throws FileNotFoundException {
//            JSONObject jo = new JSONObject();
//
//            // putting data to JSONObject
//            jo.put("bankName", "TestBank");
//
//            // for address data, first create LinkedHashMap
// /*       Map m = new LinkedHashMap(4);
//        m.put("streetAddress", "21 2nd Street");
//        m.put("city", "New York");
//        m.put("state", "NY");
//        m.put("postalCode", 10021);
//
//        // putting address to JSONObject
//        jo.put("address", m);*/
//
//            // for phone numbers, first create JSONArray
//            JSONArray ja = new JSONArray();
//
//            Map m = new LinkedHashMap(2);
//            m.put("name", "User1");
//            m.put("amount", 100);
//
//            // adding map to list
//            ja.add(m);
//
//            m = new LinkedHashMap(2);
//            m.put("name", "User2");
//            m.put("amount", 1000);
//
//            // adding map to list
//            ja.add(m);
//
//            m = new LinkedHashMap(2);
//            m.put("name", "User3");
//            m.put("amount", 16565);
//
//            // adding map to list
//            ja.add(m);
//
//            // putting phoneNumbers to JSONObject
//            jo.put("clients", ja);
//
//            // writing JSON to file:"JSONExample.json" in cwd
//            PrintWriter pw = new PrintWriter("JSONExample.json");
//            pw.write(jo.toJSONString());
//
//            pw.flush();
//            pw.close();
//        }


    public static void readingJSON() throws Exception {
        Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
        JSONObject jo = (JSONObject) obj;
        String bankName = (String) jo.get("bankName");
        System.out.println(bankName);
        JSONArray ja = (JSONArray) jo.get("clients");
        Iterator itr = ja.iterator();
        long sum = 0;
        while (itr.hasNext()) {
            Iterator<Map.Entry> itr1 = ((Map) itr.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
                if (pair.getKey().equals("amount")) {
                    long amount = (long) pair.getValue();
                    System.out.println(amount);
                    sum += amount;
                }
            }
        }
        System.out.println("Total amount: " + sum);

    }

}
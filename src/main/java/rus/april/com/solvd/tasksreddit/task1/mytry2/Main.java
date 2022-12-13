package rus.april.com.solvd.tasksreddit.task1.mytry2;

import com.google.gson.Gson;
import rus.april.com.solvd.tasksreddit.task1.mytry2.model2.People;
import rus.april.com.solvd.tasksreddit.task1.mytry2.model2.Root;

import java.io.FileReader;
import java.io.Reader;


public class Main {
    /**
     * Calculate total amount of bank records for different users.
     * Bank records information is provided as .json file.
     * For practicing you can create such file manually putting some random information.
     */
    public static void main(String[] args) throws Exception {
        readJSONTest1File();
    }

    public static void readJSONTest1File() throws Exception {
        String fileName = "task1.json";
        Object obj = new FileReader(fileName);
        Gson gson = new Gson();

        Root root = gson.fromJson((Reader) obj, Root.class);

        System.out.println(root.getBank());
        System.out.println(root.getPeople());
        long count = 0;
        long sum = 0;
        for (People p1 : root.getPeople()) {
            System.out.println(p1.getName() + " :: " + p1.getMoney());
            sum += p1.getMoney();
            if (p1.getName().contains("Ya")){
                count ++;
            }
        }
        System.out.println(sum);
        System.out.println("count people with name with 'Ya' = " + count);

    }

}
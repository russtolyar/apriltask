package rus.april.com.solvd.tasksreddit.task1.task1try4;

import com.google.gson.Gson;
import rus.april.com.solvd.tasksreddit.task1.task1try4.m.People;
import rus.april.com.solvd.tasksreddit.task1.task1try4.m.Root;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
/**
 * Calculate total amount of bank records for different users.
 * Bank records information is provided as .json file.
 * For practicing you can create such file manually putting some random information.
 */
public class Main{
    public static void main(String[] args) throws FileNotFoundException{
        String filePath = "src/main/java/rus/april/com/solvd/task1/task1try4/task1try4.json";
        FileReader reader = new FileReader(filePath);
        Gson gson = new Gson();
        Root root = gson.fromJson(reader, Root.class);
        String CompanyName = root.getCompany();
        List<People>employees = root.getPeople();
        String location = root.getCity();
        int sum =0;
        for(People p1 : employees){
            sum +=p1.getMoney();
        }
        System.out.println(sum);
    }




}
package rus.april.com.solvd.checkmyself;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Task5s5 {
    /**
     * Calculate total amount of bank records for different users.
     * Bank records information is provided as .json file.
     * For practicing you can create such file manually putting some random information.
     */

    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/main/java/rus/april/com/solvd/checkmyself/t5s5.json";
        FileReader reader = new FileReader(path);
        Gson gson = new Gson();
        Root5s5 root = gson.fromJson(reader,Root5s5.class);
        String company = root.getBrand();
        System.out.println("company name is - " + company);
        List<People5s5> people = root.getPeople();
        for(People5s5 p: people){
            System.out.println(p.GetType());
            System.out.println(p.GetName());
            System.out.println(p.GetMoney());
            if(p.GetMoney() % 2 == 0){
                System.out.println( "new Money = " + p.GetMoney() * 3);
            }
        }

    }
}
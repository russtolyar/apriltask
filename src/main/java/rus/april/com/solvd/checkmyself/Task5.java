package rus.april.com.solvd.checkmyself;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Task5 {
    /**
     * Calculate total amount of bank records for different users.
     * Bank records information is provided as .json file.
     * For practicing you can create such file manually putting some random information.
     */
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/main/java/rus/april/com/solvd/checkmyself/t5.json";
        FileReader reader = new FileReader(path);
        Gson gson = new Gson();
        Root5 root5 = gson.fromJson(reader,Root5.class);
        String companyName = root5.cName;
        List<People> clients = root5.getPeople();
        System.out.println(companyName);
        for (People p : clients){
            System.out.println(p.getName());
            System.out.println(p.getMoney());
        }
    }
}
package rus.april.com.solvd.tasksreddit.task1.task1try3;

import com.google.gson.Gson;
import rus.april.com.solvd.tasksreddit.task1.task1try3.model.People;
import rus.april.com.solvd.tasksreddit.task1.task1try3.model.Personal;
import rus.april.com.solvd.tasksreddit.task1.task1try3.model.Root;

import java.io.FileReader;
import java.util.List;

public class Main {
    /**
     * Calculate total amount of bank records for different users.
     * Bank records information is provided as .json file.
     * For practicing you can create such file manually putting some random information.
     */
    public static void main(String[] args) throws Exception {
        readJSONTask1Try3();
    }

    public static void readJSONTask1Try3() throws Exception{
        String file = "JSONTask1Try3.json";
        FileReader reader = new FileReader(file);
        Gson gson = new Gson();
        Root root = gson.fromJson(reader,Root.class);
        System.out.println(root.toString());
        String bankName = root.getBank();
        System.out.println("bankName = " + bankName);
        List<People>clients = root.getPeople();
        int income = 0;
        int outcome = 0;
        for(People p1 : clients){
            outcome += p1.getTake();
            income += p1.getPut();
            System.out.println("p1 = " + p1);
        }
        System.out.println("BankIncome = " + income);
        System.out.println("BankOutcome = " + outcome);
        List<Personal> workers = root.getPersonal();
        for(Personal w1 : workers){
            System.out.println("w1 = " + w1);
        }}}
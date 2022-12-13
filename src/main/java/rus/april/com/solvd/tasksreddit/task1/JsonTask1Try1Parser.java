package rus.april.com.solvd.tasksreddit.task1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import rus.april.com.solvd.tasksreddit.task1.model.People;
import rus.april.com.solvd.tasksreddit.task1.model.RootMain;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonTask1Try1Parser {
    private static final String TAG_NAME = "name";
    private static final String TAG_BANK = "bank";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_MONEY = "money";

    public RootMain parse() {

        RootMain root = new RootMain();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("task1.json")) {

            JSONObject rooJsonObject = (JSONObject) parser.parse(reader);
            String name = (String) rooJsonObject.get(TAG_BANK);

            JSONArray peopleJSONArray  = (JSONArray) rooJsonObject.get(TAG_PEOPLE);

            List<People> peopleList = new ArrayList<>();

            for(Object it : peopleJSONArray){

                JSONObject peopleJSONObject = (JSONObject) it;

                String peopleName = (String) peopleJSONObject.get(TAG_NAME);
                int peopleAge = (Integer) peopleJSONObject.get(TAG_MONEY);

                People people = new People(peopleName,(int)peopleAge);

                peopleList.add(people);
            }


            root.setName(name);
            root.setPeople(peopleList);
            return root;

        } catch (Exception e) {
            System.out.println("Parsing Error - " + e.toString());
        }

        return null;
    }
}
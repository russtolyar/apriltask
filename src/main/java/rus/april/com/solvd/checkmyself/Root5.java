package rus.april.com.solvd.checkmyself;

import java.util.List;

public class Root5 {
    String cName;
    List<People> people;



    public Root5(String cName, List<People>people){
        this.cName = cName;
        this.people = people;
    }

    public String getCName(){
        return cName;
    }

    public List<People> getPeople(){
        return people;
    }
}
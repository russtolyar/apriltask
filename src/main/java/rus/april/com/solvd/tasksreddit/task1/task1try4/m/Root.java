package rus.april.com.solvd.tasksreddit.task1.task1try4.m;

import java.util.List;

public class Root {
    String company;
    List<People> people;
    String city;

    public void root (String company, List<People>people, String city){
        this.company = company;
        this.people = people;
        this. city = city;
    }
    public String getCompany(){
        return company;
    }
    public List<People> getPeople(){
        return people;
    }
    public String getCity(){
        return city;
    }
}
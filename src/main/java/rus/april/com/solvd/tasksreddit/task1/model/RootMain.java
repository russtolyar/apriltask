package rus.april.com.solvd.tasksreddit.task1.model;

import java.util.List;

public class RootMain {

    /**
     * Calculate total amount of bank records for different users.
     * Bank records information is provided as .json file.
     * For practicing you can create such file manually putting some random information.
     */

    private String name;
    private List<People> people;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "RootMain{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}
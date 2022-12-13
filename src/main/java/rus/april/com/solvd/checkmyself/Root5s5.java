package rus.april.com.solvd.checkmyself;

import java.util.List;

public class Root5s5 {
    private String brand;
    private List<People5s5> people;

    public Root5s5(String brand, List<People5s5> people) {
        this.brand = brand;
        this.people = people;
    }

    public String getBrand() {
        return this.brand;
    }

    public List<People5s5> getPeople() {
        return this.people;
    }
}
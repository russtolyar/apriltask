package rus.april.com.solvd.tasksreddit.task1.mytry2.model2;

import java.util.List;

public class Root {
    String bank;
    List<People> people;

    public Root(String bank, List<People> people) {
        this.bank = bank;
        this.people = people;
    }

//    public Root(String bank) {
//        this.bank = bank;
//    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Root{" +
                "bank='" + bank + '\'' +
                ", people=" + people +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Root{" +
//                "bank='" + bank + '\'' +
//                '}';
//    }
}
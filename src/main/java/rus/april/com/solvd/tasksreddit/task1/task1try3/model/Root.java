package rus.april.com.solvd.tasksreddit.task1.task1try3.model;

import java.util.List;

public class Root {
    String bank;
    List<Personal> personal;
    List<People> people;

    public Root(String bank, List<Personal> personal, List<People> people) {
        this.bank = bank;
        this.personal = personal;
        this.people = people;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
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
                ", personal=" + personal +
                ", people=" + people +
                '}';
    }
}
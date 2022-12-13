package rus.april.com.solvd.tasksreddit.task1.task1try3.model;

public class People {
    String name;
    int take;
    int put;

    public People(String name, int take, int put) {
        this.name = name;
        this.take = take;
        this.put = put;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTake() {
        return take;
    }

    public void setTake(int take) {
        this.take = take;
    }

    public int getPut() {
        return put;
    }

    public void setPut(int put) {
        this.put = put;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", take=" + take +
                ", put=" + put +
                '}';
    }
}
package rus.april.com.solvd.tasksreddit.task1.mytry2.model2;

public class People {
    String name;
    int money;

    public People(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
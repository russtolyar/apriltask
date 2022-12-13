package rus.april.com.solvd.tasksreddit.task1.task1try4.m;

public class People {
    String name;
    String dep;
    int money;

    public void people(String name, String dep, int money){
        this.name = name;
        this.dep = dep;
        this.money = money;
    }
    public String getName(){
        return name;
    }
    public String getDep(){
        return dep;
    }
    public int getMoney(){
        return money;
    }
}
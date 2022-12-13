package rus.april.com.solvd.checkmyself;

public class People {
    String name;
    int money;

    public  People(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName (){
        return name;
    }

    public int getMoney(){
        return money;
    }
}
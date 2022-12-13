package rus.april.com.solvd.tasksreddit.task1.task1try3.model;

public class Personal {
    String name;
    String dep;

    public Personal(String name, String dep) {
        this.name = name;
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", dep='" + dep + '\'' +
                '}';
    }
}
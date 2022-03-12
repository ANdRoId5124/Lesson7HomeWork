package Employees;

public class Workman implements Employees {
    String name;

    Workman(String name) {
        this.name = name;
    }

    @Override
    public String showOfPosition() {
        return name;
    }
}

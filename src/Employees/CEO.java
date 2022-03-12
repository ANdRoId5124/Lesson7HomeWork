package Employees;

public class CEO implements Employees {
    String name;
    CEO(String name){
        this.name = name;
    }

    @Override
    public String showOfPosition() {
        return name;
    }
}

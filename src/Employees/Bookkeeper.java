package Employees;

public class Bookkeeper implements Employees{
    String name;

    Bookkeeper(String name){
        this.name = name;
    }

    @Override
    public String showOfPosition() {
        return name;
    }
}

package Employees;

public class Main {
    public static void main(String[] args){
        String position;
        Employees  employees[] = new Employees[3];
        employees[0] = new Bookkeeper("Bookkeeper");
        employees[1] = new Workman("Workman");
        employees[2] = new CEO("CEO");

        for(int i = 0; i < employees.length; i++){
            position = employees[i].showOfPosition();
            System.out.println("Name of position is " + position);
        }
    }
}

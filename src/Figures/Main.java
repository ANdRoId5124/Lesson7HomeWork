package Figures;

public class Main {
    public static void main(String[] args){
        double sumOfPerimeters = 0;
        Figures[] figures = new Figures[5];
        figures[0] = new Triagle(3,4,5);
        figures[1] = new Rectangle(15,9);
        figures[2] = new Square(4);
        figures[3] = new Square(9);
        figures[4] = new Rectangle(8,6);

        for(int i = 0; i < figures.length; i++){
            sumOfPerimeters += figures[i].findPerimetr();
        }
        System.out.println("Sum of perimeters of figures: " + sumOfPerimeters);
    }
}

package Figures;

public class Rectangle implements Figures {
    double length;
    double heigth;

    Rectangle(double length, double heigth) {
        this.length = length;
        this.heigth = heigth;
    }

    @Override
    public double findSquare() {
        double square = length * heigth;
        return square;
    }

    @Override
    public double findPerimetr() {
        double perimetr = (length + heigth) * 2;
        return perimetr;
    }

}

package Figures;

public class Square implements Figures {
    double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    public double findSquare() {
        double square = length * length;
        return square;
    }

    @Override
    public double findPerimetr() {
        double perimetr = length * 4;
        return perimetr;
    }
}

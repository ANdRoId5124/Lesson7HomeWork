package Figures;

public class Triagle implements Figures {
    double base;
    double line1;
    double line2;

    Triagle(double base, double line1, double line2) {
        this.base = base;
        this.line1 = line1;
        this.line2 = line2;
    }

    @Override
    public double findSquare() {
        double halfPerimetr = (base + line1 + line2) / 2;
        System.out.println(halfPerimetr);
        double square = Math.sqrt(halfPerimetr * (halfPerimetr - base) * (halfPerimetr - line1) * (halfPerimetr - line2));
        System.out.println(square);
        return square;

    }

    @Override
    public double findPerimetr() {
        double perimetr = base + line1 + line2;
        return perimetr;

    }
}
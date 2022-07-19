package pl.edu.pjatk.exercise1;

public class Rectangle extends Shape{
    private double aSide;
    private double bSide;


    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public double getArea(){
        return aSide*bSide;
    }

    @Override
    public double getPerimeter(){
        return 2*(aSide+bSide);
    }
}

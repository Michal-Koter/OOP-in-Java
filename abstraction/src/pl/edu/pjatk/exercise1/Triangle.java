package pl.edu.pjatk.exercise1;

public class Triangle extends Shape{
    private double aSide;
    private double bSide;
    private double cSide;
    private double highOnASide;

    public Triangle(double aSide, double bSide, double cSide, double highOnASide) {
        if((aSide+bSide)>cSide&&(bSide+cSide)>aSide&&(aSide+cSide)>bSide) {
            this.aSide = aSide;
            this.bSide = bSide;
            this.cSide = cSide;
            this.highOnASide = highOnASide;
        } else {
            System.out.println("This triangle dose not exist!");
        }
    }

    @Override
    public double getArea(){
        return (aSide*highOnASide)/2;
    }

    @Override
    public double getPerimeter(){
        return aSide+bSide+cSide;
    }
}

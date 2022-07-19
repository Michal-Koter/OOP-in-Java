package pl.edu.pjatk.exercise2;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return this.a+this.b+this.c;
    }

    @Override
    public double calculateArea() {
        return this.a*this.height/2;
    }

    public int compareTo(Object o) {
        Figure that = (Figure)o;
        return (int) (this.calculateArea() - that.calculateArea());
    }
}

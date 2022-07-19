package pl.edu.pjatk.exercise2;

public class Rectangle implements Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return this.a*this.b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(this.a+this.b);
    }

    public int compareTo(Object o) {
        Figure that = (Figure)o;
        return (int) (this.calculateArea() - that.calculateArea());
    }
}

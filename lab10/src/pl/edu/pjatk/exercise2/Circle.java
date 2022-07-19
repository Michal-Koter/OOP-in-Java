package pl.edu.pjatk.exercise2;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public int compareTo(Object o) {
        Figure that = (Figure)o;
        return (int) (this.calculateArea() - that.calculateArea());
    }
}

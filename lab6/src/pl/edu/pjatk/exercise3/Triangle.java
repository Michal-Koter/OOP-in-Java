package pl.edu.pjatk.exercise3;

public class Triangle {
    protected double side;
    protected double height;

    public Triangle() {
        this.side = 1;
        this.height = 2;
    }

    public Triangle(double height) {
        this();
        this.height = height;
    }

    public double getArea(){
        return this.side * this.height / 2;
    }
}

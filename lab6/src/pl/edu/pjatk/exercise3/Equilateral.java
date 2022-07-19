package pl.edu.pjatk.exercise3;

public class Equilateral extends Triangle {
    public Equilateral(double side) {
        this.side = side;
        this.height = 0;
    }

    @Override
    public double getArea() {
        return (side*side*Math.sqrt(3))/4;
    }
}
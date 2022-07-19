package pl.edu.pjatk.exercise2;

public class Rectangle extends Figure2D{
    public Rectangle(int a, int b) {
        super(new int[]{a,a,b,b});
    }

    @Override
    public double getArray() {
        int a = edges[0];
        int b = edges[2];
        return (double)a*b;
    }
}

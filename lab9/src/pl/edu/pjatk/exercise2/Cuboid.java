package pl.edu.pjatk.exercise2;

public class Cuboid extends Figure3D{
    public Cuboid(int a, int b, int h) {
        super(new int[]{a,a,a,a,b,b,b,b,h,h,h,h});
    }

    @Override
    public double getArray(){
        int a = edges[0];
        int b = edges[4];
        int h = edges[8];
        double array = (double) 2 * (a*b + a*h + b*h);
        return array;
    }

    @Override
    public double getVolume(){
        int a = edges[0];
        int b = edges[4];
        int h = edges[8];
        double volume = (double)a*b*h;
        return volume;
    }
}

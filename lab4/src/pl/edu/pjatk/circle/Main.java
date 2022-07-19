package pl.edu.pjatk.circle;

public class Main {
    public static void main(String[] args) {
        Circle2D circle2D = new Circle2D();
        Circle2D circle2D2 = new Circle2D(4,5,10);

        System.out.println(circle2D.getArea());
        System.out.println(circle2D.getPerimeter());

        System.out.println(circle2D2.getArea());
        System.out.println(circle2D2.getPerimeter());
    }
}

package pl.edu.pjatk.exercise1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        Square square = new Square(3);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(4,5,6,5);

        Shape[] shapes = {rectangle,square,circle,triangle};

        System.out.println(shapes[0].getArea());

        for (int i=0; i< shapes.length; i++){
            System.out.println("Area of " + (i+1) + "th element of array: " + shapes[i].getArea());
            System.out.println("Perimeter of " + (i+1) + "th element of array: " +shapes[i].getPerimeter());
        }

    }
}

package pl.edu.pjatk.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(6,3.2,4.3,4.3);
        Rectangle rectangle = new Rectangle(6,3.1);
        Figure[] figures = new Figure[]{circle,triangle, rectangle};
        Arrays.sort(figures);
        for (Figure figure: figures) {
            System.out.println(figure.getClass() + ": " + figure.calculatePerimeter() + ", " + figure.calculateArea());
        }
    }
}

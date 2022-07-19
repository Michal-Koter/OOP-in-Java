package pl.edu.pjatk.exercise3;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(4);
        Equilateral equilateral = new Equilateral(3);

        System.out.printf("Triangle area : %f\n",triangle.getArea());
        System.out.printf("Triangle area : %f\n",triangle1.getArea());
        System.out.printf("Triangle area : %f\n",equilateral.getArea());
    }
}

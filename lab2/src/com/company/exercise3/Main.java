package com.company.exercise3;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2,2);
        Point point2 = new Point(4, 4);
        Point point0 = new Point();

        point0.display();
        System.out.println(point1.distanceFrom(4, 4));
        System.out.println(point1.distanceFrom(point2));
    }
}

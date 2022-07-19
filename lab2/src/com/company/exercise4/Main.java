package com.company.exercise4;

public class Main {
    public static void main(String[] args) {
        MyCircle myCircle = new MyCircle(5);
        System.out.println("Circle perimeter: " + myCircle.perimeter());
        System.out.println("Circle array: " + myCircle.FigureArray());
        System.out.println("Circle diameter: " + myCircle.diameter());
    }
}

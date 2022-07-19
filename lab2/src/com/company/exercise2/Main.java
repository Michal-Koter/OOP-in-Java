package com.company.exercise2;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        System.out.println(square1.array());
        System.out.println(square1.perimeter());

        Square square2 = new Square(10);
        System.out.println(square2.array());
        System.out.println(square2.perimeter());
    }
}

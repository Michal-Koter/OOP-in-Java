package com.company.exercise4;

public class MyCircle {
    double radius;

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double FigureArray(){
        return Math.PI*radius*radius;
    }

    public double diameter(){
        return 2*radius;
    }
}

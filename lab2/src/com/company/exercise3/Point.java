package com.company.exercise3;

public class Point {
    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(int x, int y){
        int a = Math.abs(this.x - x);
        int b = Math.abs(this.y - y);
        return Math.sqrt(a*a+b*b);
    }

    public void display(){
        System.out.printf("(%d, %d)", x, y);
    }

    public double distanceFrom(Point other){
        return distanceFrom(other.x, other.y);
    }
}

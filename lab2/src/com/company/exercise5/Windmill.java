package com.company.exercise5;

public class Windmill {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    int speed;
    boolean on;
    int radius;
    String color;

    public Windmill() {
    }

    public Windmill(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void information(){
        System.out.printf("Speed: %d\nOn: %b\nRadius: %d\nColor: %S", speed, on, radius, color);
    }
}

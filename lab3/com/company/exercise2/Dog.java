package com.company.exercise2;

public class Dog {
    String bread;
    int age;
    String color;

    public Dog(String bread, int age, String color) {
        this.bread = bread;
        this.age = age;
        this.color = color;
    }

    public void bark(){
        System.out.println("Woof! Woof! Woof!");
    }

    public void sleep(){
        System.out.println("Zzzz...");
    }
}

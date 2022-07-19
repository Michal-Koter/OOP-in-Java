package pl.edu.pjatk.exercise1;

public class Cat extends Animal{

    public Cat(String name, String color) {
        super(name, color);
    }

    public void makeSound(){
        System.out.printf("[%s:%s] Miauu\n", name, color);
    }
}

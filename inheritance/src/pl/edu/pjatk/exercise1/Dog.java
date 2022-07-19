package pl.edu.pjatk.exercise1;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    public void makeSound(){
        System.out.printf("[%s:%s] Woof woof\n",name, color);
    }
}

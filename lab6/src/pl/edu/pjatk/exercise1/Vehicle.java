package pl.edu.pjatk.exercise1;

public class Vehicle {
    protected int wheels;
    protected String color;
    protected String sound;

    public Vehicle(int wheels, String color, String sound) {
        this.wheels = wheels;
        this.color = color;
        this.sound = sound;
    }

    public void information(){
        System.out.printf("Wheels: %d, color: %s, sound: %s\n", wheels,color,sound);
    }
}

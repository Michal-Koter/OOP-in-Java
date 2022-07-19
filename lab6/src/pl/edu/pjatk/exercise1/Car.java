package pl.edu.pjatk.exercise1;

public class Car extends Vehicle {
    private String motor;

    public Car(int wheels, String color, String sound, String motor) {
        super(wheels, color, sound);
        this.motor = motor;
    }

    @Override
    public void information(){
        System.out.printf("Wheels: %d, color: %s, sound: %s, motor: %s\n", wheels,color,sound, motor);
    }
}

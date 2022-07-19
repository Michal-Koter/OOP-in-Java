package pl.edu.pjatk.exercise1;

public class Bike extends Vehicle {
    private String type;

    public Bike(int wheels, String color, String sound, String type) {
        super(wheels, color, sound);
        this.type = type;
    }

    @Override
    public void information(){
        System.out.printf("Wheels: %d, color: %s, sound: %s, type: %s\n", wheels,color,sound,type);
    }
}

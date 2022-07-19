package pl.edu.pjatk.racing;

import java.util.Random;

public class Runner {
    private String name;
    private double minSpeed;
    private double maxSpeed;
    private double distance;
    Random random = new Random();


    public Runner(String name, double minSpeed, double maxSpeed) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.distance = 0;
    }

    public void introduce(){
        System.out.printf("i am %s. I am running %5.2f-%5.2fkm/h\n", this.name, this.minSpeed, this.maxSpeed);
    }

    public void run(){
        distance += random.nextDouble(this.minSpeed, this.maxSpeed);
    }

    public double getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}

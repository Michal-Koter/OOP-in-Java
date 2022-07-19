package pl.edu.pjatk.exercise1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(3,"black","brrr");
        Car car = new Car(4,"white", "wrrr", "CAS123");
        Bike bike = new Bike(2,"red","trrr trr", "fitness");
        Vehicle[] vehicles = {vehicle,car,bike};
        for (Vehicle veh: vehicles) {
            veh.information();
        }
    }
}

package pl.edu.pjatk.overwriteToString;

public class House {
    private String street;
    private double areaHouse;
    private double areaGarden;
    private int storeys;
    private boolean isLiving;

    public House(String street, double areaHouse, double areaGarden, int storeys, boolean isLiving) {
        this.street = street;
        this.areaHouse = areaHouse;
        this.areaGarden = areaGarden;
        this.storeys = storeys;
        this.isLiving = isLiving;
    }

    @Override
    public String toString() {
        return "House{" +
                "street='" + street + '\'' +
                ", areaHouse=" + areaHouse +
                ", areaGarden=" + areaGarden +
                ", storeys=" + storeys +
                ", isLiving=" + isLiving +
                '}';
    }
}

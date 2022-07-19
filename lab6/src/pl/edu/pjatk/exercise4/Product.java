package pl.edu.pjatk.exercise4;

public class Product {
    private String name;
    private double price;
    private double quantity;

    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){
        return "|" + getName() + "\t|" + getPrice() + "\t|" + getQuantity() + "\t|";

    }

    public static String tabela(){
        return "|name\t|price\t|quantity\t|\n" +
                "-------------------------";
    }
}

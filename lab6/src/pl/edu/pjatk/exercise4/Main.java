package pl.edu.pjatk.exercise4;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("groats", 5.4,200);
        Product product1 = new Product("rise",4.99,4023);
        Product product2 = new Product("canned food", 10.4, 30);

        System.out.println(Product.tabela());
        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
    }
}

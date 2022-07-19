package pl.edu.pjatk.exercise2;

public class Bookshop extends Shop{
    private String products[];

    public Bookshop(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }

    public String[] getProducts() {
        return products;
    }

    @Override
    public void getInformation(){
        super.getInformation();
        this.productsToString();
    }

    public void productsToString(){
        for(int i=0;i<this.getProducts().length;i++){
            System.out.print(this.getProducts()[i] + ", ");
        }
        System.out.println("");
    }
}

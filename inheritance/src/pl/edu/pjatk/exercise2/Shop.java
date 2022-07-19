package pl.edu.pjatk.exercise2;

public class Shop {
    protected String address;
    protected int size;

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public void getInformation(){
        System.out.printf("Address: %s, Size:$d m^2\n",this.getAddress(),this.getSize());
    }
}

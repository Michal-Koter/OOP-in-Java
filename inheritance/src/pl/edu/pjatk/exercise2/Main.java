package pl.edu.pjatk.exercise2;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Mlynarka 12",12);
        shop.getInformation();

        String[] books = {"Potop","Ognim i mieczem", "Zwiadowca"};
        Bookshop bookshop = new Bookshop("Dluga 41", 31,books);
        bookshop.getInformation();

        String[] bread = {"bread", "roll", "cake"};
        Bakery bakery = new Bakery("Piekarnicza 4",10,bread);
        bakery.getInformation();
    }
}

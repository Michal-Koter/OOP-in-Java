package pl.edu.pjatk.fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2,3);
        Fraction fraction2 = new Fraction(3,5);

        Fraction sum = fraction1.add(fraction2);
        sum.show();
        Fraction sub = fraction1.sub(fraction2);
        sub.show();
        Fraction mul = fraction1.mul(fraction2);
        mul.show();
        Fraction div = fraction1.div(fraction2);
        div.show();
    }
}

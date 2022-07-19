package pl.edu.pjatk.fraction;

public class Fraction {
    private int nominator;
    private int denominator;

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public int getNominator() {
        return nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction fraction){
        if( this.getDenominator()== fraction.getDenominator()){
            return new Fraction(this.getNominator()+fraction.getNominator(),this.getDenominator());
        } else {
            int nom = this.getDenominator()* fraction.getDenominator();
            return new Fraction(this.getDenominator()* fraction.getNominator()+this.getNominator()* fraction.getDenominator(),nom);
        }
    }

    public Fraction sub(Fraction fraction){
        if( this.getDenominator()== fraction.getDenominator()){
            return new Fraction(this.getNominator()-fraction.getNominator(),this.getDenominator());
        } else {
            int nom = this.getDenominator()* fraction.getDenominator();
            return new Fraction(this.getNominator()* fraction.getDenominator()-this.getDenominator()* fraction.getNominator(),nom);
        }
    }

    public Fraction mul(Fraction fraction){
        return new Fraction(this.getNominator()*fraction.getNominator(),this.getDenominator()* fraction.getDenominator());
    }

    public Fraction div(Fraction fraction){
        return this.mul(new Fraction(fraction.getDenominator(),fraction.getNominator()));
    }

    public void show(){
        System.out.printf("%d/%d\n",this.getNominator(),this.getDenominator());
    }
}

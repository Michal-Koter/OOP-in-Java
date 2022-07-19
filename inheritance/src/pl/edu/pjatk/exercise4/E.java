package pl.edu.pjatk.exercise4;

public class E extends D{
    public E() {
    }

    @Override
    public void present(String phrase){
        System.out.println("e");
        super.present(phrase);
    }
}

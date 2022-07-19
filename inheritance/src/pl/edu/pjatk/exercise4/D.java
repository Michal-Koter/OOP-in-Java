package pl.edu.pjatk.exercise4;

public class D extends C{
    public D() {
    }

    @Override
    public void present(String phrase){
        System.out.println("d");
        super.present(phrase);
    }
}

package pl.edu.pjatk.exercise4;

public class C extends B{
    public C() {
    }

    @Override
    public void present(String phrase){
        System.out.println("c");
        super.present(phrase);
    }
}

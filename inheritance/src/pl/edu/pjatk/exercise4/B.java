package pl.edu.pjatk.exercise4;

public class B extends A{
    public B() {
    }

    @Override
    public void present(String phrase){
        System.out.println("b");
        super.present(phrase);
    }
}

package pl.edu.pjatk.exercise2;

public class Main {
    public static void main(String[] args) {
        try {
            exception();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void exception(){
        int a = 12/0;
        System.out.println("message");
    }
}

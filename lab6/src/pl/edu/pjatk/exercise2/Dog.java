package pl.edu.pjatk.exercise2;

public class Dog {
    public Dog() {
    }

    public void bark(){
        System.out.println("Hau");
    }

    public void bark(int ile){
        for(int i=0;i<ile;i++){
            System.out.printf("hau ");
        }
        System.out.printf("\n");
    }
}

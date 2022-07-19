package pl.edu.pjatk.racing;

public class Race {
    public static void main(String[] args) {
        Runner first = new Runner("Adam", 2.2, 12.5);
        Runner second = new Runner("Jan", 1.7,8.4);
        Runner third = new Runner("Karol",2,10.4);

        first.introduce();
        second.introduce();
        third.introduce();

        while(first.getDistance()<50 && second.getDistance()<50 && third.getDistance()<50) {
            first.run();
            second.run();
            third.run();
        }

        if (first.getDistance()> second.getDistance() && first.getDistance()> third.getDistance()){
            winner(first.getName());
        } else if (second.getDistance()> first.getDistance() && second.getDistance()> third.getDistance()){
            winner(second.getName());
        } else {
            winner(third.getName());
        }
    }

    public static void winner(String name){
        System.out.printf("The winner is %s\n", name);
    }
}

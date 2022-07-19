package pl.edu.pjatk.guessTheNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Game game = new Game(0,10);
        Scanner scanner = new Scanner(System.in);
        while(game.getNumOfTries()<5 && game.isGuessed()==false){
            System.out.print("Enter the number: ");
            game.guess(scanner.nextInt());
        }
        if(game.getNumOfTries()==5){
            System.out.printf("Guessing number was: %d",game.getValue());
        }
    }
}

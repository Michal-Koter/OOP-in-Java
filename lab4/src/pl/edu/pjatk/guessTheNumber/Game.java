package pl.edu.pjatk.guessTheNumber;

import java.util.Random;

public class Game {
    private int value;
    private int numOfTries;
    private boolean guessed;
    Random random = new Random();

    public Game(int minValue, int maxValue) {
        this.value = random.nextInt(minValue, maxValue);
        this.numOfTries = 0;
        this.guessed = false;
    }

    public int getNumOfTries() {
        return numOfTries;
    }

    public int getValue() {
        return value;
    }

    public boolean isGuessed() {
        return guessed;
    }

    public void setNumOfTries() {
        this.numOfTries += 1;
    }

    public void setGuessed(boolean guessed) {
        this.guessed = guessed;
    }

    public void guess(int num){
        if(num > getValue()){
            System.out.println("Your number is greater than guessing");
        } else if (num < getValue()){
            System.out.println("Your number is less than guessing");
        } else {
            System.out.println("You guessed!!!");
            setGuessed(true);
        }
        setNumOfTries();
    }
}

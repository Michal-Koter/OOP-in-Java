package pl.edu.pjatk.coinFlip;

import java.util.Random;

public class Coin {
    int headAmount;
    int tailAmount;
    int flipAmount;

    Random random = new Random();

    public Coin(int flipAmount) {
        this.headAmount = 0;
        this.tailAmount = 0;
        this.flipAmount = flipAmount;
    }

    public int getHeadAmount() {
        return headAmount;
    }

    public int getTailAmount() {
        return tailAmount;
    }

    public int getFlipAmount() {
        return flipAmount;
    }

    public void setHeadAmount() {
        this.headAmount += 1;
    }

    public void setTailAmount() {
        this.tailAmount += 1;
    }

    public void flip(){
        boolean bool = random.nextBoolean();
        //head==true, tail==false
        if (bool) {
            this.setHeadAmount();
        } else {
            this.setTailAmount();
        }
    }

    public void ratio(){
        for(int i=0;i<this.flipAmount;i++)
            this.flip();
        double headRatio = (double)this.headAmount/this.flipAmount*100;
        double tailRatio = (double) this.tailAmount/this.flipAmount*100;
        System.out.printf("%2.0f%% head / %2.0f%% tail to %d flips",headRatio, tailRatio, this.flipAmount);
    }
}

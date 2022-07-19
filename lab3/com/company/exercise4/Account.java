package com.company.exercise4;

public class Account {
    int id;
    double money;

    public Account(int id, double money) {
        this.id = id;
        this.money = money;
    }

    public void checkMoney(){
        System.out.printf("The balance is %5.2f\n", this.money);
    }

    public void deposit(double amount){
        this.money+=amount;
        System.out.printf("You deposited %5.2f", amount);
    }

    public void withdrawal(double amount){
        if (this.money >= amount) {
            this.money -= amount;
            System.out.printf("You withdrawn %5.2f", amount);
        } else {
            System.out.printf("You have not enough money on account");
        }
    }
}

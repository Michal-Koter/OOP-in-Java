package com.company.exercise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account[] accounts = new Konto[5];
        for (int i=0; i<5; i++){
            accounts[i] = new Account(i+1, 100);
        }

        Scanner scan = new Scanner(System.in);

        while(true) {
            // account dla użytkownika jest numerowane od 1-5
            int account;
            do {
                System.out.printf("If you want end program, enter 0.\nEnter an id: ");
                account = scan.nextInt();
            } while (account > 5 || account < 0);
            if (account == 0) {
                System.exit(0);
            }
            account -= 1;

            int action;
            do {
                System.out.printf("\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\n");
                do {
                    System.out.printf("Enter a choice: ");
                    action = scan.nextInt();
                } while (action > 4 || action < 0);

                switch (action) {
                    case 1:
                        konta[account].checkMoney();
                        break;
                    case 2:
                        konta[account].withdrawal(50);
                        break;
                    case 3:
                        konta[account].deposit(50);
                        break;
                    case 4:
                        System.out.printf("EXIT");
                        break;
                }
                System.out.printf("\n\n");
            } while (action != 4);
        }
    }
}

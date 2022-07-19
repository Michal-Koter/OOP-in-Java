package com.company;

import java.util.Scanner;

public class EuclidAlgorithm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scan.nextInt();
        System.out.print("Enter a number: ");
        int y = scan.nextInt();
        System.out.println(GCD(x, y));
    }

    public static int GCD(int a, int b){
        while(a > 0 && b > 0){
            if (a > b){
                a %= b;
            } else {
                b %= a;
            }
        }
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
}

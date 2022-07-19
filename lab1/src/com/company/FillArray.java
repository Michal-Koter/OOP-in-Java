package com.company;

import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int sizeOfArray = scan.nextInt();
        String[] words = new String[sizeOfArray];
        for (int i=0; i < sizeOfArray; i++){
            System.out.println("Enter element of array: ");
            words[i] = scan.next();
        }
        for (int i=0; i < sizeOfArray; i++){
            System.out.println(words[i]);
        }
    }
}

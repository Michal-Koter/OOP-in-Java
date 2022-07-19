package com.company;

public class MilesAndKilometers {
    public static void main(String[] args) {
        System.out.println("Miles\tKilometers");
        for(int i = 1; i <= 10; i++){
            System.out.print(i);
            System.out.print("\t\t");
            System.out.println(i*1.609);
        }
    }
}

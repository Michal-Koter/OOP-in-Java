package com.company;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter degrees Celsius: ");
        double CelsiusDegree = scan.nextDouble();
        System.out.println(CelsiusDegree + " degrees Celsius is " + (9.0/5.0)*CelsiusDegree+32 + "F.");
    }
}

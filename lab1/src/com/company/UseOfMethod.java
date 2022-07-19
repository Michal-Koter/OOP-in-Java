package com.company;

import java.util.Scanner;

public class UseOfMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int sizeOfArray = scan.nextInt();
        int[] numbers = new int[sizeOfArray];
        System.out.println("Enter a first element of array: ");
        numbers[0] = scan.nextInt();
        for (int i = 1; i < sizeOfArray; i++) {
            if ((numbers[0] + 1) % 2 == 0 && i == 1) {
                numbers[i] = numbers[0] + 1;
            } else {
                numbers[i] = numbers[i - 1] + 2;
            }
        }
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Min: " + minimumValue(numbers));
        System.out.println("Max: " + maximumValue(numbers));
        System.out.println("Suma: " + sum(numbers));
        System.out.println("Avg: " + average(numbers, sizeOfArray));
        System.out.println("Median: " + median(numbers, sizeOfArray));
    }

    public static int minimumValue(int[] array){
        int min = array[0];
        for (int num : array){
            if (min > num){
                min = num;
            }
        }
        return min;
    }

    public static int maximumValue(int[] array){
        int max = array[0];
        for (int num : array){
            if (max < num){
                max = num;
            }
        }
        return max;
    }

    public static int sum(int[] array){
        int result = 0;
        for (int num : array){
            result += num;
        }
        return result;
    }

    public static double average(int[] array, double sizeOfArray){
        return sum(array)/sizeOfArray;
    }

    public static double median(int[] array, int sizeOfArray){
        if (sizeOfArray % 2 != 0){
            return array[sizeOfArray/2];
        } else {
            int mid = sizeOfArray/2;
            return (array[mid]+array[mid-1])/2.0;
        }
    }
}

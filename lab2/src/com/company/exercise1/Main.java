package com.company.exercise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[] {0, 10, 0};
        int[] array2 = new int[] {5, 90, 5};
        int[] sum = arraySum(array1,array2);

        System.out.print(Arrays.toString(sum));
    }

    public static int[] arraySum (int[] first, int[] second){
        if (first.length != second.length){
            return new int[] {};
        }
        int[] sum = new int[first.length];
        for (int i=0; i < first.length; i++) {
            sum[i] = first[i] + second[i];
        }
        return sum;

    }
}

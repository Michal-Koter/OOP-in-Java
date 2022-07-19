package com.company.exercise1;

public class Main {

    public static int compare(int a, int b){
        if(a>b){
            return -1;
        } else if (a==b) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(compare(1,2));
        System.out.println(compare(1,1));
        System.out.println(compare(2,1));
    }

}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = readNum("number n: ");
        checkNumberPositive(n);

        int numberOfTribonacci = countNumberOfTribonacci(n);

        printNumberOfTribonacci(numberOfTribonacci);

    }

    private static int countNumberOfTribonacci(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        int i;

        for (i = 0; i <= n;) {
            if (n == 0){
                break;
            }
            i = a + b + c;
            if (i >= n) {
                break;
            }
            a = b;
            b = c;
            c = i;
        }
        return i;
    }

    private static void checkNumberPositive(int num){
        if (num < 0){
            System.out.println("Error. The number must be greater than zero!");
        }
    }

    private static void printNumberOfTribonacci(int numberOfTribonacci){
        System.out.println("Smallest tribonacci number greater than or equal to n: " + numberOfTribonacci);
    }

    private static int readNum(String value) {
        System.out.print("Enter " + value);
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

}
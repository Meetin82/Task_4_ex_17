package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = readNum("number n: ");
        
        if (isNumberPositive(n)) {
            System.out.println("Error. The number must be greater than or equal zero!");
            return;
        }

        int numberOfTribonacci = countNumberOfTribonacci(n);

        printNumberOfTribonacci(numberOfTribonacci);
    }

    private static int countNumberOfTribonacci(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        int result = 0;

        if (n == 0) {
            return result;
        }

        while (result < n) {
            result = a + b + c;

            a = b;
            b = c;
            c = result;
        }

        return result;
    }

    private static boolean isNumberPositive(int num) {
        return num < 0;
    }

    private static void printNumberOfTribonacci(int numberOfTribonacci) {
        System.out.println("Smallest tribonacci number greater than or equal to n: " + numberOfTribonacci);
    }

    private static int readNum(String value) {
        System.out.print("Enter " + value);
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }
}

package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int number2 = sc.nextInt();
        int number = 0;
        beforeSwap(number1, number2);

        afterSwap(number1, number2, number);
    }

    //Program For Swap Two Numbers
    public static void beforeSwap(int number1, int number2) {
        System.out.println("Before Swapping: " + number1 + " " + number2 + " ");
    }

    public static void afterSwap(int number1, int number2, int number) {
        number = number1;
        number1 = number2;
        number2 = number;
        System.out.println("After Swapping: " + number1 + " " + number2 + " ");
    }
}

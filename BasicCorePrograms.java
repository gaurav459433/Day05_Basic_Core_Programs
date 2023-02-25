package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        checkEvenOdd(n);
    }

    //Program For Swap Two Numbers
    public static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " " +"is Even Number");
        }
        else {
            System.out.println(n + " " +"is Odd Number");
        }
    }
}

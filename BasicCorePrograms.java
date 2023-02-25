package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Dividend Value:");
        int dividend = sc.nextInt();
        System.out.println("Enter The Divisor Value");
        int divisor = sc.nextInt();

        QuotientAndRemainder(dividend, divisor);
    }

    //Program For Quotient & Remainder
    public static void QuotientAndRemainder(int dividend, int divisor) {
        int quotient;
        int remainder;
        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}

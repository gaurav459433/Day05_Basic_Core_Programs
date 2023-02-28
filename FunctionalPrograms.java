package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c");
        double c = sc.nextDouble();
        roots(a, b, c);
    }

    public static void roots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        System.out.println("Delta is " + delta);
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots are:");
            System.out.println("Roots of x1: " + x1);
            System.out.println("Roots of x2: " + x2);
        } else {
            System.out.println("Delta is less than 0");
        }
    }
}

package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int harmonic = sc.nextInt();
        double sum = 0;

        harmonicNumber(harmonic, sum);
    }

    //Program For Harmonic Number
    public static void harmonicNumber(int harmonic, double sum) {
        for (int i = 1; i <= harmonic; i++) {
            System.out.println("1/" + i + "+");
            sum += (double) 1 / i; // sum for number
        }
        System.out.println("Sum of Harmonic Numbers is: " + sum);
    }
}

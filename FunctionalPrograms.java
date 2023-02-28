package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Temperature : ");
        double t = sc.nextDouble();
        System.out.println("Enter The Wind speed : ");
        double v = sc.nextDouble();
        windChill(t, v);
    }

    public static void windChill(double t, double v) {
        double w = 35.74 + (0.6215 * t) + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        if ((t <= 50) && (v <= 120) && (v >= 3)) {
            System.out.println("Wind Chill : " + w);
        }
    }
}

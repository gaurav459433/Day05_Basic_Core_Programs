package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year :");
        int year = sc.nextInt();
        leapYear(year);
    }

    //Program For Checking Leap Year OR Not
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Given Year Is Leap Year");
        } else {
            System.out.println("Given Year Is Not Leap Year");
        }
    }
}

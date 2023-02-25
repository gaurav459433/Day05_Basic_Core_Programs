package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Power For 2 :");
        int n = sc.nextInt();
        int power = 1;
        powerOf2(n, power);
    }

    //Program For Power Of 2
    public static void powerOf2(int n, int power) {
        int i = 0;
        if (0 <= n && n < 31) {  //input number should be less than 31 & greater than 0
            while (i < n) {
                power *= 2;  //for power of 2
                i++;
            }
        }
        System.out.println("2^" + n + " is = " + " " + power);

    }

}

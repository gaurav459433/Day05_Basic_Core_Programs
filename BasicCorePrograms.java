package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Find Its Factor:");
        int num = sc.nextInt();
        double sum = 0;

        primeFactorization(num);
    }

    //Program For Prime Factorization
    public static void primeFactorization(int num) {
        for (int i = 2; i <= num; i++) {    //prime factors start by 2
            while (num % i == 0) {   //the number should be complete divisible by "i" number
                System.out.println(i);
                num = num / i; // till divisible it is divides
            }
        }

    }
}

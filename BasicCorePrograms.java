package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Times Want To Flip Coin :");
        int numOfTimesToFlip = sc.nextInt();
        double headsCount = 0;
        double tailsCount = 0;
        flipCoinHeadsTails(headsCount, tailsCount, numOfTimesToFlip);
    }

    public static void flipCoinHeadsTails(double headsCount, double tailsCount, int numOfTimesToFlip) {
        for (int i = 0; i < numOfTimesToFlip; i++) {
            double coinFlip = Math.random();
            if (coinFlip < 0.5) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        System.out.println("Number Of Heads :" + headsCount);
        System.out.println("Number Of Tails :" + tailsCount);

        double headspercentage = headsCount / numOfTimesToFlip * 100;
        double tailspercentage = tailsCount / numOfTimesToFlip * 100;

        System.out.println("Percentage of Heads :" + headspercentage);
        System.out.println("Percentage of tails :" + tailspercentage);
    }
}

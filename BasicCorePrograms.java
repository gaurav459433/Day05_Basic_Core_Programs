package com.bridgelabz.assignmentsrfp259.day05.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");
        char alphabet = sc.next().charAt(0);

        checkVowelConsonant(alphabet);
    }

    //Program For Checking An Alphabet is Vowel Or Consonant
    public static void checkVowelConsonant(char alphabet) {
        switch (alphabet) {
            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':

            case 'A':

            case 'E':

            case 'I':

            case 'O':

            case 'U':

                System.out.println(alphabet + " is vowel");
                break;

            default:
                System.out.println(alphabet + " is consonant");
        }

    }
}

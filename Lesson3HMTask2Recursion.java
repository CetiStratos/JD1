package com.lesson3;

import java.util.Scanner;

public class Lesson3HMTask2Recursion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scan.nextInt();
        System.out.println(fibonacci(number));
    }

    public static long fibonacci(long i) {

        if (i <= 1) {
            return i;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}

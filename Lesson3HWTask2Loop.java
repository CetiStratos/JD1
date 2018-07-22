package com.lesson3;

import java.util.Scanner;

public class Lesson3HWTask2Loop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scan.nextInt();
        int next = 1;
        int first = 0;
        int second = 1;

        while (next < number) {

            System.out.print(next + " ");
            next = first + second;
            first = second;
            second = next;
        }

    }
}

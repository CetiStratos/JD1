package com.lesson3;

import java.util.Scanner;

public class Lesson3HWTask3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount;
        int sum = 0;
        int average;
        int max = 0;
        int tempMax;
        int temp;

        System.out.println("Enter number of days");
        amount = scan.nextInt();

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter the rain amount for day " + (i + 1));
            temp = scan.nextInt();
            sum += temp;
            tempMax = temp;
            if (max < tempMax) {
                max = tempMax;
            }

        }
        average = sum / amount;
        System.out.println(amount + " Days, " + "Sum: " + sum + ", Average: " + average + ", Max: " + max);
    }

}

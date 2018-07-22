/**
 * 2,5,-3
 * Dont use double, use BigDecimal
 **/
package com.lesson2.homework;

import java.util.Scanner;

public class HWTask3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a b & c");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double dis = discriminant(a, b, c);

        if (isPositive(dis)) {
            double x1, x2;
            x1 = (-b - Math.sqrt(dis)) / (2 * a);
            x2 = (-b + Math.sqrt(dis)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (isZero(dis)) {
            double x1;
            x1 = -b / (2 * a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("There is no roots in equation");
        }


    }

    public static boolean isPositive(double input) {
        return (input > 0.0);
    }


    public static boolean isZero(double input) {
        return (input == 0.0);
    }

    public static double discriminant(double a, double b, double c) {
        double dis;
        dis = b * b - 4 * a * c;
        return dis;

    }
}

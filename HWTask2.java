package com.lesson2.homework;

import java.util.Scanner;

public class HWTask2 {

    public static void main(String[] args) {
        double e, f, a, b, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first, dimensions of your land, then dimensions of 2 buildings on it: ");
        e = in.nextDouble();
        f = in.nextDouble();
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        System.out.printf((e >= a && e >= c && f >= (b + d)) ||
                        (e >= b && e >= c && f >= (a + d)) ||
                        (e >= a && e >= d && f >= (b + c)) ||
                        (e >= b && e >= d && f >= (a + c)) ||
                        (f >= a && f >= c && e >= (b + d)) ||
                        (f >= b && f >= c && e >= (a + d)) ||
                        (f >= a && f >= d && e >= (b + c)) ||
                        (f >= b && f >= d && e >= (a + c)) ? "They fit" : "Not enough space\n");
    }
}
package com.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4HWTask1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to use arrayCopy: Y/N");
        String x = scan.next();
        if (!x.equalsIgnoreCase("Y")) {
            int last = array[array.length - 1];

            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = last;
            System.out.println(Arrays.toString(array));

        } else {
            arrayCopy(array);
            System.out.println("Using arrayCopy: " + Arrays.toString(array));
        }

    }

    public static void arrayCopy(int[] array) {
        int temp = array[array.length - 1];
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = temp;
    }


}



package com.lesson4;

import java.util.Arrays;

public class Lesson4HWTask4 {

    public static void main(String[] args) {
        int[][] array = {{3, 2}, {30, 20}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                length++;
            }
        }
        int[] result = new int[length];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[temp] = array[i][j];
                temp++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

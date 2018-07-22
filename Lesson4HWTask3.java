package com.lesson4;

import java.util.Arrays;

public class Lesson4HWTask3 {

    public static void main(String[] args) {
        int[] arrOne = {1, 2, 3, 4, 5};
        int[] arrTwo = {5, 6, 7};
        int[] arrThree = new int[arrOne.length + arrTwo.length];

        for (int i = 0, j = 0; j < arrThree.length; ++i) {
            if (i < arrOne.length) {
                arrThree[j++] = arrOne[i];
            }
            if (i < arrTwo.length) {
                arrThree[j++] = arrTwo[i];
            }
        }
        System.out.println(Arrays.toString(arrThree));
    }
}

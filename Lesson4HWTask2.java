package com.lesson4;

import java.util.Arrays;

public class Lesson4HWTask2 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 6, 8, 9, 5};
        int temp[] = new int[arr.length];
        boolean[] check = new boolean[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (check[i] != true)
                temp[index++] = arr[i];
            else
                continue;

            int var = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (var == arr[j])
                    check[j] = true;
            }
        }
        int returnArray[] = new int[index];

        for (int i = 0; i < returnArray.length; i++)
            returnArray[i] = temp[i];

        System.out.println(Arrays.toString(returnArray));

    }
}

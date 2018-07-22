package com.lesson4;

import java.util.Arrays;
import java.util.ArrayList;

public class Lesson4HWTask4ArrayList {

    public static void main(String[] args) {
        int[][] arr = {{2, 3}, {20, 30}};
        int[] fin = mode(arr);
        System.out.println(Arrays.toString(fin));
    }

    public static int[] mode(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}




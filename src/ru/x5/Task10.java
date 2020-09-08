package ru.x5;

import java.util.Arrays;

public class Task10 {

    static int[] array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
    static int temp, i, j;

    public static void make10() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) zerosEnd(j,i);
            }
        }
        System.out.print(Arrays.toString(array) + "; ");
        System.out.println("");
    }


    public static void zerosEnd(int j, int i) {
        if (array[j] != 0) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }
}
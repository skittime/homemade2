package ru.x5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void make5() {
        System.out.println("Ввежите 3 целых числа");
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        array[0] = in.nextInt();
        array[1] = in.nextInt();
        array[2] = in.nextInt();
        Arrays.sort(array);

        System.out.println("Минимальное значение - " + array[0]);


    }
}

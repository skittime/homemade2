package ru.x5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void make5() {
        System.out.println("Ввежите 3 целых числа");
        Scanner in = new Scanner(System.in);
        int[] mas = new int[3];
        mas[0] = in.nextInt();
        mas[1] = in.nextInt();
        mas[2] = in.nextInt();
        Arrays.sort(mas);

        System.out.println("Минимальное значение - " + mas[0]);


    }
}

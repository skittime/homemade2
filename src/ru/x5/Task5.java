package ru.x5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public void make5() {
        System.out.println("Ввежите 3 целых числа");
        Scanner num = new Scanner(System.in);
        int[] mas = new int[3];
        mas[0] = num.nextInt();
        mas[1] = num.nextInt();
        mas[2] = num.nextInt();
        Arrays.sort(mas);

        System.out.println("Минимальное значение - " + mas[0]);


    }
}

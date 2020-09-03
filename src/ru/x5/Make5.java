package ru.x5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Make5 {
    public Make5 () {
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

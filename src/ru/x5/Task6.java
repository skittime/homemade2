package ru.x5;

import java.util.Scanner;

public class Task6 {
    public static void make6() {
        System.out.println("Введите число:");
        Scanner beIn = new Scanner(System.in);
        int abs = beIn.nextInt();
        int pol = abs % 2;
        if (abs == 0) {
            System.out.println("Введено нулевое число");
        } else if (pol == 0) {
            if (abs > 0) {
                System.out.println("Введено положительное четное число");
            } else
                System.out.println("Введено отрицательное четное число");
        } else if (abs > 0) {
            System.out.println("Введено положительное нечетное число");
        } else
            System.out.println("Введено отрицательное нечетное число");

    }
}

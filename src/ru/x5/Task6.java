package ru.x5;

import java.util.Scanner;

public class Task6 {
    public void make6() {
        System.out.println("Введите число:");
        Scanner num = new Scanner(System.in);
        int abs = num.nextInt();
        if (abs > 0) {
            int pol;
            pol = abs % 2;
            if (pol == 0) {
                System.out.println("Введено положительное четное число");
            } else
                System.out.println("Введено положительное нечетное число");

        }

        if (abs < 0) {
            int pol;
            pol = abs % 2;
            if (pol == 0) {
                System.out.println("Введено отрицательное четное число");
            } else
                System.out.println("Введено отрицательное нечетное число");

        }
        if (abs == 0) {
            System.out.println("Введено нулевое число");
        }
    }
}

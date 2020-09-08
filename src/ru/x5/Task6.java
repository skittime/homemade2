package ru.x5;

import java.util.Scanner;

public class Task6 {
    public static void make6() {
        System.out.println("Введите число:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int even = number % 2;
        if (number == 0) {
            System.out.println("Введено нулевое число");
        } else if (even == 0) {
            if (number > 0) {
                System.out.println("Введено положительное четное число");
            } else
                System.out.println("Введено отрицательное четное число");
        } else if (number > 0) {
            System.out.println("Введено положительное нечетное число");
        } else
            System.out.println("Введено отрицательное нечетное число");

    }
}

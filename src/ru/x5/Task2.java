package ru.x5;

import java.util.Scanner;

public class Task2 {
    public static void make2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = input.nextInt();
        int resultSum = 0;
        while (number != 0) {
            resultSum += (number % 10);
            number /= 10;
        }
        System.out.println("Результат сложения " + resultSum);
    }


}


package ru.x5;

import java.util.Scanner;

public class Task3 {
    public static void make3() {

        Scanner num = new Scanner(System.in);
        System.out.println("Введите число");
        int inputNumber = num.nextInt();
        if (inputNumber > 0) {
            inputNumber++;
            System.out.println("Условие положительное " + inputNumber);
        } else
            System.out.println("Условие отрицательное " + inputNumber);
    }
}
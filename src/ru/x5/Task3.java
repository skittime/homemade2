package ru.x5;

import java.util.Scanner;

public class Task3 {
    public static void make3() {

        Scanner num = new Scanner(System.in);
        System.out.println("Введите число");
        int inputNum = num.nextInt();
             if (inputNum > 0) {
            inputNum++;
            System.out.println("Условие положительное " + inputNum);
        }    else System.out.println("Условие отрицательное " + inputNum);
    }
}
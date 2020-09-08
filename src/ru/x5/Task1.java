package ru.x5;

import java.util.Scanner;

class Task1 {
    public static void make1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        double numbers = input.nextDouble();
        int lastNumber = (int) numbers;
        System.out.println("Последнее цифра " + lastNumber % 10);


    }
}

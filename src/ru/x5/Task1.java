package ru.x5;

import java.util.Scanner;

class Task1 {
    public static void make1() {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Введите число");
        double mass = numbers.nextDouble();
        int size = (int) mass;
        System.out.println("Последнее цифра " + size % 10);


    }
}

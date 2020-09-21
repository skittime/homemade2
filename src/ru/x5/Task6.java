package ru.x5;

import java.util.Scanner;

public class Task6 {
    int number;


    Task6() {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (number != 0) {
            numb();
            numbs();
        } else {
            System.out.println("Введено нулевое число!");
        }

    }


    public void numb() {

        if (number % 2 == 0) {
            System.out.print("Четное ");
        } else
            System.out.print("Неченое ");


    }

    public void numbs() {
        if (number < 0) {
            System.out.print("отрицательное");
        } else
            System.out.print("положительное");
        System.out.println(" ");

    }
}


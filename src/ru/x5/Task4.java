package ru.x5;

import java.util.Scanner;

public class Task4 {
    public static void make4() {
    }

    public void make() {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            number++;
            System.out.println("Введеное число больше 0 = " + number);
        } else if (number < 0) {
            number = number - 2;
            System.out.println("Введеное число меньше 0 " + number);

        } else {
            number = 10;
            System.out.println("Ответ " + number);
        }
    }
}

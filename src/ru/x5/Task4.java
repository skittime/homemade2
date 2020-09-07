package ru.x5;

import java.util.Scanner;

public class Task4 {
    public static void make4() {
    }

    public void make() {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int numbs = input.nextInt();

        if (numbs > 0) {
            numbs++;
            System.out.println("Введеное число больше 0 = " + numbs);
        } else if (numbs < 0) {
            numbs = numbs - 2;
            System.out.println("Введеное число меньше 0 " + numbs);

        } else {
            numbs = 10;
            System.out.println("Ответ " + numbs);
        }
    }
}

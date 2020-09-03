package ru.x5;

import java.util.Scanner;

public class Make4 {
    public Make4() {
        System.out.println("Введите число: ");
        Scanner num = new Scanner(System.in);
        int numbs = num.nextInt();

        if (numbs > 0) {
            numbs++;
            System.out.println("Ответ " + numbs);
        }
        else if (numbs < 0) {
            numbs = numbs - 2;
            System.out.println("Ответ " + numbs);

        }
        else {
            numbs = 10;
            System.out.println("Ответ " + numbs);
        }
    }
}

package ru.x5;

import java.util.Scanner;

public class Make3 {
    public Make3() {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число");
        int g = num.nextInt();
        if (g > 0) {
            g++;
            System.out.println("Условие положительное " + g);
        }
        else
        {
            System.out.println("Условие отрицательное " +g );
        }
    }
}
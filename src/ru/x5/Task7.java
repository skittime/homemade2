package ru.x5;

import java.util.Scanner;

public class Task7 {
    public static void make7() {
        System.out.println("Введите код города");
        Scanner num = new Scanner(System.in);
        int call = num.nextInt();
        double min, a;
        min = 10;
        switch (call) {
            case 905:
                a = 4.15;
                System.out.println("Москва. Стоимость разговора " + min * a + " руб.");
                break;
            case 194:
                a = 1.98;
                System.out.println("Ростов. Стоимость разговора " + min * a + " руб.");
                break;
            case 491:
                a = 2.69;
                System.out.println("Краснодар. Стоимость разговора " + min * a + " руб.");
                break;
            case 800:
                a = 5.00;
                System.out.println("Киров. Стоимость разговора " + min * a + " руб.");
                break;
            default:
                System.out.println("Введен неверный код");
                break;
        }


    }
}

  


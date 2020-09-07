package ru.x5;

import java.util.Scanner;

public class Task7 {
    public void make7() {
        System.out.println("Введите код города");
        Scanner num = new Scanner(System.in);
        int call = num.nextInt();

        switch (call) {
            case 905:
                double min;
                double a = 4.15;
                min = a * 10;
                System.out.println("Москва. Стоимость разговора " + min + " руб.");
                break;
            case 194:
                a = 1.98;
                min = a * 10;
                System.out.println("Ростов. Стоимость разговора " + min + " руб.");
                break;
            case 491:
                a = 2.69;
                min = a * 10;
                System.out.println("Краснодар. Стоимость разговора " + min + " руб.");
                break;
            case 800:
                a = 5.00;
                min = a * 10;
                System.out.println("Киров. Стоимость разговора " + min + " руб.");
                break;
            default:
                System.out.println("Введен неверный код");
                break;
        }


    }
}

  


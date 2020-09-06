package ru.x5;

import java.util.Scanner;

public class Make2 {
    public Make2(){

        Scanner number = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int summ = number.nextInt();
        int result = 0;
        while(summ != 0){
            result += (summ % 10);
            summ/=10;
        }
        System.out.println("Результат сложения " + result);
    }



    }


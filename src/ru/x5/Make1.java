package ru.x5;

import java.util.Scanner;

public class Make1 {
    public Make1(){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Укажите количество вводимых элементов");
        int size = numbers.nextInt();
        System.out.println("Введите элементы:");
        int nothing = numbers.nextInt();
        int[] array = new int[size];
        System.out.println(array.length -1);


    }
}

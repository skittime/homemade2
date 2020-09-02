package ru.x5;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Make2 {
    public Make2(){
        int i = 0;
        Scanner number = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int [] array = new int[3];
        array[i]= number.nextInt();
        System.out.print(IntStream.of(0, 1, 2).map(j -> array[j]).sum());
    }



    }


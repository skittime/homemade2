package ru.x5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер задачи которую требуется проверить:");
        System.out.println("1. текст");
        System.out.println("2. текст");
        System.out.println("3. текст");
        System.out.println("4. текст");
        System.out.println("5. текст");
        System.out.println("6. текст");
        System.out.println("7. текст");
        System.out.println("8. текст");
        System.out.println("9. текст");
        int number = input.nextInt();

        switch (number){
            case 1:
                Make1 result = new Make1();
                System.out.println(result);
                break;
            default:
                System.out.println("Выбор неверен");
        }




    }
}

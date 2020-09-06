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
                new Make1();
                break;
            case 2:
                new Make2();
                break;
            case 3:
                new Make3();
                break;
            case 4:
                new Make4();
                break;
            case 5:
                new Make5();
                break;
            case 6:
                new Make6();
                break;
            case 7:
                new Make7();
                break;
            case 8:
                new Make8();
                break;
            case 9:
                new Make9();
                break;
            case 10:
                new Make10();
                break;




            default:
                System.out.println("Выбор неверен");
        }




    }
}

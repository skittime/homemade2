package ru.x5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String  numMen;
        System.out.println("Введите номер задачи которую требуется проверить:");
        do {
            System.out.println("1. Задача 1");
            System.out.println("2. Задача 2");
            System.out.println("3. Задача 3");
            System.out.println("4. Задача 4");
            System.out.println("5. Задача 5");
            System.out.println("6. Задача 6");
            System.out.println("7. Задача 7");
            System.out.println("8. Задача 8");
            System.out.println("9. Задача 9");
            System.out.println("9. Задача 10");
            num = input.nextInt();

            switch (num) {
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
            }


        } while (num != 0);
        System.out.println("Выходим.....");
    }
}

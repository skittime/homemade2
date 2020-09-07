package ru.x5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        menuSelect("Введите номер задачи которую требуется проверить:");
        do {
            menuSelect("1. Задача 1");
            menuSelect("2. Задача 2");
            menuSelect("3. Задача 3");
            menuSelect("4. Задача 4");
            menuSelect("5. Задача 5");
            menuSelect("6. Задача 6");
            menuSelect("7. Задача 7");
            menuSelect("8. Задача 8");
            menuSelect("9. Задача 9");
            menuSelect("10. Задача 10");
            menuSelect("0. Выход 0");
            num = input.nextInt();

            switch (num) {
                case 1 -> Task1.make1();
                case 2 -> Task2.make2();
                case 3 -> Task3.make3();
                case 4 -> Task4.make4();
                case 5 -> Task5.make5();
                case 6 -> Task6.make6();
                case 7 -> Task7.make7();
                case 8 -> Task8.make8();
                case 9 -> Task9.make9();
                case 10 -> Task10.make10();
            }


        } while (num != 0);
        menuSelect("Выходим.....");
    }

    private static void menuSelect(String s) {
        System.out.println(s);
    }
}

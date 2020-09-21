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
                case 1 -> new Task1();
                case 2 -> new Task2();
                case 3 -> new Task3();
                case 4 -> new Task4();
                case 5 -> new Task5();
                case 6 -> new Task6();
                case 7 -> new Task7();
                case 8 -> new Task8();
                case 9 -> new Task9();
                case 10 -> new Task10();
            }


        } while (num != 0);
        menuSelect("Выходим.....");
    }

    private static void menuSelect(String s) {
        System.out.println(s);
    }
}

package ru.x5;

public class Task9 {
    public static void make9() {
        int[] mas = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        System.out.print("Массив в обратном порядке: ");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");

        }
        System.out.println("");
    }
}

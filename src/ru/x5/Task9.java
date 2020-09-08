package ru.x5;

public class Task9 {
    public static void make9() {
        int[] array1 = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] array2 = new int[array1.length];
        System.out.print("Массив в обратном порядке: ");

        for (int i = array1.length - 1; i >= 0; i--) {
            for (int j = 0; j < array2.length; j++) {
                array2[j] = array1[i];
            }
            System.out.print(array2[i] + " ");

        }
        System.out.println("");
    }
}

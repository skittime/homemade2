package ru.x5;

public class Task8 {


    public static void make8() {
        Task8.maximumOfArray();
        Task8.sumOfPositive();
        Task8.evenOfNegative();
        Task8.numberOfPositive();
        Task8.averageNegative();

    }

    static int numOfPos = 0, sumNegative = 0, numNegative = 0, maximum = 0;
    static double sumOfPos = 0, arrNegated = 0, average = 0;
    static int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};


    public static void maximumOfArray() {
        for (int j : array)
            if (maximum < j) {
                maximum = j;
            }
        System.out.println("Максимум = " + maximum);
    }

    public static void sumOfPositive() {

        for (int j : array)
            if (j > 0) {
                sumOfPos = j + sumOfPos;
            }
        System.out.println("Сумма положительных = " + sumOfPos);
    }

    public static void evenOfNegative() {
        for (int j : array) {
            if (j < 0) {
                int even;
                even = j % 2;
                if (even == 0) {
                    sumNegative = j + sumNegative;
                }
            }
        }
        System.out.println("Сумма четных отрицательных = " + sumNegative);
    }

    public static void numberOfPositive() {
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                numOfPos++;
            }
        }
        System.out.println("Количество положительных элементов = " + numOfPos);

    }

    public static void averageNegative() {
        for (int j = 0; j < array.length; j++)
            if (array[j] < 0) {
                numNegative++;
                arrNegated = arrNegated + array[j];
            }
        average = arrNegated / numNegative;
        System.out.println("Среднее арифметическое отрицательных = " + average);
    }

}




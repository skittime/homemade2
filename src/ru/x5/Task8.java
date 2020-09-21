package ru.x5;

public class Task8 {


    Task8() {
        maximumOfArray();
        sumOfPositive();
        evenOfNegative();
        numberOfPositive();
        averageNegative();

    }

    int numOfPos = 0, sumNegative = 0, numNegative = 0, maximum = 0;
    double sumOfPos = 0, arrNegated = 0, average = 0;
    int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};


    public void maximumOfArray() {
        for (int j : array)
            if (maximum < j) {
                maximum = j;
            }
        System.out.println("Максимум = " + maximum);
    }

    public void sumOfPositive() {

        for (int j : array)
            if (j > 0) {
                sumOfPos = j + sumOfPos;
            }
        System.out.println("Сумма положительных = " + sumOfPos);
    }

    public void evenOfNegative() {
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

    public void numberOfPositive() {
        for (int i : array) {
            if (i > 0) {
                numOfPos++;
            }
        }
        System.out.println("Количество положительных элементов = " + numOfPos);

    }

    public void averageNegative() {
        for (int i : array)
            if (i < 0) {
                numNegative++;
                arrNegated = arrNegated + i;
            }
        average = arrNegated / numNegative;
        System.out.println("Среднее арифметическое отрицательных = " + average);
    }

}




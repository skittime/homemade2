package ru.x5;

import java.util.ArrayList;

public class Make8 {
    public Make8() {
        int size =0, j =0 ,g= 0, d = 0, summ1 = 0 ;
        double summ =0;
        int[] array = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();

        for (int i=0;i<array.length; i++)
            if ( summ1 < array[i]){
                summ1 = array[i];
            }
        System.out.println("Максимум = " + summ1);


        for (int i=0;i<array.length; i++)
            if (array[i] > 0){
                summ = array[i] + summ;
            }
        System.out.println("Сумма положительных = " + summ);

        for (int i=0; i<array.length;i++)
            if (array[i] < 0)
            {
                int pos;
                pos = array[i]%2;
                if (pos == 0) {
                    g = array[i] + g;}
            }
        System.out.println("Сумма четных отрицательных = " + g);

        for (int i=0; i<array.length;i++)
            if (array[i] >0)
            {
                arrayList.add("array[i]");
                size = arrayList.size();
            }
        System.out.println("Количество положительных = " + size);
        for (int i=0; i<array.length;i++)
            if (array[i] < 0) {
                arrayList1.add("array[i]");
                d = d + array[i];
                size = arrayList1.size();
                summ = d / size;
            }
        System.out.println("Среднее арифметическое отрицательных = "+summ);


    }
}


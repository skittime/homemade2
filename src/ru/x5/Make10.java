package ru.x5;

import java.util.ArrayList;
import java.util.Arrays;

public class Make10 {
    public Make10() {

        int[] mas ={15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int [] mas1 = new int[mas.length];
        int temp;

        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] == 0)
            {
                for (int j = i + 1; j < mas.length; j++)
                {
                    if (mas[j] != 0)
                    {
                        temp = mas[j];
                        mas[j] = mas[i];
                        mas[i] = temp;
                        break;
                    }
                }
            }
        } System.out.println(Arrays.toString(mas) +"; ");


            }
        }



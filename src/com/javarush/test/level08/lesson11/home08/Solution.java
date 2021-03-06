package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    { int temp;
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i; j < array.length; j++)
            {
                if (array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }
            }
        }
        //напишите тут ваш код
    }
}


/*
1
4
3
5
6
7
3
87
5
23
67
9
6
7
9
32
56
76
32
5
 */
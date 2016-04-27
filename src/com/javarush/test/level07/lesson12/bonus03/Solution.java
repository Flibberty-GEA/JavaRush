package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i] >= array[j]){
                    int tmp = array[i]; //сравниваем попарно все с первой tmp — самая большая текущая
                    array[i] = array[j]; //на i — том месте самая маленькая
                    array[j] = tmp; //на j том месте самя большая
                }
            }
        }
        //напишите тут ваш код
    }
}
/*
1
2
3
4
20
6
7
8
9
10
11
12
13
14
15
16
17
18
19
5
 */
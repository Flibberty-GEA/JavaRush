package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }
    public static int max(int max, int number){
        if(max<number)max=number;
        return max;
    }
    public static long max(long max, long number){
        if(max<number)max=number;
        return max;
    }
    public static double max(double max, double number){
        if(max<number)max=number;
        return max;
    }

    //Напишите тут ваши методы
}

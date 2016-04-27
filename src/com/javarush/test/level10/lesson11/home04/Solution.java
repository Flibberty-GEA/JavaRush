package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        char[] str = s.toCharArray();
        ArrayList<Character> strList =  new ArrayList<Character>();

        for (int i = 0; i < str.length; i++)
        {
            strList.add(str[i]);
        }
        for (int i = 0; i < 40; i++)
        {
            for (Character ch:strList){
                System.out.print(ch);
            }
            strList.remove(0);
            System.out.println("");
        }

        //напишите тут ваш код
    }

}

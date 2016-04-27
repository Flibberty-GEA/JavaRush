package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        List<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthName = reader.readLine();

        for (int i=0; i<months.size(); i++){
            if (months.get(i).equals(monthName)){
                System.out.println(months.get(i)+" is "+(i+1)+" month");
            }
        }
        //напишите тут ваш код
    }

}

package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

/*javarush.ru/alpha/index.html?lvl=15&view&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&oobj=3.0&obj=1&obj=2.3&obj=aaa

lvl view name obj name obj oobj obj obj obj

double 3.14

String djsdcd

double 1.0

double 2.3

String aaa*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String afterQuery = url.substring(url.indexOf("?")+1);
//        System.out.println(afterQuery);
        String [] parameters = afterQuery.split("(\\&+)|(\\?+)");
/*        for (int i = 0; i < parameters.length; i++)
        {
            System.out.println(parameters[i]);
        }*/
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        for (int i = 0; i < parameters.length; i++)
        {
            list.add(parameters[i]);
        }

        for (int i = 0; i < list.size(); i++)
        {
            String str[] = list.get(i).split("=");
            list2.add(str[0]);
            System.out.print(list2.get(i) + " ");
        }
        System.out.println("");
        for (int i = 0; i < list.size(); i++)
        {
            String str[] = list.get(i).split("=");
            try
            {
                if (str[0].equals("obj"))
                {
                    if(isNumber(str[1]))
                    {
                        alert(Double.parseDouble(str[1]));
                    }else{
                        alert(str[1]);
                    }

                }
            }catch(ArrayIndexOutOfBoundsException e){

            }
            }
        }
        //add your code here

    public static boolean isNumber(String str){
        double d = 0;
        try{
            d = Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}

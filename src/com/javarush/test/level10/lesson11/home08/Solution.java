package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] array = new ArrayList[4];
        ArrayList<String> listOne = new ArrayList<String>();
        ArrayList<String> listTwo = new ArrayList<String>();
        ArrayList<String> listThree = new ArrayList<String>();
        ArrayList<String> listFour = new ArrayList<String>();

        listOne.add("One");
        listTwo.add("Two");
        listThree.add("Three");
        listFour.add("Four");

        array[0]=listOne;
        array[1]=listTwo;
        array[2]=listThree;
        array[3]=listFour;

        return array;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}
package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {

        Map<String,Cat> mapCat = new HashMap<String, Cat>();
        mapCat.put("Vaska1", new Cat("Vaska1"));
        mapCat.put("Vaska2", new Cat("Vaska2"));
        mapCat.put("Vaska3", new Cat("Vaska3"));
        mapCat.put("Vaska4", new Cat("Vaska4"));
        mapCat.put("Vaska5", new Cat("Vaska5"));
        mapCat.put("Vaska6", new Cat("Vaska6"));
        mapCat.put("Vaska7", new Cat("Vaska7"));
        mapCat.put("Vaska8", new Cat("Vaska8"));
        mapCat.put("Vaska9", new Cat("Vaska9"));
        mapCat.put("Vaska0", new Cat("Vaska0"));
        return mapCat;


        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> cats = new HashSet<Cat>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Cat> pair = iterator.next();
            cats.add(pair.getValue());
        }//напишите тут ваш код
        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}

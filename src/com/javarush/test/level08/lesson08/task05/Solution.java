package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,String>map=createMap();
        removeTheFirstNameDuplicates(map);
        for(Map.Entry<String,String>x:map.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String>map = new HashMap<String, String>();
        map.put("Фамилия1", "Алла");
        map.put("Фамилия2", "Николай");
        map.put("Фамилия3", "Никита");
        map.put("Фамилия4", "Антон");
        map.put("Фамилия5", "Сосо");
        map.put("Фамилия6", "Влад");
        map.put("Фамилия7", "Влад");
        map.put("Фамилия8", "Никита");
        map.put("Фамилия9", "Жанна");
        map.put("Фамилия10", "Джордж");
        return map; //напишите тут ваш код

    }


    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        ArrayList<String> values = new ArrayList<String>(map.values());
        for(String a: values){
            int count = 0;
            for(int i =0; i < values.size(); i++){
                if(a.equals(values.get(i))){
                    count++;
                }
                if(count>1){
                    removeItemFromMapByValue(map,a);
                }
            }

        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
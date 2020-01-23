package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Шварценеггер", dateFormat.parse("OCT 1 2012"));
        map.put("Стетхем", dateFormat.parse("AUG 1 2012"));
        map.put("Уиллис", dateFormat.parse("JUL 1 2012"));
        map.put("Ли", dateFormat.parse("JUN 1 2012"));
        map.put("Лунгрен", dateFormat.parse("JAN 1 2012"));
        map.put("Вандамм", dateFormat.parse("SEP 1 2012"));
        map.put("Норрис", dateFormat.parse("NOV 1 2012"));
        map.put("Джет Ли", dateFormat.parse("MAY 1 2012"));
        map.put("Де Ниро", dateFormat.parse("MAY 1 2012"));


        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();            //ключ
            Date value = pair.getValue();        //значение
//            System.out.println(key + " " +  value.getMonth());
            if (value.getMonth()>=5 && value.getMonth()<=7){
                iterator.remove();
            }
        }
//        System.out.println();
//        Iterator<Map.Entry<String, Date>> iterator2 = map.entrySet().iterator();
//        while (iterator2.hasNext())
//        {
//            //получение «пары» элементов
//            Map.Entry<String, Date> pair = iterator2.next();
//            String key = pair.getKey();            //ключ
//            Date value = pair.getValue();        //значение
//            System.out.println(key + " " +  value.getMonth());
//        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);

    }
}

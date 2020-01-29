package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap();
        map.put("Маликов", 111);
        map.put("Раецкян", 222);
        map.put("Горбатюк", 333);
        map.put("Раецкий", 444);
        map.put("Сам", 555);
        map.put("Жалилов", 666);
        map.put("Кандауров", 7777);
        map.put("Чухрий", 888);
        map.put("Петренко", 999);
        map.put("Яковлев", 1000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();            //ключ
            Integer value = pair.getValue();        //значение
//            System.out.println(key + " " +  value.getMonth());
            if (value < 500 ){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
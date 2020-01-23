package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap();
        map.put("Маликов", "Павел");
        map.put("Раецкян", "Павел");
        map.put("Горбатюк", "Павел");
        map.put("Раецкий", "Роман");
        map.put("Сам", "Виктор");
        map.put("Жалилов", "Азиз");
        map.put("Кандауров", "Сергей");
        map.put("Чухрий", "Дмитрий");
        map.put("Петренко", "Катя");
        map.put("Яковлев", "Сергей");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map<String, String> tempMap = new HashMap();
        Set<String> set = new HashSet<String>();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            if (tempMap.containsValue(value)){
                set.add(value);
            } else tempMap.put(key, value);
        }
        for (String text : set)
        {
            removeItemFromMapByValue(map, text);
        }
        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();



//        while (iterator2.hasNext())
//        {
//            Map.Entry<String, String> pair = iterator2.next();
//            String key = pair.getKey();
//            String value = pair.getValue();
//            System.out.println(key + " " +  value);
//        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> peopleMap = createMap();
        removeTheFirstNameDuplicates(peopleMap);
    }
}

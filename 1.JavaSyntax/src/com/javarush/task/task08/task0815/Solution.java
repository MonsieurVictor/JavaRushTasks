package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countFirstName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                countFirstName++;
            }
        }
        return countFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countSecondName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                countSecondName++;
            }
        }
        return countSecondName;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
//        System.out.println(getCountTheSameFirstName(map, "Павел"));
//        System.out.println(getCountTheSameLastName(map, "Раецкий"));
    }
}

package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> catMap = new HashMap<>();
        Cat cat1 = new Cat("Vasya1");
        Cat cat2 = new Cat("Vasya2");
        Cat cat3 = new Cat("Vasya3");
        Cat cat4 = new Cat("Vasya4");
        Cat cat5 = new Cat("Vasya5");
        Cat cat6 = new Cat("Vasya6");
        Cat cat7 = new Cat("Vasya7");
        Cat cat8 = new Cat("Vasya8");
        Cat cat9 = new Cat("Vasya9");
        Cat cat10 = new Cat("Vasya10");

        catMap.put(cat1.name, cat1);
        catMap.put(cat2.name, cat2);
        catMap.put(cat3.name, cat3);
        catMap.put(cat4.name, cat4);
        catMap.put(cat5.name, cat5);
        catMap.put(cat6.name, cat6);
        catMap.put(cat7.name, cat7);
        catMap.put(cat8.name, cat8);
        catMap.put(cat9.name, cat9);
        catMap.put(cat10.name, cat10);

        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<>();
        for (Map.Entry<String, Cat> entry : map.entrySet()) {
            catSet.add(entry.getValue());
        }
        return catSet;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

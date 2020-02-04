package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> listCars = new ArrayList<String>();
        ArrayList<String> listTrucks = new ArrayList<String>();
        listCars.add("Zhiguli");
        listCars.add("Mercedes");
        listTrucks.add("Kamaz");
        listTrucks.add("Belaz");

        ArrayList<String> [] list = new ArrayList[2];
        list[0]= listCars;
        list[1]= listTrucks;


        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
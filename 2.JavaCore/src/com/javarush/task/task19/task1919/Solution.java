package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import javafx.collections.transformation.SortedList;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        Reader fileReader = new FileReader(args[0]);
        BufferedReader buffReader = new BufferedReader(fileReader);
        String str = new String();
        SortedMap <String, Double> nameSalaryMap = new TreeMap();
        while (buffReader.ready()) {

            str = buffReader.readLine();
            String[] strArray = str.split(" ");
            if (nameSalaryMap.containsKey(strArray[0])){
                nameSalaryMap.put (strArray[0], nameSalaryMap.get(strArray[0]) + Double.valueOf(strArray[1]));
            } else {
                nameSalaryMap.put(strArray[0], Double.valueOf(strArray[1]));
            }
        }

        Iterator iterator = nameSalaryMap.keySet().iterator();
        while(iterator.hasNext()) {
            String key   = (String) iterator.next();
            Double value = nameSalaryMap.get(key);
            System.out.println(key + " " +  value);
        }

        fileReader.close();
        buffReader.close();
    }
}

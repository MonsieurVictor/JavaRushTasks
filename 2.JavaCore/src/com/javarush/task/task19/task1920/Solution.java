package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {


        Reader fileReader = new FileReader(args[0]);
        BufferedReader buffReader = new BufferedReader(fileReader);
        String str = new String();
        Map<String, Double> nameSalaryMap = new TreeMap();
        while (buffReader.ready()) {

            str = buffReader.readLine();
            String[] strArray = str.split(" ");
            if (nameSalaryMap.containsKey(strArray[0])) {
                nameSalaryMap.put(strArray[0], nameSalaryMap.get(strArray[0]) + Double.valueOf(strArray[1]));
            } else {
                nameSalaryMap.put(strArray[0], Double.valueOf(strArray[1]));
            }
        }

        Map <String, Double> newSortedByValueMap = sortByValue(nameSalaryMap);

        Iterator iterator = newSortedByValueMap.keySet().iterator();
        Double maxValue = null;
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            Double value = nameSalaryMap.get(key);
            if (maxValue == null){
                maxValue = value;
            } else if (!maxValue.equals(value)) {
                break;
            }
            System.out.println(key);
        }

        fileReader.close();
        buffReader.close();
    }

    public static Map<String, Double> sortByValue(final Map<String, Double> wordCounts) {
        return wordCounts.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Double>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}


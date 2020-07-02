package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map <Integer, Integer> rawBytesMap = new LinkedHashMap<>();
        String path = reader.readLine();
        FileInputStream inputStream = new FileInputStream(path);
        while (inputStream.available() > 0){
            int currentByte = inputStream.read(); //прочитать очередной байт
            if (rawBytesMap.containsKey(currentByte)) {
                rawBytesMap.put(currentByte, rawBytesMap.get(currentByte) + 1);
            } else rawBytesMap.put(currentByte, 1);
        }
        inputStream.close(); // закрываем поток
        Iterator iterator = rawBytesMap.entrySet().iterator();
        Map.Entry mapElement = (Map.Entry)iterator.next();
        int minKey = (int) mapElement.getValue();
        while (iterator.hasNext()) {
            mapElement = (Map.Entry) iterator.next();
            int currentKey = (int) mapElement.getValue();
            if (currentKey < minKey) {
                minKey = currentKey;
            }
        }
        iterator = rawBytesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            mapElement = (Map.Entry) iterator.next();
            int currentKey = (int) mapElement.getValue();
            if (currentKey == minKey) {
                System.out.print(mapElement.getKey() + " ");
            }
        }
    }
}

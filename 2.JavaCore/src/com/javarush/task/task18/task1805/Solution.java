package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        Set <Integer> rawBytesTree = new TreeSet<>();

        FileInputStream inputStream = new FileInputStream(path);
        while (inputStream.available() > 0){
            int currentByte = inputStream.read(); //прочитать очередной байт
            if (!rawBytesTree.contains(currentByte)) {
                rawBytesTree.add(currentByte);
            }
        }
        inputStream.close(); // закрываем поток

        for (Integer intByte : rawBytesTree){
            System.out.print(intByte + " ");
        }
    }
}

package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        Map treeMap = new TreeMap<Integer, Integer>();
        while (inputStream.available()>0){
            int symbol = inputStream.read();
            if (treeMap.containsKey(symbol)){
                treeMap.put(symbol, (int)treeMap.get(symbol) + 1);
            } else treeMap.put(symbol, 1);
        }
        Set<Integer> set1 = treeMap.keySet();
        for(Integer key : set1) {
            System.out.println((char)(int) key + " "  + treeMap.get(key));
        }
        inputStream.close();
    }
}

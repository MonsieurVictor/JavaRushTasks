package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put (0, "ноль");
        map.put (1, "один");
        map.put (2, "два");
        map.put (3, "три");
        map.put (4, "четыре");
        map.put (5, "пять");
        map.put (6, "шесть");
        map.put (7, "семь");
        map.put (8, "восемь");
        map.put (9, "девять");
        map.put (10, "десять");
        map.put (11, "одиннадцать");
        map.put (12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        Reader fileReader = new FileReader(filePath);
        BufferedReader buffReader = new BufferedReader(fileReader);
        while (buffReader.ready()) {
            String str = buffReader.readLine();
            String[] strArray = str.split(" ");
            String fixedStr = "";
            for (int i = 0; i < strArray.length; i++){
                String word = strArray[i];
                try {
                    if (map.containsKey(Integer.valueOf(word))) {
                        word = map.get(Integer.valueOf(word));
                    }
                } catch (Exception e){

                }
                fixedStr += word;
                if (i < strArray.length - 1){
                    fixedStr += " ";
                }
            }
            System.out.println(fixedStr);
        }

        reader.close();
        fileReader.close();
        buffReader.close();
    }
}

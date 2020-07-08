package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader(args[0]);
        BufferedReader buffReader = new BufferedReader(fileReader);
        Writer fileWriter = new FileWriter(args[1]);

        while (buffReader.ready()) {
            String str = buffReader.readLine();
            String[] strArray = str.split(" ");
            for (String word : strArray){
                if (!word.matches("^\\D*$")){
                    fileWriter.write(word + " ");
                }
            }
        }
        fileReader.close();
        buffReader.close();
        fileWriter.close();
    }
}

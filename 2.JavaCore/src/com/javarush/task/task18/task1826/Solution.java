package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        while (inputStream.available()>0){
            int symbol = inputStream.read();
            if(args[0].equals("-e")) {
                outputStream.write(symbol + 1);
            } else if (args[0].equals("-d")) {
                outputStream.write(symbol - 1);
            }
        }
        inputStream.close();
        outputStream.close();
    }
}

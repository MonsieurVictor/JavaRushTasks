package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.nio.charset.Charset;

public class Solution {
    public static void main(String[] args) {
        int id = Integer.valueOf(args[0]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String path = reader.readLine();
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(path)));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(" ");
                if (strings[0].equals(id)){
                    System.out.println(line);
                    break;
                }
            }
            reader.close();
        } catch (IOException e) {

        }

    }
}

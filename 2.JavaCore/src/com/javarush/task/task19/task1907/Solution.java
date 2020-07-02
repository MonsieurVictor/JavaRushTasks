package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(firstFile);
        int i = 0;
        String str = "";
        while (fileReader.ready()){
            int data = fileReader.read(); //читаем один символ (char будет расширен до int)
            if (data>= 97 && data <= 122){
               str = str + (char)data;

            } else {
                if (str.equals("world")){
                    i++;
                }
                str = "";
            }
        }
        if (str.equals("world")){
            i++;
        }
        fileReader.close();
        System.out.println(i);
    }
}

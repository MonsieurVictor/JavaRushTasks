package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(firstFile);
        FileWriter fileWriter = new FileWriter(secondFile);
        int i = 0;
        while (fileReader.ready()){
            i++;
            int data = fileReader.read(); //читаем один символ (char будет расширен до int)
            if (i%2== 0){
                fileWriter.write(data); //пишем один символ (int будет обрезан/сужен до char)
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}

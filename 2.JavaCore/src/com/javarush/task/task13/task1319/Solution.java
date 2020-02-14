package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = reader.readLine();


        try {
            File file = new File(outputPath);
            FileWriter fileWriter = new FileWriter(file); // поток, который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter

            while (true){
                String str = reader.readLine();
                bufferedWriter.write(str + "\n");
                if (str.equals("exit")){
                    break;
                }
            }


            bufferedWriter.close();
            fileWriter.close();// закрываем поток
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

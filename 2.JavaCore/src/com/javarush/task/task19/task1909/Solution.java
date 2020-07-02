package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathToRead = reader.readLine();
        String pathToWrite = reader.readLine();
        reader.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToRead));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToWrite));
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            String str2 = str.replaceAll("\\p{Punct}", "");
            bufferedWriter.write(str2);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}

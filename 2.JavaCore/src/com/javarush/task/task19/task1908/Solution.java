package com.javarush.task.task19.task1908;

/* 
Выделяем числа
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
        String word = "";
        while ((str = bufferedReader.readLine()) != null) {
            String[] strArr = str.split(" ");
            for (String strArrPart : strArr) {
                char[] charArr = strArrPart.toCharArray();
                for (char ch : charArr) {
                    if (ch >= 48 && ch <= 57) {
                        word = word + ch;
                    } else {
                        word = "";
                        break;
                    }
                }
                if (!word.isEmpty()) {
                    bufferedWriter.write(word + " ");
                }
                word = "";
            }
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}

package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        Reader fileReader = new FileReader(filePath);
        BufferedReader buffReader = new BufferedReader(fileReader);
        while (buffReader.ready()) {

            String str = buffReader.readLine();
            String reversedStr = "";
            char[] charArray = str.toCharArray();
            for (int i = charArray.length - 1 ; i >= 0 ; i--){
                reversedStr += charArray[i];
            }

            System.out.println(reversedStr);
        }

        reader.close();
        fileReader.close();
        buffReader.close();
    }
}

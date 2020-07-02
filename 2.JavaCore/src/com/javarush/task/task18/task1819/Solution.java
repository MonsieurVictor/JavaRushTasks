package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();
        FileInputStream inputStream1= new FileInputStream(path1);
        FileInputStream inputStream2 = new FileInputStream(path2);
        byte [] bufferFile1 = null;
        byte [] bufferFile2 = null;
        int count1 = 0;
        int count2 = 0;

        if (inputStream1.available() > 0) {
            bufferFile1 = new byte[inputStream1.available()];
            count1 = inputStream1.read(bufferFile1);
        }
        inputStream1.close();

        if (inputStream2.available() > 0) {
            bufferFile2 = new byte[inputStream2.available()];
            count2 = inputStream2.read(bufferFile2);
        }
        inputStream2.close();

        FileOutputStream outputStream1= new FileOutputStream(path1);

        outputStream1.write(bufferFile2, 0, count2);
        outputStream1.write(bufferFile1, 0, count1);



        outputStream1.close();
    }
}

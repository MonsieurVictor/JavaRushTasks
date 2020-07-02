package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();
        String path3 = reader.readLine();
        FileInputStream inputStream1= new FileInputStream( path1);
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream2 = new FileOutputStream(path2);
        FileOutputStream outputStream3 = new FileOutputStream(path3);
        if (inputStream1.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream1.available() / 2 + inputStream1.available()%2];
            int count = inputStream1.read(buffer);
            outputStream2.write(buffer, 0, count);
            buffer = new byte[inputStream1.available()];
            count = inputStream1.read(buffer);
            outputStream3.write(buffer, 0, count);
        }
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();
    }
}

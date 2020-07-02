package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();
        String path3 = reader.readLine();
        FileOutputStream outputStream1= new FileOutputStream(path1, true);
        FileInputStream inputStream2 = new FileInputStream(path2);
        FileInputStream inputStream3 = new FileInputStream(path3);


        if (inputStream2.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream2.available()];
            int count = inputStream2.read(buffer);
            outputStream1.write(buffer, 0, count);
            buffer = new byte[inputStream3.available()];
            count = inputStream3.read(buffer);
            outputStream1.write(buffer, 0, count);
        }

        outputStream1.close();
        inputStream2.close();
        inputStream3.close();
    }
}

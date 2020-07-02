package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();
        FileInputStream inputStream= new FileInputStream(path1);
        FileOutputStream outputStream = new FileOutputStream(path2);
        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            byte[] newBuffer = new byte[buffer.length];
            int count = inputStream.read(buffer);
            for (int i = 0; i < buffer.length; i++){
                newBuffer[i] = buffer[buffer.length - i - 1];
            }

            outputStream.write(newBuffer, 0, count);
        }
        inputStream.close();
        outputStream.close();
    }
}

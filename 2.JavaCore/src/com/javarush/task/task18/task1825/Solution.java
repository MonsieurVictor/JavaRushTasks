package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path;
        Set <String> pathsSet = new TreeSet<>();

        while (!(path = reader.readLine()).equals("end")){
            pathsSet.add(path);
        }
        reader.close();

        for (String everyPath: pathsSet) {
            FileInputStream fileInputStream = new FileInputStream(everyPath);
            if (fileInputStream.available() > 0) {
                String[] fileNameParts = everyPath.split("\\.part");
                FileOutputStream fileOutputStream = new FileOutputStream(fileNameParts[0],true);
                byte[] buffer = new byte[fileInputStream.available()];
                int count = fileInputStream.read(buffer);
                fileOutputStream.write(buffer, 0, count);
                fileOutputStream.close();
            }
            fileInputStream.close();
        }
    }
}

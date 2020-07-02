package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<FileInputStream> fileInputStreamList = new ArrayList<>();
        String path = null;

        try {
            while (true) {
                path = reader.readLine();
                fileInputStreamList.add(new FileInputStream(path));
            }
        } catch (FileNotFoundException e) {
            System.out.println(path);
        }
        for (FileInputStream fileInputstream: fileInputStreamList) {
            fileInputstream.close();
        }
    }
}

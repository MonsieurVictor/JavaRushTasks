package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        InputStream inStream = new FileInputStream(path);
        BufferedReader bif = new BufferedReader(new InputStreamReader(inStream));
        String line;
        while ((line = bif.readLine()) != null) {
            System.out.println(line);
        }
        bif.close();
        inStream.close();
    }
}

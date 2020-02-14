package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        InputStream inStream = new FileInputStream(path);
        BufferedReader bif = new BufferedReader(new InputStreamReader(inStream));
        List<Integer> integerList = new ArrayList<>();
        String line;
        while ((line = bif.readLine()) != null) {
//            System.out.println(line);
            int i = Integer.parseInt(line);
            if (i % 2  == 0){
                integerList.add(i);
            }
        }
        bif.close();
        inStream.close();

        Collections.sort(integerList);
        for (int i : integerList){
            System.out.println(i);
        }
    }
}

package com.javarush.task.task19.task1922;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        Reader fileReader = new FileReader(filePath);
        BufferedReader buffReader = new BufferedReader(fileReader);
        List <String> appropriateStrings = new ArrayList();

        while (buffReader.ready()) {
            int numberOfMatches = 0;
            String str = buffReader.readLine();
            String[] strArray = str.split(" ");
            for(String s : strArray){
                if (words.contains(s)){
                    numberOfMatches++;
                }

            }
            if (numberOfMatches==2){
                appropriateStrings.add(str);
            }
        }
        for (String s : appropriateStrings){
            System.out.println(s);
        }

        reader.close();
        fileReader.close();
        buffReader.close();

    }
}

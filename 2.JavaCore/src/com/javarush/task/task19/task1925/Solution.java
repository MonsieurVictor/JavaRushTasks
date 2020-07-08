package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader(args[0]);
        BufferedReader buffReader = new BufferedReader(fileReader);
        Writer fileWriter = new FileWriter(args[1]);
        List<String> strList = new ArrayList<>();

        while (buffReader.ready()) {
            String str = buffReader.readLine();
            String[] strArray = str.split(" ");
            for (int i = 0; i < strArray.length; i++){
                String word = strArray[i];
                if (word.length() > 6){
                    strList.add(word);
                }
            }
        }
        for (int i = 0; i < strList.size(); i++) {
            String longWord = strList.get(i);
            if (i < strList.size() - 1) {
                longWord += ",";
            }
            fileWriter.write(longWord);
        }

        fileReader.close();
        buffReader.close();
        fileWriter.close();
    }
}

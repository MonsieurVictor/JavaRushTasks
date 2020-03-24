package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static void main(String[] args) {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String path1 = reader.readLine();
            String path2 = reader.readLine();
            reader.close();

            Files.lines(Paths.get(path1), StandardCharsets.UTF_8).forEach(allLines::add);
            Files.lines(Paths.get(path2), StandardCharsets.UTF_8).forEach(forRemoveLines::add);



            solution.joinData();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}

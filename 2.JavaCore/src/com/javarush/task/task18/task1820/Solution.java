package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path1 = reader.readLine();
        String path2 = reader.readLine();

        reader = new BufferedReader(new FileReader(path1));
        String num = reader.readLine();
        String[] nums = num.split(" ");

        BufferedWriter writer = new BufferedWriter(new FileWriter(path2));
        for (int i = 0; i < nums.length; i++) {
            writer.write(Math.round(Double.parseDouble(nums[i]))+" ");
        }
        reader.close();
        writer.close();
    }
}

package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List <Integer> numbersList = new ArrayList();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                int i = Integer.parseInt(reader.readLine());
                numbersList.add(i);
            }
        } catch (NumberFormatException e) {
            for (int i : numbersList){
                System.out.println(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

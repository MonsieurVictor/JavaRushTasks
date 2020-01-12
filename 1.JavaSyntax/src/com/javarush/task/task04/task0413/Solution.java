package com.javarush.task.task04.task0413;

/*
День недели
*/

        import java.io.*;
        import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        String [] dayOfTheWeekArray = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 7; i++) {
            String sNumber = reader.readLine();
            int number = Integer.parseInt(sNumber);
            if (number >= 1 && number <= 7) {
                System.out.println(dayOfTheWeekArray[number - 1]);
            } else {
                System.out.println("такого дня недели не существует");
            }
        }
    }
}
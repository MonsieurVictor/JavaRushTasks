package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = reader.readLine();
        SimpleDateFormat formatInput = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = formatInput.parse(inputStr);
//        System.out.println(date);
        SimpleDateFormat formatOutput = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String outputStr = formatOutput.format(date).toUpperCase();
        System.out.println(outputStr);
    }
}

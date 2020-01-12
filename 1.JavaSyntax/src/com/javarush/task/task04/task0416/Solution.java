package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        Double number = Double.parseDouble(sNumber);
        number = number % 5;
        if (number < 3){
            System.out.println("зеленый");
        } else if (number >= 3 && number < 4) {
            System.out.println ("желтый");
        } else System.out.println ("красный");
    }
}
package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a, b, c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        a = Integer.parseInt(sNumber);
        sNumber = reader.readLine();
        b = Integer.parseInt(sNumber);
        sNumber = reader.readLine();
        c = Integer.parseInt(sNumber);
        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    System.out.println("Треугольник существует.");
                }
                else System.out.println("Треугольник не существует.");
            }
            else System.out.println("Треугольник не существует.");
        }
        else System.out.println("Треугольник не существует.");
//        if (a == 2) {
//            if (b == 3) {
//                if (c == 4) {
//                    System.out.println("Треугольник существует.");
//                }
//            }
//        }

    }
}
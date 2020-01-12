package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if (a == b && a == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (a == c) {
            System.out.println(a + " " + c);
        } else if (b == c) {
            System.out.println(b + " " + c);
        }
    }
}
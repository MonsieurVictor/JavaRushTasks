package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) throws Exception {
        BigInteger number = BigInteger.ONE;
        if (n>=0) {
            for (int i = 1; i <= n; i++) {
                number = number.multiply(BigInteger.valueOf(i));

            }
            return String.valueOf(number);
        } else return String.valueOf(0);


    }
}

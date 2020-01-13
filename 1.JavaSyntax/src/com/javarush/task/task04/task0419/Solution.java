package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int [] intArray = new int [4];
        for (int i = 0; i < 4; i++){
            String strNumber = reader.readLine();
            intArray[i] = Integer.parseInt(strNumber);
        }   
        int min = intArray[0];
        for (int number : intArray){
            if (min > number){
                min = number;
            }
        }
        System.out.println(min);
    }
}

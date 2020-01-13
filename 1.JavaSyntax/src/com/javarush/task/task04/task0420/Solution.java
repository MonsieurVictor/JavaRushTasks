package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strNumber = reader.readLine();
        int a = Integer.parseInt(strNumber);
        strNumber = reader.readLine();
        int b = Integer.parseInt(strNumber);
        strNumber = reader.readLine();
        int c = Integer.parseInt(strNumber);
        
        int firstNum, secondNum, thirdNum, buffer;
        
        firstNum = a;
        secondNum = b;
        thirdNum = c;
        
        if (a > b) {
            if (a > c) {
                firstNum = a;
            }
            else {
                firstNum = c;
                thirdNum = a;
            }
        } else if (b > c) {
                firstNum = b;
                secondNum = a;
            }
            else {
                firstNum = c;
                thirdNum = a;
            }
            
        if (secondNum > thirdNum){
        } else {
            buffer = secondNum;
            secondNum = thirdNum;
            thirdNum = buffer;
        } 
        System.out.println(firstNum + " " + secondNum + " " + thirdNum);
    }
}

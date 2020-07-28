package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
//            String str = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
            String objValue = null;
            String [] strArray;
            strArray = str.split("\\?");
            if (strArray.length == 2){
                String parametersStr = strArray[1];
                String [] parameterArray = parametersStr.split("\\&");
                for (int i = 0; i < parameterArray.length; i++){
                    String oneParameter = parameterArray[i];
                    String parameterKey = oneParameter.split("\\=")[0];
                    System.out.print(parameterKey + " ");
                    if(parameterKey.equals("obj")){
                        objValue = oneParameter.split("\\=")[1];
                    }
                }
                System.out.println();
                try {
                    Double doubleValue = Double.parseDouble(objValue);
                    alert(doubleValue);
                } catch (NumberFormatException e){
                    alert(objValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

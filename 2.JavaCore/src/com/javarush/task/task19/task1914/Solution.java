package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out; //запоминаем настоящий PrintStream в специальную переменную
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //Создаем динамический массив
        PrintStream stream = new PrintStream(outputStream);         //создаем адаптер к классу PrintStream
        System.setOut(stream);         //Устанавливаем его как текущий System.out
        testString.printSomething();
        String moddedString = outputStream.toString();
        System.setOut(consoleStream);         //Возвращаем все как было
        StringBuilder stringBuilder = new StringBuilder(moddedString);
        String [] arrayString = stringBuilder.toString().split(" ");
        int arithmeticResult = 0;
        char arithmeticSymbol = arrayString[1].charAt(0);
        switch (arrayString[1].charAt(0)){
            case ('+'):{
                arithmeticResult = Integer.valueOf(arrayString[0]) + Integer.valueOf(arrayString[2]);
                break;
            }
            case ('-'):{
                arithmeticResult = Integer.valueOf(arrayString[0]) - Integer.valueOf(arrayString[2]);
                break;
            }
            case ('*'):{
                arithmeticResult = Integer.valueOf(arrayString[0]) * Integer.valueOf(arrayString[2]);
                break;
            }

        }
        System.out.println(arrayString[0] + " " + arithmeticSymbol + " " + arrayString[2] + " = " + arithmeticResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


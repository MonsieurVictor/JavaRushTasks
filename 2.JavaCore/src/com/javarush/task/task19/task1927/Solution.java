package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/


import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream consoleStream = System.out; //запоминаем настоящий PrintStream в специальную переменную
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //Создаем динамический массив
        PrintStream stream = new PrintStream(outputStream);         //создаем адаптер к классу PrintStream
        System.setOut(stream);         //Устанавливаем его как текущий System.out
        testString.printSomething();
        String result = outputStream.toString();
        StringBuilder stringBuilder = new StringBuilder(result);
        String moddedString = stringBuilder.toString();
        String newStr = "";
        String [] strArray = moddedString.split(System.lineSeparator());
        for (int i = 0; i < strArray.length; i++){
            String str = strArray[i];
            newStr += str + System.lineSeparator();
            if (i % 2 == 1){
                newStr += "JavaRush - курсы Java онлайн" + System.lineSeparator();
            }
        }
        System.setOut(consoleStream);         //Возвращаем все как было
        System.out.println(newStr);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}

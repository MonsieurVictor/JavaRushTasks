package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathToWrite = reader.readLine();
        reader.close();
        FileOutputStream fileOutputStream = new FileOutputStream(pathToWrite);
        PrintStream consoleStream = System.out; //запоминаем настоящий PrintStream в специальную переменную
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //Создаем динамический массив
        PrintStream stream = new PrintStream(outputStream);         //создаем адаптер к классу PrintStream
        System.setOut(stream);         //Устанавливаем его как текущий System.out
        testString.printSomething();
        String stringFromMethod = outputStream.toString();
        System.setOut(consoleStream);         //Возвращаем все как было
        System.out.println(stringFromMethod);
        fileOutputStream.write(stringFromMethod.getBytes());
        fileOutputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}


package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception

        try {
            float j = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            method2();
        }
        catch (RuntimeException e) {
            exceptions.add(e);
        }

        try {
            throw new IndexOutOfBoundsException("123");
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NullPointerException("234");
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new ClassNotFoundException("234");
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NumberFormatException("NumberFormatException");
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new CloneNotSupportedException("CloneNotSupportedException");
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchFieldException("NoSuchFieldException");
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchMethodException("NoSuchMethodException");
        }
        catch (Exception e) {
            exceptions.add(e);
        }
    }

    public static void method2()
    {
        String s = "Message: Unknown Exception";
        throw new RuntimeException(s);

    }
}

package com.javarush.task.task14.task1421;

public class Singleton {
    private Singleton() {
    }

    private static Singleton instance = null;

    private static int count = 0;

    public static Singleton getInstance() {
        if (count == 0) {
            count++;
            instance = new Singleton();
            return instance;
        }
        return instance;
    }
}





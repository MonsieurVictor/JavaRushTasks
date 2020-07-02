package com.javarush.task.task18.task1828;

import java.util.*;

public class VictorSamosvat {
    String name = "Victor";
    String surName = "Samosvat";
    int age = 29;
    String[] education = new String[]{"BSTU", "Informatics and Software"};
    Calendar dateOfGraduation = new GregorianCalendar(2019, 12, 25);
    String preferredLanguage = "Java";
    boolean fluentEnglish = true;
    boolean highLearningAbility = true;
    boolean badHabits = false;
    static boolean jobIsFound = false;

    public static void main(String[] args) {
        while (!jobIsFound) {
            System.out.println("Looking for a job!");
        }
    }
}

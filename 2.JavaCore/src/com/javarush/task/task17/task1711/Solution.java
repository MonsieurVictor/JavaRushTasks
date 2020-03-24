package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            switch (args[0]) {

                case "-c":
                    synchronized (allPeople) {
                        for (int i = 0; i < (args.length - 1) / 3; i++) {
                            if (args[2 + 3 * i].equals("м")) {
                                allPeople.add(Person.createMale(args[1 + 3 * i], format.parse(args[3 + 3 * i])));
                                System.out.println(allPeople.size() - 1);
                            } else if (args[2 + 3 * i].equals("ж")) {
                                allPeople.add(Person.createFemale(args[1 + 3 * i], format.parse(args[3 + 3 * i])));
                                System.out.println(allPeople.size() - 1);
                            }
                        }
                    }
                    return;

                case "-u":
                    synchronized (allPeople) {
                        for (int i = 0; i < (args.length - 1) / 4; i++) {

                            Person person = allPeople.get(Integer.parseInt(args[1 + i * 4]));
                            person.setName(args[2 + 4 * i]);
                            if (args[3 + 4 * i].equals("м")) {
                                person.setSex(Sex.MALE);
                            } else if (args[3 + 4 * i].equals("ж")) {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDate(format.parse(args[4 + 4 * i]));
                        }
                    }
                    return;

                case "-d":
                    synchronized (allPeople) {
                        for (int i = 0; i < args.length - 1; i++) {
                            Person person = allPeople.get(Integer.parseInt(args[1 + i]));
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                    return;


                case "-i":
                    synchronized (allPeople) {
                        for (int i = 0; i < (args.length - 1); i++) {
                            Person person = allPeople.get(Integer.parseInt(args[1 + i]));
                            String sexStr = null;
                            if (person.getSex() == Sex.MALE) {
                                sexStr = "м";
                            } else if (person.getSex() == Sex.FEMALE) {
                                sexStr = "ж";
                            }
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                            System.out.println(person.getName() + " " + sexStr + " " + simpleDateFormat.format(person.getBirthDate()));
                        }
                    }
                    return;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

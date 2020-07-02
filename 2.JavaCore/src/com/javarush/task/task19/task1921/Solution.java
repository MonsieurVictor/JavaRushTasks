package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {

    public static final List<Person> PEOPLE = new ArrayList<>();
    public static void main(String[] args) throws IOException, ParseException {
        Reader fileReader = new FileReader(args[0]);
        BufferedReader buffReader = new BufferedReader(fileReader);
        String str = new String();
        while (buffReader.ready()) {

            str = buffReader.readLine();
            String[] strArray = str.split(" ");
            String name = "";
            for (int i = 0; i < strArray.length - 3; i++){
                name += strArray[i];
                if ((strArray.length - i) > 4){
                    name += " ";
                }
            }
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            String birthStr = strArray[strArray.length - 3] + " " + strArray[strArray.length - 2] + " " + strArray[strArray.length - 1];
            Date birthDate = sdf.parse(birthStr);
            PEOPLE.add(new Person(name, birthDate));
        }
        for (Person person: PEOPLE){
            System.out.println(person.getName() + " " + person.getBirthDate());
        }

        fileReader.close();
        buffReader.close();
    }
}

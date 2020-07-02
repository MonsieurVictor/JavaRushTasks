package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }



    public static class PersonScannerAdapter implements PersonScanner{
        private Person person;
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException, ParseException {
            if(fileScanner.hasNext()){
                String[] str = fileScanner.nextLine().toString().split(" ", 4);
                String firstName = str[1];
                String middleName = str[2];
                String lastName = str[0];
                SimpleDateFormat format = new SimpleDateFormat();
                format.applyPattern("dd MM yyyy");
                Date birthDate= format.parse(str[3]);
                return new Person(firstName, middleName, lastName, birthDate);
            }
            return null;
        }

        @Override
        public void close() {
            fileScanner.close();
        }
    }
}

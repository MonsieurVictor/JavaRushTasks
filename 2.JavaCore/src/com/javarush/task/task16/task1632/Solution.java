package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {

        threads.add(new InifityThread());
        threads.add(new ExceptionThread());
        threads.add(new PrintHoorahThread());
        threads.add(new MessageThread());
        threads.add(new ReadFromConsoleThread());


    }

    public static void main(String[] args) {
    }

    public static class InifityThread extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class ExceptionThread extends Thread {
        @Override
        public void run() {
            try {
                sleep(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class PrintHoorahThread extends Thread {
        @Override
        public void run() {
            try {
                while(true) {
                    System.out.println("Ура");
                    sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MessageThread extends Thread implements Message {
        @Override
        public void run() {
            while(!isInterrupted());
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class ReadFromConsoleThread extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int count = 0;
            try {
                while (true) {
                    String str = reader.readLine();
                    if (str.equals("N")) {
                        System.out.print(count);
                        break;
                    }
                    else if (!str.equals("") || str == null) {
                        count+= Integer.parseInt(str);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}

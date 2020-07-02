package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;
    public Solution(String str){
        this.createdThreadCount = Integer.parseInt(str);
    }

    public static void main(String[] args) {

        System.out.println(new GenerateThread());

    }

    public static class GenerateThread extends Thread{

        @Override
        public String toString() {
            return (this.getName() + " created");
        }

        public void run(){

            if (createdThreadCount < Solution.count) {
                System.out.println(new GenerateThread());
            }

        }
        public GenerateThread(){
            super(Integer.toString(++createdThreadCount));
            start();
        }
    }
}
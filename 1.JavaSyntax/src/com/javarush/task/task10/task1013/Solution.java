package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

        private int age;



        private int weight;
        private int height;
        private int width;
        private String name;
        private String surname;


        public Human(int weight, int height, String name) {
            this.weight = weight;
            this.height = height;
            this.name = name;
        }

        public Human(int weight, int height, int width, String name, String surname) {
            this.weight = weight;
            this.height = height;
            this.width = width;
            this.name = name;
            this.surname = surname;
        }

        public Human (int age, int weight, int height, int width, String name, String surname){

            this.age = age;
            this.weight = weight;
            this.height = height;
            this.width = width;
            this.name = name;
            this.surname = surname;
        }

        public Human(int weight, int height, int width, String name) {
            this.weight = weight;
            this.height = height;
            this.width = width;
            this.name = name;
        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Human(int width, String name, String surname) {
            this.width = width;
            this.name = name;
            this.surname = surname;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String surname) {
            this.surname = surname;
        }

        public Human(int height, int width, String name, String surname) {
            this.height = height;
            this.width = width;
            this.name = name;
            this.surname = surname;
        }
    }
}

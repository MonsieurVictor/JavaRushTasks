package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat catVasya = new Cat ("Vasya", 10, 20, 30);
        Cat catPetya = new Cat ("Petya", 12, 30, 60);

        Cat catBlake = new Cat ("Blake", 13, 40, 70);
        System.out.println(catVasya.fight(catPetya));
        System.out.println(catVasya.fight(catBlake));
        System.out.println(catBlake.fight(catPetya));
        
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}

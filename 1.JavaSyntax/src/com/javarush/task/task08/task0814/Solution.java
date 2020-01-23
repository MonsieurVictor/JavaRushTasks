package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        return new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        for (int value : set){
            if (value>10){
                set.remove(value);
            }
        }
        return set;

    }

    public static void main(String[] args) {
        Set <Integer> set = createSet();
        set = removeAllNumbersGreaterThan10(set);
        for (int value : set){
            System.out.println(value);
            }
        }
    
}

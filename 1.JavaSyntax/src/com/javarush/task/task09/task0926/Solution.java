package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> tempList = new ArrayList<>();
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {12, 23};
        int [] arr3 = {1,2,3,4};
        int [] arr4 = {12, 23, 213, 231, 123, 1231, 312};
        int [] arr5 = {};
        tempList.add(arr1);
        tempList.add(arr2);
        tempList.add(arr3);
        tempList.add(arr4);
        tempList.add(arr5);
        return tempList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

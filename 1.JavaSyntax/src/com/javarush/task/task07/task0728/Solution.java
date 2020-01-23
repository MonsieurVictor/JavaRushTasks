package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        // ArrayList<Integer> list = new ArrayList();

        Arrays.sort(array);
        int[] tempArr = new int[3];
        for (int i = 0; i < 3; i++){
            tempArr[i] = array[2-i];
        }
//        array = tempArr;

        for (int i = 0; i < 3; i++){
            array[i] = tempArr[2-i];
        }
        
        for (int x : tempArr) {
            System.out.println(x);
        }
    }
}

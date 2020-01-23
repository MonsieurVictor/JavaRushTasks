package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        List <Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++){
            num = Integer.parseInt(reader.readLine());
            list.add(num);
        }
        int max = 1;
        int savedMax = 1;
        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i) == list.get(i + 1)){
                max++;
            } else {
                if (savedMax < max) {
                    savedMax = max;
                }
                max = 1;
            }
            } if (savedMax < max ) {
                savedMax = max;
            }

        System.out.println(savedMax);
}
    }

package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {

        String s = null;
        String m = s.toLowerCase();
        }
        catch (NullPointerException npe){
            System.out.println(npe);
        }

        //напишите тут ваш код
    }
}

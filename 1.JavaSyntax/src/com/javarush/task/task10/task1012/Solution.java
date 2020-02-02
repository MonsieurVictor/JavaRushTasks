package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        String bigString = null;

        for (String s : list){
            bigString += s;
        }
        char[] letterArray = bigString.toCharArray();
        Map<Character, Integer> lettersMap = new HashMap<>();

        for (Character c: alphabet){
            lettersMap.put(c, 0);
        }

        for(Character c : letterArray){
            if (alphabet.contains(c)){
                    int count = lettersMap.get(c);
                    lettersMap.put(c, count + 1);
                }
            }

        for (char c : alphabet){
            int value = lettersMap.get(c);
            System.out.println(c + " " + value);
        }

//        Iterator<Map.Entry<Character, Integer>> iterator = lettersMap.entrySet().iterator();
//
//
//
//        while (iterator.hasNext())
//        {
//            Map.Entry<Character, Integer> pair = iterator.next();
//            Character key = pair.getKey();
//            int value = pair.getValue();
//            System.out.println(key + " " +  value);
//        }

    }
}

package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String , Integer> map = new HashMap();
        
        while(true){
            String line;

            if ((line = reader.readLine()).equals("")) break;
            int id = Integer.parseInt(line);
            String name = reader.readLine();
            map.put(name, id);
        }

        Iterator<Map.Entry<String , Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            //получение «пары» элементов
            Map.Entry<String , Integer> pair = iterator.next();
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}

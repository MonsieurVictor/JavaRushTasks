package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.nio.Buffer;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length != 0 && args[0].equals("-c")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String path = reader.readLine();
            String itemStr = null;
            int idMax = 0;
            reader = new BufferedReader(new FileReader(path));
            while ((itemStr = reader.readLine()) != null){
                String idStr = itemStr.substring(0,8);
                idStr = idStr.split(" ")[0];
                int idInt = Integer.valueOf(idStr);
                if (idInt>idMax){
                    idMax = idInt;
                }
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String id = String.format("%-8d", ++idMax);
            String productName = String.format("%-30.30s", args[1]);
            String price = String.format(Locale.ROOT, "%-8.2f", Double.parseDouble(args[2]));
            String quantity = String.format("%-4d", Integer.parseInt(args[3]));
            writer.newLine();
            String newItemStr = id + productName + price + quantity;
            writer.write(newItemStr);
            writer.flush();
            writer.close();
        }
    }
}

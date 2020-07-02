package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        List<String> list = new ArrayList<>();
        if (args.length > 0 && (args[0].equals("-u") || args[0].equals("-d"))) {
            reader = new BufferedReader(new FileReader(path));
            String itemStr = null;
            int idRequired = Integer.valueOf(args[1]);
            while ((itemStr = reader.readLine()) != null) {
                String idStr = itemStr.substring(0, 8).split(" ")[0];
                int idInt = Integer.valueOf(idStr);
                if (idInt == idRequired) {
                    if (args[0].equals("-u")) {
                        String id = String.format("%-8d", idRequired);
                        String productName = String.format("%-30.30s", args[2]);
                        String price = String.format(Locale.ROOT, "%-8.2f", Double.parseDouble(args[3]));
                        String quantity = String.format("%-4d", Integer.parseInt(args[4]));
                        String newItemStr = id + productName + price + quantity;
                        list.add(newItemStr);
                    }
                } else {
                    list.add(itemStr);
                }
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (String str : list) {
                writer.write(str + System.lineSeparator());
            }
            reader.close();
            writer.flush();
            writer.close();
        }
    }
}
package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        BufferedReader fileInputStream = new BufferedReader(new FileReader(fileName));
        String line = "";
        ArrayList<String> fileContent = new ArrayList<>();
        int maxId = 0;

// read file content and find max ID in file
        while ((line = fileInputStream.readLine()) != null) {
            fileContent.add(line);

            maxId = maxId < getId(line) ? getId(line) : maxId;
        }

// adjust parameters that will be added to the file
// if the length is too short - add spaces to the end
// if the parameter is too long - cut the length
        String incrementedId = ++maxId + "";
        while (incrementedId.length() < 8) {
            incrementedId += " ";
        }
        if (incrementedId.length() > 8) {
            incrementedId = incrementedId.substring(0, 8);
        }

        String productName = args[1];
        while (productName.length() < 30) {
            productName += " ";
        }
        if (productName.length() > 30) {
            productName = productName.substring(0, 30);
        }

        String price = (args[2]);
        while (price.length() < 8) {
            price += " ";
        }
        if (price.length() > 8) {
            price = price.substring(0, 8);
        }

        String quantity = (args[3]);
        while (quantity.length() < 4) {
            quantity += " ";
        }
        if (quantity.length() > 4) {
            quantity = quantity.substring(0, 4);
        }


// add a new line to the file with content from parameters
        if ("-c".equals(args[0])) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
            bufferedWriter.write("\n" + incrementedId + productName + price + quantity);
            bufferedWriter.close();
        }

        br.close();
        fileInputStream.close();
    }

    public static int getId(String s) {
        return Integer.parseInt(s.substring(0, 8).trim());
    }

    public static String getName(String s) {
        return s.substring(8, 38);
    }

    public static double getPrice(String s) {
        return Double.parseDouble(s.substring(38, 46).trim());
    }

    public static int getQuantity(String s) {
        return Integer.parseInt(s.substring(46, 50).trim());
    }
}

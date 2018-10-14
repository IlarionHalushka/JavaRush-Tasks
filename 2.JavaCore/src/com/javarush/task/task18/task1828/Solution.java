package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File fileName = new File(br.readLine());
        br.close();

        BufferedReader fileInputStream = new BufferedReader(new FileReader(fileName));
        File tempFile = new File(fileName + "templ123.txt");
        BufferedWriter tempFileInputStream = new BufferedWriter(new FileWriter(tempFile));
        String line = "";

// delete the row if the action is "-d"
        if ("-d".equals(args[0])) {
            String idToDelete = (args[1].trim());

            line = fileInputStream.readLine();
            while (line != null) {
                if (line.charAt(0) == '\uFEFF') {
                    line = line.substring(1, line.length());
                }
                String currentLineId = (line.substring(0, 8).trim());
                if (currentLineId.equals( idToDelete )) {
                    line = fileInputStream.readLine();
                    continue;
                }
                tempFileInputStream.write(line);
                if ((line = fileInputStream.readLine()) != null) {
                    tempFileInputStream.write(System.getProperty("line.separator"));
                }
            }

            tempFileInputStream.close();
            fileInputStream.close();

            fileName.delete();
            tempFile.renameTo(fileName);
        }



        // UPDATE Line
// adjust parameters that will be added to the file
// if the length is too short - add spaces to the end
// if the parameter is too long - cut the length
        if ("-u".equals(args[0])) {
            String ID = args[1];
            ID = ID.trim();
            while (ID.length() < 8) {
                ID += " ";
            }
            if (ID.length() > 8) {
                ID = ID.substring(0, 8);
            }

            String productName = args[2];
            productName = productName.trim();
            while (productName.length() < 30) {
                productName += " ";
            }
            if (productName.length() > 30) {
                productName = productName.substring(0, 30);
            }

            String price = (args[3]);
            price = price.trim();
            while (price.length() < 8) {
                price += " ";
            }
            if (price.length() > 8) {
                price = price.substring(0, 8);
            }

            String quantity = (args[4]);
            quantity = quantity.trim();
            while (quantity.length() < 4) {
                quantity += " ";
            }
            if (quantity.length() > 4) {
                quantity = quantity.substring(0, 4);
            }

            line = fileInputStream.readLine();
            while (line != null) {
                if (line.charAt(0) == '\uFEFF') {
                    line = line.substring(1, line.length());
                }
                String currentLineId = (line.substring(0, 8).trim());

                if (currentLineId.equals(ID.trim())) {
                    tempFileInputStream.write(ID + productName + price + quantity);
                    if ((line = fileInputStream.readLine()) != null) {
                        tempFileInputStream.write(System.getProperty("line.separator"));
                    }
                    continue;
                }
                // tempFileInputStream.write(line + System.getProperty("line.separator"));

                tempFileInputStream.write(line);
                if ((line = fileInputStream.readLine()) != null) {
                    tempFileInputStream.write(System.getProperty("line.separator"));
                }
            }

            tempFileInputStream.close();
            fileInputStream.close();
            fileName.delete();
            tempFile.renameTo(fileName);
        }

        tempFileInputStream.close();
        fileInputStream.close();
    }
}

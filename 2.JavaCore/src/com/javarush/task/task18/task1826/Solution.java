package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String operationType = args[0];
        String fileInputName = args[1];
        String fIleOutputName = args[2];

        FileInputStream fileInputStream = new FileInputStream(fileInputName);
        FileOutputStream fileOutputStream = new FileOutputStream(fIleOutputName);


        if ("-e".equals(operationType)) {
            int encodedContent;
            while (fileInputStream.available() > 0) {
                encodedContent = fileInputStream.read() + 1;
                fileOutputStream.write(encodedContent);
            }
        }

        if ("-d".equals(operationType)) {
            int decodedContent;
            while (fileInputStream.available() > 0) {
                decodedContent = fileInputStream.read() - 1;
                fileOutputStream.write(decodedContent);
            }
        }


        fileOutputStream.close();
        fileInputStream.close();





    }
}

package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.lang.Integer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = br.readLine();
        String secondFile = br.readLine();

        FileInputStream fileInputStream = new FileInputStream(firstFile);
        String firstFileContent = "";
        while (fileInputStream.available() > 0) {
            firstFileContent += (char) fileInputStream.read();
        }

        String[] firstFileContentStringsArray = firstFileContent.split(" ");

        FileOutputStream secondFileOutputStream = new FileOutputStream(secondFile);
        DataOutputStream secondDataOutputStream = new DataOutputStream(secondFileOutputStream);

        for (int i = 0; i < firstFileContentStringsArray.length; i++) {
            double numberSecondFile = Double.parseDouble(firstFileContentStringsArray[i]);
            long roundedNumberSecondFile = Math.round(numberSecondFile);
            secondDataOutputStream.writeBytes(roundedNumberSecondFile + "");
            secondDataOutputStream.write(" ".getBytes());
        }

        secondFileOutputStream.close();
        fileInputStream.close();
        secondDataOutputStream.close();
    }
}

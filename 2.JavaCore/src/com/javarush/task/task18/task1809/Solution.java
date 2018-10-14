package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        br.close();

        FileInputStream file1InputStream = new FileInputStream(fileName1);
        FileOutputStream file2OutputStream = new FileOutputStream(fileName2);

        int bytesAvailable = file1InputStream.available();

        byte[] buffer = new byte[bytesAvailable];

        file1InputStream.read(buffer);

        for (int i = bytesAvailable - 1; i >= 0; i--) {
            file2OutputStream.write( buffer[i] );
        }

        file1InputStream.close();
        file2OutputStream.close();
    }
}

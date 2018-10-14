package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName1 = br.readLine();
            FileInputStream file1InputStream = new FileInputStream(fileName1);

            if (file1InputStream.available() < 1000) {
                br.close();
                file1InputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}

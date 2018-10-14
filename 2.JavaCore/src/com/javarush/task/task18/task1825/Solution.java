package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        String fileName = "";

        SortedMap<Integer, String> arrayFileNames = new TreeMap<>();

        while (!(line = br.readLine()).equals("end")) {
            fileName = line;
            int index2 = fileName.lastIndexOf(".");
            int index3 = Integer.parseInt(fileName.substring(index2 + 5, fileName.length()));
            arrayFileNames.put(index3, fileName);
        }
        br.close();

        ArrayList<byte[]> contents = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : arrayFileNames.entrySet()) {
            BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(entry.getValue()));
            byte[] content = new byte[fileInputStream.available()];
            fileInputStream.read(content);
            contents.add(content);
            fileInputStream.close();
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

        for (int i = 0; i < contents.size(); i++) {
            byte[] content = contents.get(i);
            outputStream.write( content );
        }
        byte[] allFilesContent = outputStream.toByteArray( );

        int indexOfPart = fileName.indexOf(".part");
        String outputFileName = fileName.substring(0, indexOfPart);

        BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(outputFileName));
        fileOutputStream.write(allFilesContent);

        outputStream.close();
        fileOutputStream.close();
    }
}

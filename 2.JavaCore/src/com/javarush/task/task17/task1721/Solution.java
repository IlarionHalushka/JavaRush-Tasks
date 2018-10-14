package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String file1 = br.readLine();
        String file2 = br.readLine();

        FileReader fileReader1 = new FileReader(file1);
        BufferedReader brFile1 = new BufferedReader(fileReader1);
        String line;

        while ((line = brFile1.readLine()) != null) {
            allLines.add(line);
        }

        FileReader fileReader2 = new FileReader(file2);
        BufferedReader brFile2 = new BufferedReader(fileReader2);

        String line2;
        while ((line2 = brFile2.readLine()) != null) {
            forRemoveLines.add(line2);
        }

        br.close();
        fileReader1.close();
        fileReader2.close();
        brFile1.close();
        brFile2.close();

        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData () throws CorruptedDataException {
        boolean containsAllStrings = allLines.containsAll(forRemoveLines);
        if (containsAllStrings) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}

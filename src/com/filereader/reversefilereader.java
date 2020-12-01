package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class reversefilereader {
    BufferedReader objReader = null;
    public void ReadReverseFile(String file1) throws IOException {

        try {
            String strCurrentLine;

            objReader = new BufferedReader(new FileReader(file1));
            while ((strCurrentLine = objReader.readLine()) != null) {
                System.out.println(new StringBuffer(strCurrentLine).reverse());
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

package com.filereader;

import java.io.*;
import java.io.FileReader;


 public class filereader {
    BufferedReader objReader = null;
    public  void ReadFile(String file1) {
        try {
            String strCurrentLine;

            objReader = new BufferedReader(new FileReader(file1));

            while ((strCurrentLine = objReader.readLine()) != null) {

                System.out.println(strCurrentLine);
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


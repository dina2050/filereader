package com.filereader;

import java.io.*;
import java.io.FileReader;
import java.util.Stack;

public class upsidedownfilereader {
    BufferedReader objReader = null;
    public void ReadUpDown(String file1) {
        try {
            objReader = new BufferedReader(new FileReader(file1));
            Stack<String> lines = new Stack<String>();
            String strCurrentLine = objReader.readLine();
            while(strCurrentLine != null) {
                lines.push(strCurrentLine);
                strCurrentLine = objReader.readLine();
            }

            while(! lines.empty()) {
                System.out.println(lines.pop());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(objReader != null) {
                try {
                    objReader.close();
                } catch(IOException e) {
                }
            }
        }

    }
}

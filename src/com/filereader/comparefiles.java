package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class comparefiles {
    BufferedReader objReader1 = null;
    BufferedReader objReader2 = null;
    public void CompareFiles(String file1, String file2 ) throws IOException {
    try {
       objReader1 = new BufferedReader(new FileReader(file1));

       objReader2 = new BufferedReader(new FileReader(file2));

        String line1 = objReader1.readLine();

        String line2 = objReader2.readLine();

        boolean areEqual = true;

        int lineNum = 1;

        while (line1 != null || line2 != null) {
            if (line1 == null || line2 == null) {
                areEqual = false;

                break;
            } else if (!line1.equalsIgnoreCase(line2)) {
                areEqual = false;

                break;
            }

            line1 = objReader1.readLine();

            line2 = objReader2.readLine();

            lineNum++;
        }

        if (areEqual) {
            System.out.println("Two files have same content.");
        } else {
            System.out.println("Two files have different content. They differ at line " + lineNum);

            System.out.println("File1 has " + line1 + " and File2 has " + line2 + " at line " + lineNum);
        }
    }catch (IOException e) {

        e.printStackTrace();

    }
        objReader1.close();

        objReader2.close();
    }

}

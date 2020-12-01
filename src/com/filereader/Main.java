package com.filereader;

import java.io.IOException;

    public class Main {
        public static void main(String[] args) throws IOException {
            String file1 = "input1.txt";
            String file2 = "input2.txt";

            comparefiles files = new comparefiles();
            files.CompareFiles(file1,file2);

            filereader file = new filereader();
            file.ReadFile(file1);

            upsidedownfilereader fileupdown = new upsidedownfilereader();
            fileupdown.ReadUpDown(file1);

            reversefilereader filereverse = new reversefilereader();
            filereverse.ReadReverseFile(file1);
        }

}

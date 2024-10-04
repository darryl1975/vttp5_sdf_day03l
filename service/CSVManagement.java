package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVManagement {
    
    // filename: dirPath + file separator + filename
    public void readCSV(String filename) throws IOException {
        // use BufferReader
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }

    public void writeCSV(String filename) {

    }
}

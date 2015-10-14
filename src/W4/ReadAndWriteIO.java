/*
 * ReadAndWriteIO.java
 * LUT Olio-ohjelmointi | 14.10.2015
 * 
 * Author: Teemu Mäntykallio
 */
package W4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


/**
 *
 * @author Teemu
 */
public class ReadAndWriteIO {
    public String readFile(String filePath) throws FileNotFoundException, IOException {
        String outputStr;
        BufferedReader myReader = new BufferedReader(new FileReader(filePath));
        outputStr = myReader.readLine();
        while (outputStr != null) {
            System.out.println(outputStr);
            outputStr = myReader.readLine();
        };
        myReader.close();
        return outputStr;
    }
    
    public void readAndWrite(String inFile, String outFile) throws FileNotFoundException, IOException {
        String outputStr = "", line = null;
        BufferedReader myReader = new BufferedReader(new FileReader(inFile));
        BufferedWriter myWriter = new BufferedWriter(new FileWriter(outFile));
        line = myReader.readLine();
        while (line != null) {
            if (line.length() < 30 && !(line.trim().isEmpty()) && line.contains("v"))
                outputStr += line + "\n";
            line = myReader.readLine();
            //System.out.println(line);
        };
        System.out.println(outputStr);
        myWriter.write(outputStr);
        myReader.close();
        myWriter.close();
    }
    
    public void readZip(String filePath) throws FileNotFoundException, IOException {
        try {
            ZipInputStream in = new ZipInputStream(new FileInputStream(filePath));
            in.getNextEntry();
            byte[] buffer = new byte[2048];
            int len = in.read(buffer); // Read into the buffer
            System.out.println(new String(buffer, 0, len));
            in.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}

/*
 * Mainclass.java
 * LUT Olio-ohjelmointi | 21.10.2016
 * 
 * Author: Teemu Mäntykallio
 */
package W4;

//import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Teemu
 */
public class Mainclass {
    public static void main(String[] args) throws IOException {
        //System.out.println( System.getProperty( "user.dir" ) );
        ReadAndWriteIO myReader = new ReadAndWriteIO();
        //myReader.readFile("input.txt");
        //System.out.println(myReader.readFile("input.txt"));
        //myReader.readFile("input.txt");
        //myReader.readAndWrite("input.txt", "output.txt");
        myReader.readZip("zipinput.zip");
    }
}

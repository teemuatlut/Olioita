/*
 * Mainclass.java
 * LUT Olio-ohjelmointi | 1.10.2016
 * 
 * Author: Teemu Mäntykallio, 0371460
 */
package W2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainclass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
                
        try {
            System.out.print("Anna koiralle nimi: ");
            String name = br.readLine();
            Dog doge = new Dog(name);

            System.out.print("Mitä koira sanoo: ");
            String speakStr = br.readLine();
            doge.speak(speakStr);
        } catch (IOException ex) {}
    }
}

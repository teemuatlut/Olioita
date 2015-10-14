/*
 * Mainclass.java
 * LUT Olio-ohjelmointi | 26.9.2015
 * 
 * Author: Teemu Mäntykallio
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
            String says = br.readLine();
            doge.speak(says);
        } catch (IOException ex) {}
    }
}

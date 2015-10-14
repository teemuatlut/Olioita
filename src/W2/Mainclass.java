/*
 * Mainclass.java
 * LUT Olio-ohjelmointi | 30.9.2015
 * 
 * Author: Teemu Mäntykallio
 */
package W2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainclass {
    public static void main(String[] args) {
        boolean saysIsEmpty;
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        try {
            System.out.print("Anna koiralle nimi: ");
            String name = br.readLine();
            Dog doge = new Dog(name);
            
            do {
                System.out.print("Mitä koira sanoo: ");
                String says = br.readLine();
                saysIsEmpty = doge.speak(says);
            } while (saysIsEmpty);
        } catch (IOException ex) {}
    }
}

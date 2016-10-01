/*
 * Dog.java
 * LUT Olio-ohjelmointi | 1.10.2016
 * 
 * Author: Teemu Mäntykallio, 0371460
 */
package W2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dog {
    private String name, says;
    
    public Dog(String inputStr) {
        inputStr = inputStr.trim();
        if (inputStr.isEmpty()) {
            name = "Doge";    
        } else {
            name = inputStr;
        }
        
        System.out.println("Hei, nimeni on " + name);
        says = "Much wow!";
    }
    
    public void speak(String inputStr){
        inputStr = inputStr.trim();
        if (!inputStr.isEmpty()) {
//            System.out.print(name);
//            System.out.print(": ");
//            System.out.println(inputStr);
            Scanner sc = new Scanner(inputStr);
            while (sc.hasNext()) {
                if (sc.hasNextBoolean()) {
                    System.out.println("Such boolean: " + sc.next());
                } else if (sc.hasNextInt()) {
                    System.out.println("Such integer: " + sc.next());
                } else {
                    System.out.println(sc.next());
                }
            }
        } else {
            System.out.print(name);
            System.out.print(": ");
            System.out.println(says);
            
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            );
            try {
                System.out.print("Mitä koira sanoo: ");
                String speakStr = br.readLine();
                speak(speakStr);
            } catch (IOException ex) {}
        }
    }
}

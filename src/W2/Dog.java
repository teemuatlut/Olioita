/*
 * Dog.java
 * LUT Olio-ohjelmointi | 30.9.2015
 * 
 * Author: Teemu Mäntykallio
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
        
        System.out.println("Hei, nimeni on " + name + "!");
        says = "Much wow!";
    }
    
    public boolean speak(String inputStr){
        inputStr = inputStr.trim();
        if (!(inputStr.isEmpty())) {
            //says = inputStr;
            Scanner sc = new Scanner(inputStr);
            while (sc.hasNext()) {
                System.out.println(sc.next());
                sc.
                //if (sc.hasNextBoolean()) {
                    //System.out.println("Such boolean: " + sc.nextBoolean());
//                }
//                if (sc.hasNextInt()) {
//                    System.out.println("Such integer: " + sc.nextInt());
//                }
            }
            //System.out.println(name + ": " + says);
            return false;
        } else {
            System.out.println(name + ": " + says);
            return true;
        }
    }
}

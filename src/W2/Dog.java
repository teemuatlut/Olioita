/*
 * Dog.java
 * LUT Olio-ohjelmointi | 26.9.2015
 * 
 * Author: Teemu Mäntykallio
 */
package W2;

public class Dog {
    String name, says;
    
    public Dog(String strInput) {
        name = strInput;
        System.out.println("Hei, nimeni on " + name + "!");
    }
    
    public void speak(String strInput){
        says = strInput;
        System.out.println(name + ": " + says + "!");
    }
}

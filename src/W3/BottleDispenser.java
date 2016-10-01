/*
 * BottleDispenser.java
 * LUT Olio-ohjelmointi | 1.10.2016
 * 
 * Author: Teemu Mäntykallio
 */
package W3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teemu
 */
public class BottleDispenser {
    
    private int bottles;
    private double money;
    // The array for the Bottle-objects
    //private Bottle[] bottle_array;
    private ArrayList<Bottle> bottle_list;
    
    public BottleDispenser() {
        bottles = 6;
        money = 0;
        
        // Initialize the array
        //bottle_array = new Bottle[bottles];
        bottle_list = new ArrayList();
        // Add Bottle-objects to the array
        bottle_list.add(new Bottle("Pepsi Max", "Pepsi", 1.0, 0.5, 1.8));
        bottle_list.add(new Bottle("Pepsi Max", "Pepsi", 1.0, 1.5, 2.2));
        bottle_list.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 1.0, 0.5, 2.0));
        bottle_list.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 1.0, 1.5, 2.5));
        bottle_list.add(new Bottle("Fanta Zero", "Coca-Cola", 1.0, 0.5, 1.95));
        bottle_list.add(new Bottle("Fanta Zero", "Coca-Cola", 1.0, 0.5, 1.95));
    }

    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Lisää rahaa laitteeseen!");
    }
    
    public void buyBottle(int sel) {
        //Bottle b = bottle_array[bottles-1];
        Bottle b = bottle_list.get(sel-1);
        if (money >= b.getPrice()) {
            money -= b.getPrice();
            System.out.print("KACHUNK! ");
            System.out.print(b.getName());
            System.out.println(" tipahti masiinasta!");
            bottles -= 1;
            bottle_list.remove(sel-1);
        } else 
            System.out.println("Syötä rahaa ensin!");
    }
    
    public void returnMoney() {
        System.out.printf("Klink klink. Sinne menivät rahat! Rahaa tuli ulos %.2f€", money);
        money = 0;
    }
    
    public void listBottles() {
        for (int i=0; i<bottles; i++) {
            //Bottle b = bottle_array[i];
            Bottle b = bottle_list.get(i);
            System.out.print(i+1 + ". Nimi: ");
            System.out.println(b.getName());
            System.out.print("\tKoko: ");
            System.out.print(b.getSize());
            System.out.print("\tHinta: ");
            System.out.println(b.getPrice());
        }
    }
}


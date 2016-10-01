/*
 * Mainclass.java
 * LUT Olio-ohjelmointi | 1.10.2016
 * 
 * Author: Teemu Mäntykallio, 0371460
 */
package W3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mainclass {
    public static void main(String[] args) {
        BottleDispenser bd = new BottleDispenser();
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int selection = 0;
        
        do {
            System.out.print(   "\n*** LIMSA-AUTOMAATTI ***\n" +
                                "1) Lisää rahaa koneeseen\n" +
                                "2) Osta pullo\n" +
                                "3) Ota rahat ulos\n" +
                                "4) Listaa koneessa olevat pullot\n" +
                                "0) Lopeta\n" +
                                "Valintasi: ");
            try {
                selection = Integer.parseInt(br.readLine().trim());
            } catch (IOException ex) {
                Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch(selection) {
                case 1:
                    bd.addMoney();
                    break;
                case 2:
                    bd.listBottles();
                    System.out.print("Valintasi: ");
                    try {
                        selection = Integer.parseInt(br.readLine().trim());
                    } catch (IOException ex) {
                        Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    bd.buyBottle(selection);
                    break;
                case 3:
                    bd.returnMoney();
                    break;
                case 4:
                    bd.listBottles();
                    break;
            }
        } while (selection != 0);
    }
}

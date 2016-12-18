/*
 * Mainclass.java
 * LUT Olio-ohjelmointi | 17.12.2016
 * 
 * Author: Teemu M�ntykallio
 */
//package W5_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teemu
 */
public class Mainclass {
    public Character myCharacter;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int selection = 0;

        do {
            System.out.print(   "*** TAISTELUSIMULAATTORI ***\n" +
                                "1) Luo hahmo\n" +
                                "2) Taistele hahmolla\n" +
                                "0) Lopeta\n" +
                                "Valintasi: ");
            try {
                selection = Integer.parseInt(br.readLine().trim());
            } catch (IOException ex) {
                Logger.getLogger(W3.Mainclass.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (selection) {
                case 1:
                    selection = 0;
                    System.out.print(   "Valitse hahmosi: \n" +
                                        "1) Kuningas\n" +
                                        "2) Ritari\n" +
                                        "3) Kuningatar\n" +
                                        "4) Peikko\n" + 
                                        "Valintasi: ");
                    try {
                        selection = Integer.parseInt(br.readLine().trim());
                    } catch (IOException ex) {
                        Logger.getLogger(Character.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    switch (selection) {
                        case 1:
                            myCharacter = new King();
                            break;
                    }
                    break;
                default:
                    break;
            }
        } while (selection != 0);
    }
}

/*
 * Mainclass.java
 * LUT Olio-ohjelmointi | 17.12.2016
 * 
 * Author: Teemu Mäntykallio, 0371460
 */
package W6;

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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int selection = 0;
        String acc_number;
        int amount;
        int credit_limit;
        
        Bank bank = new Bank();

        do {
            System.out.print(   "\n*** PANKKIJÄRJESTELMÄ ***\n" +
                                "1) Lisää tavallinen tili\n" +
                                "2) Lisää luotollinen tili\n" +
                                "3) Tallenna tilille rahaa\n" +
                                "4) Nosta tililtä\n" +
                                "5) Poista tili\n" +
                                "6) Tulosta tili\n" +
                                "7) Tulosta kaikki tilit\n" +
                                "0) Lopeta\n" +
                                "Valintasi: ");
            
            selection = Integer.parseInt(br.readLine().trim());
                
            switch (selection) {
                case 1:
                    System.out.print("Syötä tilinumero: ");
                    acc_number =  br.readLine().trim();
                    System.out.print("Syötä rahamäärä: ");
                    amount = Integer.parseInt(br.readLine().trim());
                    bank.addAccount(acc_number, amount);
                    break;
                case 2:
                    System.out.print("Syötä tilinumero: ");
                    acc_number =  br.readLine().trim();
                    System.out.print("Syötä rahamäärä: ");
                    amount = Integer.parseInt(br.readLine().trim());
                    System.out.print("Syötä luottoraja: ");
                    credit_limit = Integer.parseInt(br.readLine().trim());
                    bank.addCreditAccount(acc_number, amount, credit_limit);
                    break;
                case 3:
                    System.out.print("Syötä tilinumero: ");
                    acc_number =  br.readLine().trim();
                    System.out.print("Syötä rahamäärä: ");
                    amount = Integer.parseInt(br.readLine().trim());
                    bank.addBalance(acc_number, amount);
                    break;
                case 4:
                    System.out.print("Syötä tilinumero: ");
                    acc_number =  br.readLine().trim();
                    System.out.print("Syötä rahamäärä: ");
                    amount = Integer.parseInt(br.readLine().trim());
                    bank.decreaseBalance(acc_number, amount);
                    break;
                case 5:
                    System.out.print("Syötä poistettava tilinumero: ");
                    acc_number =  br.readLine().trim();
                    bank.removeAccount(acc_number);
                    break;
                case 6:
                    System.out.print("Syötä tulostettava tilinumero: ");
                    acc_number =  br.readLine().trim();
                    bank.searchAccount(acc_number);
                    break;
                case 7:
                    bank.listAccounts();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valinta ei kelpaa.");
                    break;
            }
        } while (selection != 0);
    }
}
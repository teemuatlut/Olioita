/*
 * Bank.java
 * LUT Olio-ohjelmointi | 18.12.2016
 * 
 * Author: Teemu Mäntykallio, 0371460
 */
package W6;

import java.util.ArrayList;

/**
 *
 * @author Teemu
 */
public class Bank {
    private ArrayList<Account> accountList = new ArrayList();
    public Bank() {
        
    }
    
    public void addAccount(String accountNumber, int balance) {
        NormalAccount newAccount = new NormalAccount(accountNumber, balance);
        accountList.add(newAccount);
    }
    
    public void addCreditAccount(String accountNumber, int balance, int credit) {
        CreditAccount newAccount = new CreditAccount(accountNumber, balance, credit);
        accountList.add(newAccount);
    }
    
    public void removeAccount(String accountNumber) {
        int i = 0;
        for (Account a : accountList)  {
            if (a.getAccount_number().equals(accountNumber)) {
                accountList.remove(i);
                System.out.println("Tili poistettu.");
                break;
            }
            i++;
        }
    }
    
    public void listAccounts() {
        System.out.println("Kaikki tilit:");
        for (Account a : accountList) {
            System.out.print("Tilinumero: ");
            System.out.print(a.getAccount_number());
            System.out.print(" Tilillä rahaa: ");
            System.out.print(a.getBalance());
            if (a instanceof CreditAccount) {
                System.out.print(" Luottoraja: ");
                System.out.print(((CreditAccount) a).getCreditLimit());
            }
            System.out.println();
        }
    }
    
    public void addBalance(String accountNumber, int money) {
        //System.out.print("Talletetaan tilille: ");
        //System.out.println(accountNumber + " rahaa " + money);
        for (Account a : accountList)  {
            if (a.getAccount_number().equals(accountNumber)) {
                a.setBalance(money);
            }
        }
    }
    
    public void decreaseBalance(String accountNumber, int money) {
        //System.out.print("Nostetaan tililtä: ");
        //System.out.println(accountNumber + " rahaa " + money);
        for (Account a : accountList)  {
            if (a.getAccount_number().equals(accountNumber)) {
                a.setBalance(-money);
            }
        }
    }
    
    public void searchAccount(String accountNumber) {
        for (Account a : accountList) {
            if (a.getAccount_number().equals(accountNumber)) {
                System.out.print("Tilinumero: " + accountNumber);
                System.out.println(" Tilillä rahaa: " + a.getBalance());
            }
        }
    }
}
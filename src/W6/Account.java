/*
 * Account.java
 * LUT Olio-ohjelmointi | 18.12.2016
 * 
 * Author: Teemu Mäntykallio, 0371460
 */
package W6;

/**
 *
 * @author Teemu
 */
public abstract class Account {
    String account_number;
    int balance;
    public Account(String c, int b) {
        account_number = c;
        balance = b;
        System.out.println("Tili luotu.");
    }

    public String getAccount_number() {
        return account_number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int e) {
        if (0 <= balance - e)
            this.balance += e;
    }
}
class NormalAccount extends Account {
    public NormalAccount(String c, int b) {
        super(c, b);
    }
}

class CreditAccount extends Account {
    private int creditLimit;
    public CreditAccount(String acc, int bal, int credit) {
        super(acc, bal);
        creditLimit = credit;
    }
    public void setBalance(int e) {
        if (-creditLimit <= balance + e)
            this.balance += e;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
}
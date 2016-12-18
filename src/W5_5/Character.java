/*
 * Character.java
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
public class Character {
    public WeaponBehavior weapon;
    public Character characterType;
    public Character() {
    
    public void fight() {
        characterType.fight();
        System.out.print(" tappelee aseella ");
        //weapon.useWeapon();
    }
}

class WeaponBehavior {
    WeaponBehavior weapon;
    public WeaponBehavior() {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int selection = 0;
        System.out.print(   "Valitse aseesi:"+
                            "1) Veitsi" +
                            "2) Kirves" +
                            "3) Miekka" +
                            "4) Nuija" +
                            "Valintasi: ");
        try {
            selection = Integer.parseInt(br.readLine().trim());
        } catch (IOException ex) {
            Logger.getLogger(Character.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch (selection) {
            case 1:
                WeaponBehavior weapon = new KnifeBehavior();
                break;
        }
    }  
}

public class King extends Character {
    public void fight() {
        System.out.print("King");
    }
}
class Knight {
//    public Knight() { }
    public void fight() {
        System.out.print("Knight");
    }
}
class Queen {
    public Queen() { }
    public void fight() {
        System.out.print("Queen");
    }
}
class Troll {
    public Troll() { }
    public void fight() {
        System.out.print("Troll");
    }
}

class KnifeBehavior extends WeaponBehavior {
//    public KnifeBehavior() { }
    public void useWeapon() {
        System.out.println("Knife");
    }
}
class AxeBehavior {
    public AxeBehavior() { }
    public void useWeapon() {
        System.out.println("Axe");
    }
}
class SwordBehavior {
    public SwordBehavior() { }
    public void useWeapon() {
        System.out.println("Sword");
    }
}
class ClubBehavior {
    public ClubBehavior() { }
    public void useWeapon() {
        System.out.println("Club");
    }
}
/*
 * Bottle.java
 * LUT Olio-ohjelmointi | 1.10.2016
 * 
 * Author: Teemu Mäntykallio
 */
package W3;

/**
 *
 * @author Teemu
 */
public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    private double size;
    private double price;
    
    public Bottle() {
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        size = 0.5;
        price = 1.80;
    }
    
    public Bottle(String _name, String _manuf, double _totE, double _size, double _price) {
        name = _name;
        manufacturer = _manuf;
        total_energy = _totE;
        size = _size;
        price = _price;
    }
    
    public String getName() {
        return name;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public double getEnergy() {
        return total_energy;
    }
    
    public double getSize() {
        return size;
    }
    
    public double getPrice() {
        return price;
    }
}


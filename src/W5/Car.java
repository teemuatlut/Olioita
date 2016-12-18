/*
 * Car.java
 * LUT Olio-ohjelmointi | 28.10.2015
 * 
 * Author: Teemu Mäntykallio, 0371460
 */
package W5;

/**
 *
 * @author Teemu
 */
public class Car {
    public Car(){      
        Body body = new Body();
        Chassis chassis = new Chassis();
        Engine engine = new Engine();
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
    }
    
    public void Print() {
        System.out.println("Autoon kuuluu:");
        System.out.println("\tBody");
        System.out.println("\tChassis");
        System.out.println("\tEngine");
        System.out.println("\t4 Wheel");
    }
}
class Body {
    public Body() {
        System.out.println("Valmistetaan: Body");
    }
}
class Chassis {
    public Chassis() {
        System.out.println("Valmistetaan: Chassis");
    }
}
class Engine {
    public Engine() {
        System.out.println("Valmistetaan: Engine");
    }
}
class Wheel {
    public Wheel() {
        System.out.println("Valmistetaan: Wheel");
    }
}
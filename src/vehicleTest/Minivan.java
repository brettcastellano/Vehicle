/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleTest;

/**
 *
 * @author brcas1396
 */
public class Minivan extends Vehicle {

    private int numPeople;
    private String purpose;

    public Minivan(double g, double k, String c, int people, String purp) {
        super(g, k, c);
        numPeople = people;
        purpose = purp;
    }

    @Override
    void drive() {
        System.out.println("The minivan is on the way!");
    }

    @Override
    void horn() {
        System.out.println("BEEP BOOP");
    }
}

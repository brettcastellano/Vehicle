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
public abstract class Vehicle {

    private double gas;
    private double kilometers;
    private String colour;

    Vehicle(double g, double k, String c) {
        gas = g;
        kilometers = k;
        colour = c;
    }

    abstract void drive();

    abstract void horn();
}

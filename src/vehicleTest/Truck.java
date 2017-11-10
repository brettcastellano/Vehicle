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
public class Truck extends Vehicle {

    private double loadWeight;
    private String cargo;

    public Truck(double g, double k, String c, double weight, String carg) {
        super(g, k, c);
        loadWeight = weight;
        cargo = carg;
    }

    @Override
    void drive() {
        System.out.println("The truck is in drive mode!");
    }

    @Override
    void horn() {
        System.out.println("BOOOOP");
    }
}

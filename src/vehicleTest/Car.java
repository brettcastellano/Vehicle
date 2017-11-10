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
public class Car extends Vehicle {

    private boolean isStandard, isConvertible;

    public Car(double g, double k, String c, boolean isStand, boolean isConv) {
        super(g, k, c);
        isStandard = isStand;
        isConvertible = isConv;
    }

    @Override
    void drive() {
        System.out.println("The car is driving!");
    }

    @Override
    void horn() {
        System.out.println("BEEEEP");
    }
}

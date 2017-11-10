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
public abstract class VehicleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car fiat124 = new Car(2.5, 20000, "red", false, true);
        fiat124.drive();
        fiat124.horn();

        Truck tacoma = new Truck(4.5, 15000, "blue", 150, "wood");
        tacoma.drive();
        tacoma.horn();

        Minivan familyVan = new Minivan(1.8, 9000, "grey", 6, "Soccer game!");
        familyVan.drive();
        familyVan.horn();
    }

}

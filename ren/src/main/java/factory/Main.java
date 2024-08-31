package factory;

import factory.method.framework.Factory;
import factory.method.framework.Product;
import factory.method.idcard.IDCardFactory;
import factory.method2.framework.VehicleFactory;
import factory.method2.framework.Vehicle;
import factory.method2.idcard.BikeFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Ren");
        Product card2 = factory.create("Merloy");
        card1.use();
        card2.use();

        VehicleFactory vehicleFactory = new BikeFactory();
        Vehicle bike1 = vehicleFactory.createVehicle();
    }
}
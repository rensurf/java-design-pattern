package factory.method2.bike;

public class BikeFactory extends VehicleFactory {
    @Override
    public Bike createVehicle() {
        return Bike();
    }

}
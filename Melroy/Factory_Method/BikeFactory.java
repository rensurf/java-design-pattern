package Melroy.Factory_Method;

public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(){
        return new Bike();
    }
}

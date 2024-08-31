package Melroy.Factory_Method;




public class Main {
    public static void main(String[] args) {
        VehicleFactory carfactory= new CarFactory();

        Vehicle car= carfactory.createVehicle();

        car.drive();
            
        
    }
    
}

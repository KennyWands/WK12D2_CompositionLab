import VehicleComponents.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuyVehicle {
    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(double till) {
        this.till = till;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (this.till > vehicle.getPrice()) {
            this.till -= vehicle.getPrice();
            this.stock.add(vehicle);
        }
    }
}

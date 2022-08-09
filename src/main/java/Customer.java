import VehicleComponents.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuyVehicle {

    private String name;
    private double money;
    private ArrayList<Vehicle> ownedCars;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.ownedCars = new ArrayList<Vehicle>();
    }
    public double getCash(){ return this.money;}

    public void buyVehicle(Vehicle vehicle) {
        if (this.money > vehicle.getPrice()) {
            this.money -= vehicle.getPrice();
            this.ownedCars.add(vehicle);
        }
    }

}

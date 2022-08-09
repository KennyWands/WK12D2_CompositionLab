package Cars;

import VehicleComponents.Body;
import VehicleComponents.Engine;
import VehicleComponents.Tyres;
import VehicleComponents.Vehicle;

public class ElecCar extends Vehicle implements IRefuel {
    public ElecCar(Tyres tyres, Body body, Engine engine, int price, String colour, String make) {
        super(tyres, body, engine, price, colour, make);
    }
    public String refuel(String energy) {
        return "Charging with: " + energy;
    }
}

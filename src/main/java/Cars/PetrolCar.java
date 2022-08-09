package Cars;

import VehicleComponents.*;

public class PetrolCar extends Vehicle {



    public PetrolCar(Tyres tyres, Body body, Engine engine,
                     int price, String colour, String make) {

        super(tyres, body, engine, price, colour, make);
    }
    private String refuel(String energy) {
        return "Fueling with: " + energy;
    }

}

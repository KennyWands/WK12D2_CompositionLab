import Cars.PetrolCar;
import VehicleComponents.Body;
import VehicleComponents.Engine;
import VehicleComponents.EngineType;
import VehicleComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    PetrolCar petrolCar;
    Body body;
    Tyres tyres;
    Engine engine;

    @Before
    public void beforeEach(){
        dealership = new Dealership(999999999);
        body = new Body("Sierra");
        tyres = new Tyres(4);
        engine = new Engine(EngineType.PETROL);
        petrolCar = new PetrolCar (tyres, body, engine, 9999, "Blue", "Ford");
    }

//    @Test
//    public void canBuyCar(){
//        customer.buyVehicle(petrolCar);
//        assertEquals(1, customer.getCash(), 0.01);
//    }
}

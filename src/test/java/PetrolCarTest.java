import Cars.PetrolCar;
import VehicleComponents.Body;
import VehicleComponents.EngineType;
import VehicleComponents.Engine;
import VehicleComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PetrolCarTest {
    PetrolCar petrolCar;
    Body body;
    Tyres tyres;
    Engine engine;
    @Before
    public void beforeEach(){
        body = new Body("Sierra");
        tyres = new Tyres(4);
        engine = new Engine(EngineType.PETROL);
        petrolCar = new PetrolCar (tyres, body, engine, 9999, "Blue", "Ford");
    }

    @Test
    public void hasPrice(){
        assertEquals( 9999, petrolCar.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", petrolCar.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals(EngineType.PETROL, petrolCar.getEngine());
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", petrolCar.getMake());
        
    }


    @Test
    public void hasTyres() {
        assertEquals(4, petrolCar.getNumTyres());
    }
    @Test
    public void hasBody() {
        assertEquals("Sierra",petrolCar.getBody());
    }
    @Test
    public void canDrive() {
        assertEquals("Vrooom", petrolCar.drive());

    }
}

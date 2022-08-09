import Cars.ElecCar;
import VehicleComponents.Body;
import VehicleComponents.Engine;
import VehicleComponents.EngineType;
import VehicleComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElecCarTest {
    ElecCar elecCar;
    Body body;
    Tyres tyres;
    Engine engine;
    @Before
    public void before(){
        body = new Body("Roadster");
        tyres = new Tyres(4);
        engine = new Engine(EngineType.ELECTRIC);
        elecCar = new ElecCar(tyres,body,engine,59000, "Black", "Tesla");
    }
    @Test
    public void isBlack(){
        assertEquals("Black",elecCar.getColour());
    }
    @Test
    public void canCharge(){
        assertEquals("Fueling with: electricity",elecCar.refuel("electricity"));
    }
}

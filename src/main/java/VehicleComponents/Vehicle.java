package VehicleComponents;

public abstract class Vehicle {
    private Tyres tyres;
    private Body body;
    private Engine engine;
    private int price;
    private String colour;
    private String make;

    public Vehicle(Tyres tyres, Body body, Engine engine, int price,
                   String colour,  String make) {
        this.tyres = tyres;
        this.body = body;
        this.engine = engine;
        this.price = price;
        this.colour = colour;
        this.make = make;

    }

    public int getPrice() {
        return this.price;
    }
    public String getColour() {
        return this.colour;
    }
    public EngineType getEngine() {
        return this.engine.getEngineType();
    }
    public String getMake(){
        return this.make;
    }




    public int getNumTyres(){ return this.tyres.getNumTyres(); }

    public String getBody(){return this.body.getBody();}

    public String drive(){return "Vrooom";}
}

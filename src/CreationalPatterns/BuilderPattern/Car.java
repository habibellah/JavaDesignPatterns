package CreationalPatterns.BuilderPattern;

/*
this concrete class will implement the IBuilder interface and here we can find
many concrete classes and implement the methods with its case in our example every concrete class,
 or we can say Car has a model and steps to build maybe you want to build a motorcycle
 */
public class Car implements IBuilder {
    private final String model;
    private final Vehicle vehicle;

    public Car(String mModel) {
        this.model = mModel;
        vehicle = new Vehicle();
    }

    @Override
    public void startBuildVehicle() {
        vehicle.addPieces("the model is: " + this.model);
    }

    @Override
    public void buildBody() {
        vehicle.addPieces("body is built");
    }

    @Override
    public void insertWheels() {
        vehicle.addPieces("wheels is added");
    }

    @Override
    public void addHeadLights() {
        vehicle.addPieces("headLights is added");
    }

    @Override
    public void endBuildVehicle() {
        vehicle.addPieces("the built is finished");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
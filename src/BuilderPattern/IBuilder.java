package BuilderPattern;
//the builder interface has the methods we need to build the car
public interface IBuilder {

    void startBuildVehicle();
    void buildBody();
    void insertWheels();
    void addHeadLights();
    void endBuildVehicle();
    Vehicle getVehicle();

}

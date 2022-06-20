package CreationalPatterns.BuilderPattern;

/*
we can call the Director class by the controller it will control the construct or building steps
and give the final result
 */
public class Director {

    IBuilder builderVehicle;
    public void constructVehicle(IBuilder builderVehicle1)
    {
        this.builderVehicle = builderVehicle1;
        builderVehicle1.startBuildVehicle();
        builderVehicle1.buildBody();
        builderVehicle1.insertWheels();
        builderVehicle1.addHeadLights();
        builderVehicle1.endBuildVehicle();
    }
}

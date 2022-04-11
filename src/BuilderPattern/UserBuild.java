package BuilderPattern;
/*
this example will know from it the builder pattern it will build a car
and this car has pieces ,and we implement the concept of the pattern by this example
 */
public class UserBuild {
    public static void main(String[] args) {
        Director director = new Director();
        IBuilder build = new Car("Toyota");
        director.constructVehicle(build);
        Vehicle vehicle = build.getVehicle();
        vehicle.show();
    }
}

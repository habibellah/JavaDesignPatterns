package StructuralDesignPatterns.Adapter;
/*
this example is to wrap from the kilo meter to the Meter using the adapter pattern
 */
public class User {
    public static void main(String[] args) {
MeterAdapter m = new Adapter();
Meters ma = m.adaptToMeter(new KiloMeter());
//System.out.println(ma.getMeter());

        KiloMeter kiloMeter =  new KiloMeter();
        Adapter adapter = new Adapter();
       Meters meters = adapter.adaptToMeter(kiloMeter);
        System.out.println("the data in kilo meter before the adapt "+kiloMeter.getInKilo());
        System.out.println("the data in meter after the adapt "+meters.getMeter());


    }
}

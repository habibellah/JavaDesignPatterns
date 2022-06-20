package StructuralDesignPatterns.Adapter;

public class User {
    public static void main(String[] args) {

        Meters meters ;
        KiloMeter kiloMeter =  new KiloMeter();
        Adapter adapter = new Adapter();
        meters = adapter.adaptToMeter(kiloMeter);
        System.out.println("the data in kilo meter before the adapt "+kiloMeter.getInKilo());
        System.out.println("the data in meter after the adapt "+meters.getMeter());
    }
}

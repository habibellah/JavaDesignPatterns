package StructuralDesignPatterns.Adapter;
//the adapter implement MeterAdapter interface by the method adaptToMeter its job wrap from KIlo to Meter
public class Adapter implements MeterAdapter {
    @Override
    public Meters adaptToMeter(KiloMeter kiloMeter) {
        Meters meters = new Meters();
  meters.setMeter(convertToMeter(kiloMeter.getInKilo()));
        return meters;
    }
    private int convertToMeter(int KiloM)
    {
        return KiloM * 1000;
    }
}

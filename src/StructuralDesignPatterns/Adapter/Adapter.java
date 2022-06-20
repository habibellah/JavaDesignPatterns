package StructuralDesignPatterns.Adapter;

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

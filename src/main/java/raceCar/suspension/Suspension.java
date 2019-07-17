package raceCar.suspension;

public class Suspension {

    private double tyreFrictionCoefficient;
    private double tyrePressure;

    public Suspension() {
        tyreFrictionCoefficient = 0.8;
        tyrePressure = 2.3;
    }

    public double getTyreFrictionCoefficient() {
        return tyreFrictionCoefficient;
    }

    public double getTyrePressure() {
        return tyrePressure;
    }
}

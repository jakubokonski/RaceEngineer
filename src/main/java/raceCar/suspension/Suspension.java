package raceCar.suspension;

public class Suspension {

    private double tyreFriction;
    private double tyreRadius;

    public Suspension() {
        tyreFriction = 2.3;
        tyreRadius = 0.4;
    }

    public double getTyreFriction() {
        return tyreFriction;
    }

    public double getTyreRadius() {
        return tyreRadius;
    }
}

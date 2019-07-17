package raceCar.carBody;

public class Body {

    private int bodyWeight;
    private double aeroDragFactor;
    private double carBodySectionArea;

    /**
     * bodyWeight in kg
     * aeroDragFactor - no units
     * carBodySectionArea in sqm
     */
    public Body(int bodyWeight) {
        this.bodyWeight = bodyWeight;
        aeroDragFactor = 0.26;
        carBodySectionArea = 2.36;
    }

    public int getBodyWeight() {
        return bodyWeight;
    }

    public double getAeroDragFactor() {
        return aeroDragFactor;
    }

    public double getCarBodySectionArea() {
        return carBodySectionArea;
    }
}

package raceCar.carBody;

public class CarBody {

    private int bodyWeight;
    private double aeroDragFactor;
    private double carBodySectionArea;

    /**
     * bodyWeight in kg
     * aeroDragFactor - no units
     * carBodySectionArea in sqm
     * @param bodyWeight
     */
    public CarBody(int bodyWeight) {
        this.bodyWeight = bodyWeight;
        aeroDragFactor = 2.5;
        carBodySectionArea = 1.2;
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

package raceCar.gearbox;

public class GearBox {

    private double mainGearFactor;
    private double averageGearFactor;

    public GearBox() {
        this.mainGearFactor = 1;
        this.averageGearFactor = 4;
    }

    public double getMainGearFactor() {
        return mainGearFactor;
    }

    public void setMainGearFactor(double mainGearFactor) {
        this.mainGearFactor = mainGearFactor;
    }

    public double getAverageGearFactor() {
        return averageGearFactor;
    }

    public void setAverageGearFactor(double averageGearFactor) {
        this.averageGearFactor = averageGearFactor;
    }

    @Override
    public String toString() {
        return "GearBox{" +
                "mainGearFactor=" + mainGearFactor +
                ", averageGearFactor=" + averageGearFactor +
                '}';
    }
}

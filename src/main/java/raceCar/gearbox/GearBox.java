package raceCar.gearbox;

public class GearBox {

    private double mainGearFactor;
    private double averangeGearFactor;

    public GearBox() {
        this.mainGearFactor = 4;
        this.averangeGearFactor = 1;
    }

    public double getMainGearFactor() {
        return mainGearFactor;
    }

    public void setMainGearFactor(double mainGearFactor) {
        this.mainGearFactor = mainGearFactor;
    }

    public double getAverangeGearFactor() {
        return averangeGearFactor;
    }

    public void setAverangeGearFactor(double averangeGearFactor) {
        this.averangeGearFactor = averangeGearFactor;
    }
}

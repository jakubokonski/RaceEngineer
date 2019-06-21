package raceCar.carBody;

public class FuelTank {
    private int fuelTankCapacity;
    private int fuelAmount;
    private int fuelWeight;

    public FuelTank() {
        fuelTankCapacity = 20;
        fuelAmount = 0;
        fuelWeight = fuelAmount;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelWeight() {
        return fuelWeight;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount > fuelTankCapacity) {
            this.fuelAmount = fuelTankCapacity;
        } else {
            this.fuelAmount = fuelAmount;
        }
        this.fuelWeight = fuelAmount;
    }

    @Override
    public String toString() {
        return "FuelTank{" +
                "fuelTankCapacity=" + fuelTankCapacity +
                ", fuelAmount=" + fuelAmount +
                ", fuelWeight=" + fuelWeight +
                '}';
    }
}

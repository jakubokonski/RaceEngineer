package RaceCar.engine;

import RaceCar.RaceCar;
import RaceCar.engine.ECU;

import java.util.Random;

public class Engine {

    protected int ecu;
    private double fuelConsumption;
    private int power;
    private int basePower;
    private double tmpPower = 0;
    private double fuelMod;
    private Random fuelModRandom = new Random();
    private int heatGeneration;
    private Random random = new Random();

    public Engine() {
        ECU ecu = new ECU();
        fuelConsumption = 1.0;
        basePower = 500;
        power = basePower;
        int fuelModInt = fuelModRandom.nextInt(9) + 1;
        fuelMod = (double) fuelModInt / 10;
        heatGeneration = 1;
    }

    /**
     * Engine Control Unit can be set to 0, 1, 2 or 3.
     * Higher setting result in higher power output, higher fuel consumption and higher heat generation.
     * @return
     */
    public int getEcuSetting() {
        return ecu;
    }

    public void setEcu(int ecu) {
        if (ecu > 3) {
            System.out.println("Ecu Max value is 3");
            this.ecu = 3;
        } else {
            this.ecu = ecu;
        }
    }

    /**
     * ECU settings for power are basic, but it's working fine so far
     * @return
     */
    public int getPower() {
        if (ecu == 1) {
            power = basePower + 60;
        }
        if (this.ecu == 2) {
            power = basePower + 90;
        }
        if (this.ecu == 3) {
            power = basePower + 120;
        }
        if (ecu != 1 && ecu != 2 && ecu != 3){
            power = basePower;
        }
        return power;
    }

    /**
     * higher fuel consumption more fuel car has to carry to finish race (lap)
     * @return
     */
    public double getFuelConsumption() {
        fuelConsumption = fuelConsumption + (fuelConsumption * (ecu / 10)) + fuelMod;
        return fuelConsumption;
    }

    public double getFuelMod() {
        return fuelMod;
    }

    /**
     * Heat generation works fine so far.
     * @return
     */
    public int getHeatGeneration() {
        heatGeneration = (int) (power * 0.3 + (random.nextDouble() * 10));
        return heatGeneration;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "ECU=" + ecu +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", fuelMod=" + fuelMod +
                ", heatGeneration=" + heatGeneration +
                '}';
    }
}

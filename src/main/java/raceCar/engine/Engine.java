package raceCar.engine;

public class Engine {

    private int ecu;
    private double torque;
    private double baseTorque;
    private double fuelConsumption;
    private double rpm;
    private int heatGeneration;

    public Engine() {
        ECU ecu = new ECU();
        baseTorque = 490;
        torque = baseTorque;
        rpm = 30 * 2 * Math.PI;
        fuelConsumption = 1.0;
        heatGeneration = 1;
    }

    /**
     * Engine Control Unit can be set to 1, 2 or 3.
     * Higher setting result in higher torque output, higher fuel consumption and higher heat generation.
     * @return
     */
    public int getEcuSettings() {
        return ecu;
    }

    public void setEcu(int ecu) {
        if (ecu > 3) {
            System.out.println("Ecu Max value is 3");
            this.ecu = 3;
        } else if (ecu <= 0) {
            System.out.printf("ECU Min value is 1");
            this.ecu = 1;
        } else {
            this.ecu = ecu;
        }
    }

    /**
     * ECU settings for torque are basic, but it's working fine so far
     * @return
     */
    public double getTorque() {
        if (ecu == 1) {
            torque = baseTorque + 60;
        }
        if (this.ecu == 2) {
            torque = baseTorque + 90;
        }
        if (this.ecu == 3) {
            torque = baseTorque + 120;
        }
        if (ecu != 1 && ecu != 2 && ecu != 3){
            torque = baseTorque;
        }
        return torque;
    }

    public double getRpm() {
        return rpm;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getHeatGeneration() {
        return heatGeneration;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "ECU=" + ecu +
                ", Torque=" + torque +
                ", Fuel Consumption=" + fuelConsumption +
                ", Heat Generation=" + heatGeneration +
                '}';
    }
}

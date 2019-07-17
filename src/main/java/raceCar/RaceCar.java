package raceCar;

import raceCar.carBody.Body;
import raceCar.carBody.FuelTank;
import raceCar.engine.Engine;
import raceCar.gearbox.GearBox;
import raceCar.suspension.Suspension;

public class RaceCar {

    private Body body;
    private Engine engine;
    private GearBox gearBox;
    private FuelTank fuelTank;
    private Suspension suspension;
    private double velocity;

    public double getTotalMass() {
        return body.getBodyWeight() + fuelTank.getFuelWeight();
    }

    private RaceCar(Builder builder) {
        body = builder.body;
        engine = builder.engine;
        gearBox = builder.gearBox;
        fuelTank = builder.fuelTank;
        suspension = builder.suspension;
        velocity = 0;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "RaceCar{" +
                "body=" + body +
                ", engine=" + engine +
                ", gearBox=" + gearBox +
                ", fuelTank=" + fuelTank +
                ", suspension=" + suspension +
                '}';
    }

    public static class Builder {

        private Body body;
        private Engine engine;
        private GearBox gearBox;
        private FuelTank fuelTank;
        private Suspension suspension;

        public Builder() {
            this.body = body;
            this.engine = engine;
            this.gearBox = gearBox;
            this.fuelTank = fuelTank;
            this.suspension = suspension;
        }


        public Builder body (Body body) {
            this.body = body;
            return this;
        }

        public Builder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder gearBox(GearBox gearBox) {
            this.gearBox = gearBox;
            return this;
        }

        public Builder fuelTank(FuelTank fuelTank) {
            this.fuelTank = fuelTank;
            return this;
        }

        public Builder suspension(Suspension suspension) {
            this.suspension = suspension;
            return this;
        }

        public RaceCar build() {
            return new RaceCar(this);
        }
    }
}

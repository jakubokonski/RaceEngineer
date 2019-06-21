package raceCar;

import raceCar.carBody.CarBody;
import raceCar.carBody.FuelTank;
import raceCar.engine.Engine;
import raceCar.gearbox.GearBox;
import raceCar.suspension.Suspension;
import Track.Track;

public class RaceCar {

    private String carName;
    private CarBody carBody;
    private Engine engine;
    private GearBox gearBox;
    private FuelTank fuelTank;
    private Suspension suspension;
    long segmentSpeed;
    double topSpeed;

    /**
     * Top speed calculations working fine so far.
     * Use: body weight and engine power div by factor
     * @return
     */
    public double getTopSpeed() {
        topSpeed = engine.getTorque() / (carBody.getAeroDragFactor() + suspension.getTyreFriction());
        return topSpeed;
    }

    public long getSegmentSpeed(Track track) {
        for (int segment = 0; segment < track.getTrackSegments().size(); segment++) {
            track.getTrackSegments().get(segment).getCornering();
        }
        return segmentSpeed;
    }

    private RaceCar(Builder builder) {
        carName = builder.carName;
        carBody = builder.carBody;
        engine = builder.engine;
        gearBox = builder.gearBox;
        fuelTank = builder.fuelTank;
        suspension = builder.suspension;
    }

    public String getCarName() {
        return carName;
    }

    public CarBody getCarBody() {
        return carBody;
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

    @Override
    public String toString() {
        return "raceCar{" +
                "carName='" + carName + '\'' +
                ", engine=" + engine +
                ", fuelTank=" + fuelTank +
                ", suspension=" + suspension +
                '}';
    }

    public static class Builder {

        private String carName;
        private CarBody carBody;
        private Engine engine;
        private GearBox gearBox;
        private FuelTank fuelTank;
        private Suspension suspension;

        public Builder() {
            this.carName = carName;
            this.carBody = carBody;
            this.engine = engine;
            this.gearBox = gearBox;
            this.fuelTank = fuelTank;
            this.suspension = suspension;
        }

        public Builder carName (String carName) {
            this.carName = carName;
            return this;
        }

        public Builder carbody (CarBody carBody) {
            this.carBody = carBody;
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

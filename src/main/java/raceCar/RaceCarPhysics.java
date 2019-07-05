package raceCar;

public class RaceCarPhysics {

    /**
     * calculate:
     * wheel momentum: torque * mainGearFactor * avgGearFactor
     * motion forces
     * drag forces
     * acceleration: (motion forces - drag forces) / racecar mass
     * top speed
     *
     */

    static double wheelMomentum;

    public static double getWheelMomentum(RaceCar raceCar) {
        wheelMomentum = raceCar.getEngine().getTorque() * raceCar.getGearBox().getMainGearFactor();
        return wheelMomentum;
    }

}

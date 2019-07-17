package raceCar.mechanics;

import raceCar.RaceCar;

public class Physics {

    /**
     * calculate:
     * wheel momentum: torque * mainGearFactor * avgGearFactor
     * motion forces
     * aero drag
     * wheel friction
     * acceleration: (motion forces - (aero drag + wheel friction) / racecar mass
     * top speed
     *
     */

    public static double wheelMomentum(RaceCar raceCar) {
        return raceCar.getEngine().getTorque() * raceCar.getGearBox().getMainGearFactor() * raceCar.getGearBox().getAverageGearFactor();
    }

    private static double tyreFrictionCoefficientCalculated(RaceCar raceCar) {
        return 0.005 + (1/raceCar.getSuspension().getTyrePressure()) * (0.01 + 0.0095 * Math.pow(raceCar.getVelocity() / 100, 2));
    }

    private static double tyreFriction(RaceCar raceCar) {
        return raceCar.getTotalMass() * tyreFrictionCoefficientCalculated(raceCar) * 9.81;
    }

    public static double aeroDrag(RaceCar raceCar) {
        double airDensity = 1.25;
        return 0.5 * raceCar.getBody().getAeroDragFactor() * airDensity * raceCar.getBody().getCarBodySectionArea() * Math.pow(raceCar.getVelocity(), 2);
    }


    public static double accelerationRate(RaceCar raceCar) {
        return ((wheelMomentum(raceCar) - (aeroDrag(raceCar) + tyreFriction(raceCar))) / raceCar.getTotalMass());
    }

    public static double topSpeed(RaceCar raceCar) {
        double topSpeed = 0;

        for (double vel = 0.1; accelerationRate(raceCar) > 0 ; vel++) {
            raceCar.setVelocity(vel);
            accelerationRate(raceCar);
            topSpeed = vel * 3.6;
        }
        return topSpeed;
    }

}

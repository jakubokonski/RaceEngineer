import raceCar.RaceCar;
import raceCar.engine.Engine;
import raceCar.carBody.FuelTank;
import raceCar.gearbox.GearBox;
import raceCar.suspension.Suspension;
import raceCar.carBody.Body;
import track.*;

import static raceCar.mechanics.Physics.*;

public class Main {
    public static void main(String[] args) {

        Engine fw01engine = new Engine();
        GearBox fw01gearbox = new GearBox();
        Body fw01Body = new Body(800);
        FuelTank fw01fuelTank = new FuelTank();
        Suspension fw01suspension = new Suspension();

        RaceCar williams = new RaceCar.Builder()
                .engine(fw01engine)
                .gearBox(fw01gearbox)
                .body(fw01Body)
                .fuelTank(fw01fuelTank)
                .suspension(fw01suspension)
                .build();


        Track trackDummy = new Track();
        trackDummy.addSegment(new TrackSegment(10));
        trackDummy.addSegment(new TrackSegment(5));
        trackDummy.addSegment(new TrackSegment(10));
        trackDummy.addSegment(new TrackSegment(5));


        williams.getEngine().setEcu(1);
        williams.getFuelTank().setFuelAmount(20);
        System.out.println("Torque: " + williams.getEngine().getTorque() + "Nm");
        System.out.println("GearBox main ratio: " + williams.getGearBox().getMainGearFactor());
        System.out.println("GearBox average ratio: " + williams.getGearBox().getAverageGearFactor());
        System.out.println("Car total mass: " + williams.getTotalMass() + "kg");
        System.out.println("Tyre friction: " + williams.getSuspension().getTyreFrictionCoefficient());
        System.out.println(" ");
        System.out.println("Wheel Momentum: " + wheelMomentum(williams));
        System.out.println("Acceleration Rate: " + accelerationRate(williams));
        System.out.println("\n");
        System.out.println("Top Speed: " + topSpeed(williams) + "km/h");
        System.out.println("Aero drag: " + aeroDrag(williams));


    }
}

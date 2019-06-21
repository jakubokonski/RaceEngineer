import raceCar.RaceCar;
import raceCar.engine.Engine;
import raceCar.carBody.FuelTank;
import raceCar.gearbox.GearBox;
import raceCar.suspension.Suspension;
import raceCar.carBody.CarBody;
import Track.Track;
import Track.TrackSegment;

import static raceCar.RaceCarPhysics.getWheelMomentum;

public class Main {
    public static void main(String[] args) {

        Engine fw01engine = new Engine();
        GearBox fw01gearbox = new GearBox();
        CarBody fw01Body = new CarBody(800);
        FuelTank fw01fuelTank = new FuelTank();
        Suspension fw01suspension = new Suspension();

        RaceCar williams = new RaceCar.Builder()
                .carName("fw01")
                .engine(fw01engine)
                .gearBox(fw01gearbox)
                .carbody(fw01Body)
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
        System.out.println("ECU: " + williams.getEngine().getEcuSettings());
        System.out.println("Body Weight: " + williams.getCarBody().getBodyWeight());
        System.out.println("Fuel: " + williams.getFuelTank().getFuelAmount());
        System.out.println("Fuel Tank weitght: " + williams.getFuelTank().getFuelWeight());
        System.out.println("Power: " + williams.getEngine().getTorque());
        System.out.println("raceCar top speed: " + williams.getTopSpeed());
        System.out.println("Heat generation: " + williams.getEngine().getHeatGeneration());

        System.out.println("Wheel Momentum: " + getWheelMomentum(williams));

    }
}

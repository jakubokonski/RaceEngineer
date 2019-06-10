import RaceCar.engine.Engine;
import RaceCar.FuelTank;
import RaceCar.RaceCar;
import RaceCar.suspension.Suspension;
import RaceCar.CarBody;
import Track.TrackDummy;
import Track.TrackSegment;

public class Main {
    public static void main(String[] args) {

        Engine fw01engine = new Engine();
        CarBody fw01Body = new CarBody(800);
        FuelTank fw01fuelTank = new FuelTank();
        Suspension fw01suspension = new Suspension();

        RaceCar williams = new RaceCar.Builder()
                .carName("fw01")
                .engine(fw01engine)
                .carbody(fw01Body)
                .fuelTank(fw01fuelTank)
                .suspension(fw01suspension)
                .build();


        TrackDummy trackDummy = new TrackDummy();
        trackDummy.addSegment(new TrackSegment(10));
        trackDummy.addSegment(new TrackSegment(5));
        trackDummy.addSegment(new TrackSegment(10));
        trackDummy.addSegment(new TrackSegment(5));


        williams.getEngine().setEcu(1);
        williams.getFuelTank().setFuelAmount(20);
        System.out.println("ECU: " + williams.getEngine().getEcuSetting());
        System.out.println("Body Weight: " + williams.getCarBody().getBodyWeight());
        System.out.println("Fuel: " + williams.getFuelTank().getFuelAmount());
        System.out.println("Fuel Tank weitght: " + williams.getFuelTank().getFuelWeight());
        System.out.println("Power: " + williams.getEngine().getPower());
        System.out.println("RaceCar top speed: " + williams.getTopSpeed());
        System.out.println("Heat generation: " + williams.getEngine().getHeatGeneration());

    }
}

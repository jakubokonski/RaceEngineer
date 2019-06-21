import raceCar.*;
import raceCar.carBody.CarBody;
import raceCar.carBody.FuelTank;
import raceCar.engine.Engine;
import raceCar.suspension.Suspension;
import Track.*;


public class SimpleRace {
    public static void main(String[] args) {

        RaceCar sr01 = new RaceCar.Builder()
                .carName("sr01")
                .carbody(new CarBody(200))
                .engine(new Engine())
                .fuelTank(new FuelTank())
                .suspension(new Suspension())
                .build();

        Track spain = new Track();
        spain.addSegment(new TrackSegment(10));
        spain.addSegment(new TrackSegment(5));
        spain.addSegment(new TrackSegment(10));
        spain.addSegment(new TrackSegment(5));

//        System.out.println("Lap time: " + spain.getLapTime(sr01));
    }
}

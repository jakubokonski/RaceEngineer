package raceCar;


import raceCar.carBody.CarBody;
import raceCar.carBody.FuelTank;
import raceCar.suspension.Suspension;
import org.junit.Test;

public class RaceCarTest {

    RaceCar wt01 = new RaceCar.Builder()
            .carName("wt01")
            .carbody(new CarBody(100))
            .suspension(new Suspension())
            .fuelTank(new FuelTank())
            .build();
    @Test
    public void engineTest() {
        wt01.getEngine().getTorque();
    }
}
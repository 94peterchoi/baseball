import java.util.ArrayList;
import java.util.List;

public class RacingCar {

    private List<Car> cars = new ArrayList<>();

    public void makePlayers(String carNames) {

        String[] carNameList = carNames.split(",");

        for (String carName : carNameList) {
            cars.add(new Car(carName));
        }




    }
}

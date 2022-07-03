import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCar {

    public List<Car> makePlayers(String carNames) {
        String[] strCarNames = carNames.split(",");

        List<String> carNameList = new ArrayList<>();
        for (String carName : strCarNames) {
            carNameList.add(carName.trim());
        }

        carNameList = carNameList.stream().distinct().collect(Collectors.toList()); // 중복 제거

        List<Car> cars = new ArrayList<>();
        for (String carName : carNameList) {
            cars.add(new Car(carName));
        }

        return cars;
    }
}

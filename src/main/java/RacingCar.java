import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCar {

    public List<Car> makePlayers(String carNames) {
        String[] carArr = carNames.split(",");

        List<String> carNameList = new ArrayList<>();
        for (String carName : carArr) {
            carNameList.add(carName.trim());
        }

        carNameList = carNameList.stream().distinct().collect(Collectors.toList()); // 중복 제거

        List<Car> cars = new ArrayList<>();
        for (String carName : carNameList) {
            cars.add(new Car(carName));
        }

        return cars;
    }


    public List<Car> getWinnerList(List<Car> players) {
        Position winningPos = new Position(0);

        for (Car player : players) {
            Position playerPos = player.getPosition();
            if (playerPos.compareTo(winningPos) > 0) {
                winningPos = playerPos;
            }
        }

        Position finalWinningPos = winningPos;
        return players.stream().filter((player) -> player.getPosition().equals(finalWinningPos)).collect(Collectors.toList());
    }

    public void play(List<Car> players, int round) {
        for (int i=0; i<round; i++) {
            players.forEach((player) -> player.race());
        }
    }

    public void printWinners(List<Car> winners) {
        System.out.print("우승자는 ");
        winners.forEach((winner) -> {
            System.out.print(winner.toString() + ",");
        });
        System.out.print("입니다.");
    }

}

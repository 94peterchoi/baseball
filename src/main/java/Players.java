import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Players {

    private List<Car> playerList;

    public Players(List<Car> playerList) {
        this.playerList = playerList;
    }

    public List<Car> getPlayerList() {
        return playerList;
    }

    public static List<Car> makeCars(String carNames) {
        List<Car> cars = new ArrayList<>();
        String[] carList = carNames.split(",");
        for (String carName : carList) {
            cars.add(new Car(carName, 1));
        }
        return cars;
    }

    public void sortByPosition() {
        Collections.sort(this.playerList);
    }

    public List<Car> getWinnerList(int winnerPosition) {
        return this.playerList.stream().filter((player) ->
            player.getCurrentPosition() == winnerPosition
        ).collect(Collectors.toList());
    }





}

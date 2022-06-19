import java.util.List;

public class App {
    public static void main(String[] args) {

        InputView inputView = new InputView();

        List<Car> cars = inputView.getCarNames();
        int totalRound = inputView.decideTotalRound();

        for (int i = 0; i < totalRound; i++) {
            cars.stream().forEach(car -> car.playRound());
            ResultView.printResultOfEachRound(cars);
        }

        Players players = new Players(cars);
        players.sortByPosition();

        ResultView.printWinnerList(players.getWinnerList(cars.get(0).getPosition()));

    }
}

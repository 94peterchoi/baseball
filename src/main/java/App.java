import java.util.List;

public class App {
    public static void main(String[] args) {
        RacingCar racingCar = new RacingCar();
        InputView inputView = new InputView();

        List<Car> players = racingCar.makePlayers(inputView.getCarNames());
        int roundTotal = inputView.getRoundTotal();

        racingCar.play(players, roundTotal);

        List<Car> winners = racingCar.getWinnerList(players);
        racingCar.printWinners(winners);
    }
}

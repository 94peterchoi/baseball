import java.util.List;

public class App {
    public static void main(String[] args) {
        RacingCar racingCar = new RacingCar();

        List<Car> players = racingCar.makePlayers(InputView.getCarNames());
        int roundTotal = InputView.getRoundTotal();

        racingCar.play(players, roundTotal);

        List<Car> winners = racingCar.getWinnerList(players);
        ResultView.printWinners(winners);
    }
}

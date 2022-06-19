import java.util.List;

public class App {
    public static void main(String[] args) {

        InputView inputView = new InputView();

        Players players = new Players(inputView.getCarNames());
        List<Car> playerCars = players.getPlayerList();
        int totalRound = inputView.decideTotalRound();

        for (int i = 0; i < totalRound; i++) {
            playerCars.forEach(Car::playRound);
            ResultView.printResultOfEachRound(playerCars);
        }

        players.sortByPosition();
        ResultView.printWinnerList(players.getWinnerList(playerCars.get(0).getCurrentPosition()));
    }
}

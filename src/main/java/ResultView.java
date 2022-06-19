import java.util.List;

public class ResultView {

    public static void printResultOfEachRound(List<Car> cars) {
        cars.forEach(car -> {
            System.out.print(car.getName() + ": ");
            for(int i = 0; i < car.getCurrentPosition(); i++) {
                System.out.print("-");
            }
            System.out.println();
        });
        System.out.println();
    }

    public static void printWinnerList(List<Car> winnerList) {
        System.out.println("우승자는");
        winnerList.forEach(winner -> System.out.println(winner.getName()));
    }

}

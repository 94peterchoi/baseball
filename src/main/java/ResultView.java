import java.util.List;

public class ResultView {

    public static void printWinners(List<Car> winners) {
        System.out.print("우승자는 ");
        winners.forEach(winner -> System.out.print(winner.toString() + ","));
        System.out.print("입니다.");
    }

    public static void printRacing(String car, int distance) {
        System.out.print(car + ":");
        for (int i=0; i<distance; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

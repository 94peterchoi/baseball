import java.util.List;
import java.util.Scanner;

public class InputView {

    private final int MIN_ROUND = 0;
    Scanner scanner = new Scanner(System.in);

    public List<Car> getCarNames() {
        System.out.println("[자동차 이름 입력]");
        String carNames = scanner.nextLine();
        return Players.makeCars(carNames);
    }

    public int decideTotalRound() {
        System.out.println("토탈라운드 입력");
        int totalRound = scanner.nextInt();
        if (totalRound <= MIN_ROUND) {
            throw new IllegalArgumentException("라운드의 수는 0보다 커야 합니다.");
        }
        return totalRound;
    }

}

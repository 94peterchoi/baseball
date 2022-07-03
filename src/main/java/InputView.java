import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public void getCarNames() {
        System.out.println("경기에 내보낼 자동차 입력을 입력하세요(최소 한 개 이상)");
        String carNames = scanner.nextLine();
    }


}

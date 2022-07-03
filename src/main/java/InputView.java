import java.util.Scanner;

public class InputView {

    static Scanner scanner = new Scanner(System.in);

    public static String getCarNames() {
        System.out.println("경기에 내보낼 자동차를 입력하세요(최소 한 개 이상)");
        return scanner.nextLine();
    }

    public static int getRoundTotal() {
        System.out.println("경기할 라운드를 입력하세요.");
        int roundTotal = scanner.nextInt();
        if (roundTotal < 1) {
            throw new IllegalArgumentException("라운드는 1보다 크게 입력하세요.");
        }
        return roundTotal;
    }

}

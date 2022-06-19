import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.startGame();

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String playerDecision = scanner.nextLine();

            if (playerDecision.trim().equals("1")) {
                computer.startGame();
            }
            if (playerDecision.trim().equals("2")) {
                computer.endGame();
            }
        }

    }



}

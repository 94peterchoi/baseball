import java.util.Scanner;

public class Computer {

    private Score score;

    public Computer() {
        this.score = new Score();
    }

    public void startGame() {
        Baseball baseball = new Baseball();

        while(true) {
            String input = getUserInput();
            String feedback = compare(input, baseball).getScoreResult();
            if (feedback.contains("게임 종료")) {
                break;
            }
        }
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요: ");
        return scanner.nextLine();
    }

    private Score compare(String userInput, Baseball baseball) {

        Score score = new Score();
        String baseballNumber = baseball.getStrNumber();

        // checkStrike
        for (int i = 0; i < 3; i++) {
            if (userInput.charAt(i) == baseballNumber.charAt(i)) {
                score.increaseStrike();

                userInput = userInput.replace(userInput.substring(i, i+1), "");
                baseballNumber = baseballNumber.replace(baseballNumber.substring(i, i+1), "");
            }
        }

        // checkBall
        for (int i = 0; i < userInput.length(); i++) {
            if (baseballNumber.contains(userInput.substring(i, i+1))) {
                score.increaseBall();

                userInput = userInput.replace(userInput.substring(i, i+1), "");
                baseballNumber = baseballNumber.replace(baseballNumber.substring(i, i+1), "");
            }
        }

        return score;
    }

    private void checkStrikeCount() {

    }




    public void endGame() {
        System.out.println("게임을 종료합니다.");
        System.exit(0);
    }







}

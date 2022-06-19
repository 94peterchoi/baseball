import java.util.HashSet;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Computer {

    public void startGame() {
        Baseball baseball = new Baseball();

        while(true) {
            String input = "";
            try {
                input = getPlayerNumber();
            } catch (InputMismatchException ime) {
                System.out.println(ime.getMessage());
                continue;
            }

            String feedback = compare(input, baseball.getStrNumber()).getScoreResult();
            System.out.println(feedback);

            if (feedback.contains("게임 종료")) {
                break;
            }
        }
    }

    public String getPlayerNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요: ");
        String input = scanner.nextLine();

        validationCheck(input);

        return input;
    }

    public void validationCheck(String number) {
        if (number.length() > 3) {
            throw new InputMismatchException("3자리가 넘습니다. 다시 입력하세요.");
        }

        HashSet<Character> numberSet = new HashSet<>();

        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i)) || number.charAt(i) == '0') {
                throw new InputMismatchException("0을 제외한 숫자만 입력해주세요.");
            }
            numberSet.add(number.charAt(i));
        }

        if (numberSet.size() < 3) {
            throw new InputMismatchException("중복없이 세 자리 숫자를 입력해주세요.");
        }

    }

    public Score compare(String userInput, String baseballNumber) {
        Score score = new Score();

        // checkStrikeCount
        for (int i = 0; i < 3; i++) {
            if (userInput.charAt(i) == baseballNumber.charAt(i)) {
                score.increaseStrike();
            }
        }

        // checkBallCount
        for (int i = 0; i < 3; i++) {
            if (userInput.charAt(i) == baseballNumber.charAt(i)) {
                continue;
            }
            if (baseballNumber.contains(userInput.substring(i, i + 1))) {
                score.increaseBall();
            }
        }

        return score;
    }

    public void endGame() {
        System.out.println("야구게임을 종료합니다.");
        System.exit(0);
    }

}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void startGame() {
    }

    @Test
    void getPlayerNumber() {
    }

    @Test
    void validationCheck() {
    }

    @Test
    void endGame() {
    }

    @ParameterizedTest
    @ValueSource(strings = {"123"})
    void compare(String userInput) {
        Baseball baseball = new Baseball();
        Computer computer = new Computer();

        baseball.setStrNumber("135");

        Score score = computer.compare(userInput, baseball.getStrNumber());

        assertEquals(score.strikeCnt, 1);
        assertEquals(score.ballCnt, 2);
    }
}
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class BallNumberValidationTest {

    @Test
    void 볼넘버_1부터_9까지_검사() {
        assertThatThrownBy(() -> {
            new Ball(0);
        }).hasMessageContaining("유효하지 않은 숫자");

        assertThatThrownBy(() -> {
            new Ball(10);
        }).hasMessageContaining("유효하지 않은 숫자");
    }

}

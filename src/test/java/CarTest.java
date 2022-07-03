import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_이름_입력() {
        RacingCar racingCar = new RacingCar();

        assertThatThrownBy(() -> {
            racingCar.makePlayers("");
        }).hasMessageContaining("최소 하나");

        racingCar.makePlayers("ab,");


    }

}

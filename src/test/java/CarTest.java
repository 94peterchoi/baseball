import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_이름_입력() {
        RacingCar racingCar = new RacingCar();

        assertThatThrownBy(() -> {
            racingCar.makePlayers("");
        }).hasMessageContaining("최소 하나");

        assertThatThrownBy(() -> {
            racingCar.makePlayers("abcdef");
        }).hasMessageContaining("5자");

        List<Car> cars = racingCar.makePlayers("ab,");
        assertThat(cars.size()).isEqualTo(1);
        assertThat(cars.get(0).toString()).isEqualTo("ab");

        cars = racingCar.makePlayers("ab, ab");
        assertThat(cars.size()).isEqualTo(1);
        assertThat(cars.get(0).toString()).isEqualTo("ab");
    }

}

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FuelTest {

    @Test
    void 연료주입량_확인() {

        int distance = 450; // 이동거리

        Car sonata = new Sonata();
        double sonataFuel = sonata.calcFuel(distance);
        double expected = 45.0;

        assertThat(sonataFuel).isEqualTo(expected);

        Car avante = new Avante();
        double avanteFuel = avante.calcFuel(distance);
        expected = 30.0;
        assertThat(avanteFuel).isEqualTo(expected);

    }

}

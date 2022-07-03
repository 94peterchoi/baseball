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

    @Test
    void 자동차_이동_테스트() {
        Car car = new Car("abc");
        Position pos = car.getPosition();

        assertThat(pos.equals(new Position(0))).isEqualTo(true);

        car.race(4);
        pos = car.getPosition();
        assertThat(pos.equals(new Position(1))).isEqualTo(true);

        car.race(3);
        pos = car.getPosition();
        assertThat(pos).isEqualTo(new Position(1));

        car.race(9);
        pos = car.getPosition();
        assertThat(pos).isNotEqualTo(new Position(99));
    }

    @Test
    void 자동차경주_우승자_구하기() {
        RacingCar racingCar = new RacingCar();
        List<Car> players = racingCar.makePlayers("다비, 상욱");

        players.get(0).race(9);
        players.get(1).race(0);

        List<Car> winnerList = racingCar.getWinnerList(players);
        assertThat(winnerList.size()).isEqualTo(1);
        assertThat(winnerList.get(0).toString()).isEqualTo("다비");

        players.get(0).race(0);
        players.get(1).race(9);

        winnerList = racingCar.getWinnerList(players);
        assertThat(winnerList.size()).isEqualTo(2);
        assertThat(winnerList.get(0).toString()).isEqualTo("다비");
        assertThat(winnerList.get(1).toString()).isEqualTo("상욱");
    }


}

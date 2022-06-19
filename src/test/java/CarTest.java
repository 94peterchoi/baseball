import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class CarTest {

    @Test
    void 자동차이름_분리() {
        String carNames = "pobi,crong,honux".trim();
        String[] carNameList = new String[]{"pobi", "crong", "honux"};

        assertThat(carNames.split(",")).isEqualTo(carNameList);
    }

    @Test
    void 자동차이름_유효성() {
        assertThatThrownBy(() -> {
            Car car = new Car("abcdef", 0);
        }).hasMessageContaining("초과");
    }

    // 빈문자열 유효성 + 중복이름 유효성

    @Test
    void 경주_전진_or_스톱() {
        Car car = new Car("fox", 0);
        int originalPosition = car.getPosition();
        car.playRound();
        int newPosition = car.getPosition();

        assertThat(newPosition).isGreaterThanOrEqualTo(originalPosition);
    }


    @Test
    void 순위_선정() {
        List<Car> playerList = new ArrayList<>();

        playerList.add(new Car("a", 1));
        playerList.add(new Car("b", 2));
        playerList.add(new Car("c", 3));

        Players players = new Players(playerList);

        assertThat(players.getWinnerList(3).get(0).getName()).isEqualTo("c");
    }


}

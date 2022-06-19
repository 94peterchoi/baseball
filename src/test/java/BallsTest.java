import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BallsTest {

    @Test
    void 스트라이크_개수_체크() {

        Ball ball1 = new Ball(1);
        Ball ball2 = new Ball(2);
        Ball ball3 = new Ball(3);

        List<Ball> balls = new ArrayList<>();
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);

        Computer computer = new Computer(balls);
        assertThat(computer.getStrikeCnt()).isEqualTo(3);
    }

    @Test
    void 볼_개수_체크() {

        Ball ball1 = new Ball(3);
        Ball ball2 = new Ball(4);
        Ball ball3 = new Ball(5);

        List<Ball> balls = new ArrayList<>();
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);

        Computer computer = new Computer(balls);

        assertThat(computer.getBallCnt()).isEqualTo(1);
    }



}

import java.util.ArrayList;
import java.util.List;

public class Computer {

    List<Ball> userBalls;
    List<Ball> computerBalls = new ArrayList<>();

    public Computer(List<Ball> balls) {
        userBalls = balls;
        computerBalls.add(new Ball(1));
        computerBalls.add(new Ball(2));
        computerBalls.add(new Ball(3));
    }

    public int getStrikeCnt() {
        int strikeCnt = 0;
        for (int i = 0; i < userBalls.size(); i++) {
            if (userBalls.get(i).isStrike(computerBalls.get(i).getNo()).isStrike()) {
                strikeCnt++;
            }
        }
        return strikeCnt;
    }

    public int getBallCnt() {
        int ballCnt = 0;



        return ballCnt;
    }


}

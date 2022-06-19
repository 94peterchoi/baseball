public class Ball {

    private final int MIN_NO = 1;
    private final int MAX_NO = 9;

    int no;

    public Ball(int no) {
        if (no < MIN_NO || no > MAX_NO) {
            throw new IllegalArgumentException("유효하지 않은 숫자");
        }
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        return this.no == ball.no;
    }

    public BallStatus isStrike(int compareNo) {
        if (this.no == compareNo) {
            return BallStatus.STRIKE;
        }
        return null;
    }

    public BallStatus isBall(int compareNo, int index) {
        if (this.no == compareNo) {
            return BallStatus.BALL;
        }
        return null;
    }


}

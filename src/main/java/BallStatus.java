public enum BallStatus {
    STRIKE,
    BALL;

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }

}

public class Score {
    public int strikeCnt;
    public int ballCnt;

    public String getScoreResult() {
        String scoreMessage = "";

        if (strikeCnt == 0 && ballCnt == 0) {
            return scoreMessage + "낫띵";
        }
        if (strikeCnt == 3) {
            return scoreMessage + "3개의 숫자를 모두 맞히셨습니다. 게임 종료";
        }
        if (strikeCnt > 0) {
            scoreMessage += "스트라이크: " + strikeCnt + "\n";
        }
        if (ballCnt > 0) {
            scoreMessage += "볼: " + ballCnt + "\n";
        }
        return scoreMessage;
    }

    public void increaseStrike() {
        this.strikeCnt++;
    }

    public void increaseBall() {
        this.ballCnt++;
    }

}

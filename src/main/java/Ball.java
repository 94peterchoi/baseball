public class Ball {

    private final int MIN_NO = 1;
    private final int MAX_NO = 9;

    int no;

    public Ball (int userNo) {
        if (userNo < MIN_NO || userNo > MAX_NO ) {
            throw new IllegalArgumentException("유효하지 않은 숫자");
        }
        this.no = userNo;
    }

}

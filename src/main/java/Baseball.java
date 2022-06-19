public class Baseball {
    public String strNumber;
    int[] numDeck = new int[]{1,2,3,4,5,6,7,8,9};

    public Baseball() {
        strNumber = createRandomNumber();
    }

    private String createRandomNumber() {
        // 3자리 서로 다른 랜덤넘버
        shuffleDeck();
        return "" + numDeck[0] + numDeck[1] + numDeck[2];
    }

    private void shuffleDeck() {
        for (int i = 0; i < 20; i++) {
            int tmp;
            int randomNum = (int) (Math.random() * 9);

            tmp = numDeck[0];
            numDeck[0] = numDeck[randomNum];
            numDeck[randomNum] = tmp;
        }
    }

    public String getStrNumber() {
        return strNumber;
    }

    public void setStrNumber(String strNumber) {
        this.strNumber = strNumber;
    }
}

public class Car implements Comparable<Car> {

    final int GO_CRITERIA = 4;
    final int MAX_CAR_NAME_LENGTH = 5;
    final int START_POSITION = 1;

    String name = "";
    int currentPosition;

    public Car(String name, int startPosition) {
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
        if (startPosition != START_POSITION) {
            throw new IllegalArgumentException("자동차 출발선은 1에 있어야 합니다.");
        }
        this.name = name;
        this.currentPosition = startPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public int makeRandomNumber() {
        return (int) (Math.random() * 8) + 1;
    }

    public void playRound() {
        int number = makeRandomNumber();
        if (number >= GO_CRITERIA) {
            this.setCurrentPosition(this.getCurrentPosition() + 1);
        }
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(car.getCurrentPosition(), this.getCurrentPosition());
    }
}

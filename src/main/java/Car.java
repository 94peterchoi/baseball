public class Car implements Comparable<Car> {

    String name = "";
    int position = 0;
    final int criteria = 4;

    public Car(String name, int position) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
        this.name = name;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int makeRandomNumber() {
        return (int) (Math.random() * 8) + 1;
    }

    public void playRound() {
        int number = makeRandomNumber();
        if (number >= this.criteria) {
            this.position++;
        }
    }

    @Override
    public int compareTo(Car car) {
        if (this.getPosition() < car.getPosition()) {
            return 1;
        }
        if (this.getPosition() > car.getPosition()) {
            return -1;
        }
        return 0;
    }
}

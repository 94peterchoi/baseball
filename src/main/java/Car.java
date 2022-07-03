public class Car {

    private final int START_POS = 0;

    Name name;
    Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(START_POS);
    }

    public Position getPosition() {
        return position;
    }

    public void race() {
        if (getRamdomNo() >= 4) {
            this.position = position.move();
        }
        ResultView.printRacing(name.toString(), position.position);
    }

    public void race(int no) {
        if (no >= 4) {
            this.position = position.move();
        }
    }

    private int getRamdomNo() {
        return (int) (Math.random() * 10);
    }

    @Override
    public String toString() {
        return name.toString();
    }


}
